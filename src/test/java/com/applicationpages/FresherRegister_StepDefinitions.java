package com.applicationpages;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import com.applicationor.Fresher;
import com.commonutils.CommonUtlities;

public class FresherRegister_StepDefinitions extends CommonUtlities {

	public static Fresher fresher = PageFactory.initElements(driver,
			Fresher.class);
	static JobSeeker_StepDefinitions jobSeeker = new JobSeeker_StepDefinitions();
	static Map errorMessages = JobSeeker_StepDefinitions.errorMessages();

	public static void verifyMadatoryErrors() {
		System.out.println("verifyMadatoryErrors in fresheer register page");
		try {
			if (waitForElementToBeClickable("submit button",
					"fresher register page", fresher.btn_Submit)) {
				fresher.btn_Submit.click();
			}
			System.out.println("in line 26 of fresher beahviours");
			// hoverAndClick("submit button", "fresher page",
			// fresher.btn_Submit);
			if (waitForElementToBeVisibility(
					"error msg for terms and conditions", "fresher page",
					fresher.error_TermsAndConditions))
				getTextForWebElement("error msg for terms and conditions",
						"fresher page", fresher.error_TermsAndConditions);
			hoverAndClick("terms and conditions check box", "freshere page",
					fresher.chk_TermsAndConditions);
			hoverAndClick("submit button", "fresher page", fresher.btn_Submit);
			if (waitForElementToBeVisibility("firstname error", "fresher page",
					fresher.error_FirstName)) {
				if (!(getTextForWebElement("error of firstname",
						"fresher page", fresher.error_FirstName)
						.equals(errorMessages.get("firstnameerror").toString())))
					throw new Exception("errors did not match");
			}
		} catch (Exception e) {
			System.out.println("error in verifyMadatoryErrors " + e.getMessage());
		}  
	}

}
