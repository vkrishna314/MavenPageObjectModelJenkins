package com.reporting;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.commonutils.CommonUtlities;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import fakermethods.FakerMethods;

public class ExtentReport extends FakerMethods{

	public static ExtentReports extent;
	public static ExtentTest test;
	
	
	/**
	 * @ Method Name: Intialize Test Report
	 * @return
	 */
	
	public static void initReport()
	{
		System.out.println("Intializing Report.....");
		extent=new ExtentReports(createResultFolder()+"\\Test Summary Report.html");
		
		extent.addSystemInfo("Sprint #","Sprint 1")
		.addSystemInfo("Environment","QA");
		
		System.out.println("Report intialization completed");
	}
	
	/***
	 * @ Method Name:Start Test Report
	 * @return
	 */
	public static void startTestReport(String testcasename)
	{
		test=extent.startTest(testcasename);
	}
	
	/**
	 * @Method Name:End Test
	 * @return
	 */
	public static void endTest()
	{
		extent.endTest(test);
	}
	
	/**
	 * @Method Name:Publish Report
	 * @return
	 */
	public static void flushReport()
	{
		extent.flush();
		extent.close();
	}
	/**
	 * @Method Name:LogStatus
	 * @return
	 */
	public static void LogStatus(String status,String description)
	{
		switch (status.toLowerCase()) {
		case "pass":
			test.log(com.relevantcodes.extentreports.LogStatus.PASS, description+test.addBase64ScreenShot(getScreenShot()));
			break;
		case "fail":
			test.log(com.relevantcodes.extentreports.LogStatus.FAIL, description+test.addBase64ScreenShot(getScreenShot()));
			break;
		case "warning":
			test.log(com.relevantcodes.extentreports.LogStatus.WARNING, description+test.addBase64ScreenShot(getScreenShot()));
			break;
		case "fatal":
			test.log(com.relevantcodes.extentreports.LogStatus.FATAL, description+test.addBase64ScreenShot(getScreenShot()));
			break;

		default:
			break;
		}
	}

	public static String createResultFolder() {
		SimpleDateFormat sdf = new SimpleDateFormat("MMM-dd-yyy");

		Date date = new Date();

		String filepath = System.getProperty("user.dir") + "\\Results\\" + sdf.format(date);

		File file = new File(filepath);

		if (!file.exists()) {
			file.mkdirs();
		}

		return filepath;
	}
	
	public static String getScreenShot()
	{
		String scnShot = ((TakesScreenshot) CommonUtlities.driver).getScreenshotAs(OutputType.BASE64);
		return "data:image/png;base64,"+scnShot;
	}

}
