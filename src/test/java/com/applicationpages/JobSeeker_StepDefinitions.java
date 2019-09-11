package com.applicationpages;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.applicationor.JobSeekerOR;
import com.commonutils.CommonUtlities;

public class JobSeeker_StepDefinitions extends CommonUtlities {

	public static JobSeekerOR jobseekeror = PageFactory.initElements(driver,
			JobSeekerOR.class);

	public static void verify_fields() {
		IsElementDisplayed("Current Industry",
				"JobSeeker Personal Information", jobseekeror.edi_FirstName);

	}

	public void fillForm_PersonalInformation() {
		

		String firstname= getName();
		sendDataByClearing("First Name", "Job Seeker_Personal Information",
				jobseekeror.edi_FirstName, firstname);
		
		String LastName=getName();
	
		sendDataByClearing("Last Name", "Job Seeker_Personal Information",
				jobseekeror.edi_LastName, LastName );
		
		String Email=getEmail();

		sendDataByClearing("Email", "Job Seeker_Personal Information",
				jobseekeror.edi_Email, Email);
		
		String ContactNumber=getPhNo();
		sendDataByClearing("Contact Number", "Job Seeker_Personal Information",
				jobseekeror.edi_ContactNumber, ContactNumber);
		
		String LandLineNumber=getPhNo();

		sendDataByClearing("Landline Number",
				"Job Seeker_Personal Information",
				jobseekeror.edi_LandLineNumber, LandLineNumber);
		
		String Password=getData("TestData", "Password");

		sendDataByClearing("Password", "Job Seeker_Personal Information",
				jobseekeror.edi_password, Password);
		

		String ConfirmPassword=getData("TestData", "ConfirmPassword");

		sendDataByClearing("Confirm Password",
				"Job Seeker_Personal Information",
				jobseekeror.edi_confirmpassword, ConfirmPassword);
		
		String DOB=getData("TestData", "DOB");
		


		sendDataByClearing("Date Of Birth", "Job Seeker_Personal Information",
				jobseekeror.edi_dob, DOB);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		scrollDown();
		forceClick(jobseekeror.rdo_GenderMale);
		hoverAndClick("Are You in Notice", "Job Seeker_Personal Information",
				jobseekeror.rdo_No);
		
		String LanguagesKnown=getData("TestData", "LanguagesKnown");

		sendDataByClearing("Languages Known",
				"Job Seeker_Personal Information",
				jobseekeror.edi_LanguagesKnown, LanguagesKnown);
		
		hoverAndClick("Continue Button", "Job Seeker_Personal Information", jobseekeror.btn_ContinueStep1);

	}
	
	//Professional Details Step
	
	public void fillForm_ProfessionalDetails() {
		
		boolean status =IsElementDisplayed("Current Industry", "Professional Details page" , jobseekeror.lbl_CurrentIndustry);

		
	if(status=true){
		
		// Select Current Industry
		
				String CurrentIndustry=getData("TestData", "CurrentIndustry");

				selectDropdownByVisibleText("Current Industry",
						"Job Seeker_Professional Details",
						jobseekeror.drp_CurrentIndustry, CurrentIndustry);

				// Select Role
				String Role=getData("TestData", "Role");

				selectDropdownByVisibleText("Role", "Job Seeker_Professional Details",
						jobseekeror.drp_Role, Role);
				
				//Select JobType
				String JobType=getData("TestData", "JobType");
				selectDropdownByVisibleText("Job Type",
						"Job Seeker_Professional Details", jobseekeror.drp_JobType,
						JobType);

				// Enter Current Designation
				String CurrentDesignation=getData("TestData", "CurrentDesignation");

				sendData("Current Designation",
						"Job Seeker_Professional Details",
						jobseekeror.edi_CurrentDesignation, CurrentDesignation);


				// Select Total Experience in Years
				String ExpYears=getData("TestData", "ExpYears");

				selectDropdownByVisibleText("Total Experience in Years",
						"Job Seeker_Professional Details",
						jobseekeror.drp_TotalExperience_Years, ExpYears);

				// Select Total Experience in Months
				String ExpMonths=getData("TestData", "ExpMonths");

				selectDropdownByVisibleText("Total Experience in Months",
						"Job Seeker_Professional Details",
						jobseekeror.drp_TotalExperience_Months, ExpMonths);

				// Enter Resume Headline
				
				  String ResumeHeadline=getData("TestData", "ResumeHeadline");
				  
				  sendDataByClearing("Resume Headline", "Job Seeker_Professional Details",
				  jobseekeror.txt_ResumeHeadline, ResumeHeadline);
				 

				// Enter Current Company
				String CurrentCompany=getData("TestData", "CurrentCompany");
				sendData("Current Company",
						"Job Seeker_Professional Details",
						jobseekeror.txt_CurrentCompany, CurrentCompany);
				//Key Skills
				String keySkills=getData("TestData", "keySkills");
				sendDataByClearing("Current Company",
						"Job Seeker_Professional Details",
						jobseekeror.txt_Keyskills, keySkills);

				// Select Current Location
				String CurrentLocation=getData("TestData", "CurrentLocation");
				selectDropdownByVisibleText("Current Location",
						"Job Seeker_Professional Details",
						jobseekeror.drp_CurrentLocation, CurrentLocation);

				// Select Preferred Location
				String PreferredLocation=getData("TestData", "PreferredLocation");
				
				scrollDown();
				
				hoverAndClick("Preffered location", "Job Seeker", jobseekeror.drp_PreferredLocation);
				//hoverAndClick("preferred Location", "Job Seeker", jobseekeror.drp_PreferredLocationSearch);
				String searchdata = getData("TestData", "PreferredLocation").trim();

				sendData("preferred Location", "Job Seeker", jobseekeror.drp_PreferredLocationSearch, searchdata);
				
				String xpath="//label[normalize-space(text())='"+searchdata+"']";
				
				WebElement element=driver.findElement(By.xpath(xpath));
				
				hoverAndClick("Preffered location", "Job Seeker", element);
				
				hoverAndClick("Preffered location", "Job Seeker", jobseekeror.drp_PreferredLocation);
				
				
				
				hoverAndClick("Continue Button", "Job Seeker_Personal Information", jobseekeror.btn_ContinueStep2);
				System.out.println("Professional Details Filled Successfully");
				LogStatus("pass", "Professional Details Filled Successfully");
		
	}else {
		System.out.println("Unable to navigate to Professional Details page");
		LogStatus("fail", "Professional Details not filled");
	}

		

	}

