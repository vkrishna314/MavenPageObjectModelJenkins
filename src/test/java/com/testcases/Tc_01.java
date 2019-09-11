package com.testcases;

import org.testng.IInvokedMethod;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.applicationpages.JobSeeker_StepDefinitions;
import com.commonutils.CommonUtlities;
import com.listners.Listners;


@Listeners(value = Listners.class)
public class Tc_01 extends CommonUtlities{

	@Test
	public void Tc_01_JobSeeker_Registration() {
boolean status=launchApplication("chrome");


if(status)
{
	JobSeeker_StepDefinitions jobseeker=new JobSeeker_StepDefinitions();
	
	//jobseeker.validate_AllMandatoryFields_PersonalInformation();
	jobseeker.fillForm_PersonalInformation();
	jobseeker.fillForm_ProfessionalDetails();
	jobseeker.fillForm_EducationalDetails();
	
	
	driver.close();
	driver.quit();
	
}


	}
	
	
	
}

