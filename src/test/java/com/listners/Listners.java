package com.listners;

import org.omg.CORBA.portable.InvokeHandler;
import org.testng.IInvokedMethod;
import org.testng.IInvokedMethodListener;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.jsonreader.ParseJSON;
import com.relevantcodes.extentreports.ExtentReports;
import com.reporting.ExtentReport;

public class Listners implements ITestListener,IInvokedMethodListener{
	
	public static String crntTestCaseName;
	ExtentReport extent;
	@Override
	public void afterInvocation(IInvokedMethod arg0, ITestResult arg1) {
		// TODO Auto-generated method stub
		System.out.println("in afterInvocation");
		System.out.println(arg1.getName());
		extent.endTest();
		
	}

	@Override
	public void beforeInvocation(IInvokedMethod arg0, ITestResult arg1) {
				
				crntTestCaseName=arg1.getName();
				extent.startTestReport(crntTestCaseName);
		
	}

	@Override
	public void onFinish(ITestContext arg0) {
		// TODO Auto-generated method stub
		System.out.println("in onFinish");
		extent.flushReport();
		
	}

	@Override
	public void onStart(ITestContext arg0) {
		// TODO Auto-generated method stub
		ParseJSON json=new ParseJSON();
		json.parseJSONfile();
		 extent=new ExtentReport();
		extent.initReport();
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub
		System.out.println("in onTestFailedButWithinSuccessPercentage");
		
	}

	@Override
	public void onTestFailure(ITestResult arg0) {
		// TODO Auto-generated method stub
		System.out.println("in onTestFailure");
	}

	@Override
	public void onTestSkipped(ITestResult arg0) {
		// TODO Auto-generated method stub
		System.out.println("in onTestSkipped");
	}

	@Override
	public void onTestStart(ITestResult obj) {
		System.out.println("in onTestStart");
		
	}

	@Override
	public void onTestSuccess(ITestResult arg0) {
		// TODO Auto-generated method stub
		System.out.println("in onTestSuccess");
		
	}

	
}