	public void fillForm_EducationalDetails() {
		
		boolean status =IsElementDisplayed("Education", "Education Details page" , jobseekeror.drp_Education);
		
		if(status=true) {
		String Education=getData("TestData", "Education");
		selectDropdownByVisibleText("Education",
				"Job Seeker_Education Details",
				jobseekeror.drp_Education, Education);
		
		String Institute=getData("TestData", "Institute");
		selectDropdownByVisibleText("Institute",
				"Job Seeker_Education Details",
				jobseekeror.drp_Institute, Institute);
		
		String YearofPass=getData("TestData", "YearofPass");
		selectDropdownByVisibleText("Institute",
				"Job Seeker_Education Details",
				jobseekeror.Drp_YearOfPassing, YearofPass);
		
		scrollDown();
		hoverAndClick("Terms and Conditions", "Education Details Page", jobseekeror.chk_Terms_Conditions);
		hoverAndClick("Submit", "job seeker education details", jobseekeror.btn_Submit);
		System.out.println("Successfully Filled Education Details Page");
		LogStatus("pass", "Education Details Filled successfully");
		
		}else {
			System.out.println("Unable to Navigate to Education Details Page");
			LogStatus("fail", "Education Details Not Filled");
		}
		
	

	}

	public void validate_AllMandatoryFields_PersonalInformation() {
try{
           validate_MandatoryFields_PersonalInformation("First Name ",
				jobseekeror.lbl_FirstName, errorMessages()
						.get("firstnameerror").toString(),
				jobseekeror.txt_FirstNameMandatorytext);
		validate_MandatoryFields_PersonalInformation("Last Name",
				jobseekeror.lbl_LastName, errorMessages().get("lastnameerror")
						.toString(), jobseekeror.txt_LastNameMandatorytext);
		validate_MandatoryFields_PersonalInformation("EmailId",
				jobseekeror.lbl_Email, errorMessages().get("emailiderror")
						.toString(), jobseekeror.txt_EmailMandatorytext);
		validate_MandatoryFields_PersonalInformation("Contact Number",
				jobseekeror.lbl_ContactNumber,
				errorMessages().get("contactnumbererror").toString(),
				jobseekeror.txt_ContactMandatorytext);
		validate_MandatoryFields_PersonalInformation("Password",
				jobseekeror.lbl_Password, errorMessages().get("passworderror")
						.toString(), jobseekeror.txt_PasswordMandatorytext);
		validate_MandatoryFields_PersonalInformation("ConfirmPassword",
				jobseekeror.lbl_ConfirmPassword,
				errorMessages().get("confirmpassworderror").toString(),
				jobseekeror.txt_ConfirmPasswordMandatorytext);
		validate_MandatoryFields_PersonalInformation("Gender",
				jobseekeror.lbl_Gender, errorMessages().get("gendererror")
						.toString(), jobseekeror.txt_GenderMandatorytext);
		LogStatus("pass","Successfully validated all the mandatory fields");
	

		
	

} catch (Exception e1) {
	// TODO Auto-generated catch block
	LogStatus("fail","error in validate_AllMandatoryFields_PersonalInformation"
					+ e1.getMessage());
}

	}

	public static Map errorMessages() {
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("firstnameerror", "* Please specify firstname.");
		map.put("lastnameerror", "* Please specify lastname.");
		map.put("emailiderror", "* Please specify email id.");
		map.put("contactnumbererror", "* Please specify contact number.");
		map.put("passworderror", "* Please specify password.");
		map.put("confirmpassworderror", "* Please specify confirm password.");
		map.put("gendererror", "* Please specify gender.");
		return map;
	}

	public void validate_MandatoryFields_PersonalInformation(
			String elementname, WebElement element, String object,
			WebElement mandatorytxtelement) {

		// Checking for the null value in FirstName Field
		try {
			if (!(element == null)) {
				jobseekeror.btn_ContinueStep1.click();
				
			LogStatus("pass",elementname+"is not null");
			} else

				throw new Exception(elementname + " is null");
			LogStatus("fail",elementname+" is Element Name is null");
		} catch (Exception e1) {
			LogStatus("fail",elementname+"is null"
							+ e1.getMessage());
		}

		// Validation of mandatory text for first name
		String msg = getTextForWebElement(elementname,
				"JobSeeker Personal Informaton", mandatorytxtelement);
		try {
			if (msg.equals(object)) {
				System.out.println("Correct validations of" + object);

				if (isElementColorRed(mandatorytxtelement))

					{System.out.println("The colour is matched ");
				LogStatus("pass","Colour is successfully validated");
					}
				else

					throw new Exception(" Colour Mismatch");
				LogStatus("fail","Colour Mismatch of WebElement"+elementname);
			} else
				throw new Exception("Validation text is not displayed");
                    LogStatus("fail","Validation text is not displayed");
				
		} catch (Exception e) {
			// TODO Auto-generated catch block
			LogStatus("fail","error in validate_MandatoryFields_PersonalInformation"
							+ e.getMessage());
		}
	}
}
