package com.applicationpages;

import org.openqa.selenium.support.PageFactory;

import com.applicationor.HomepageOR;
import com.commonutils.CommonUtlities;

public class HomePage_StepDefinitions extends CommonUtlities {

	public static HomepageOR homepageor = PageFactory.initElements(driver,
			HomepageOR.class);

	public void navigateToJobSeeker() {
		hover("Register", "Home Page", homepageor.lnk_Register);

		hoverAndClick("Register", "Home Page", homepageor.lnk_JobSeeker);

	}

	public void navigateToFresher() {
		hover("Register", "Home Page", homepageor.lnk_Register);

		hoverAndClick("Register", "Home Page", homepageor.lnk_Fresher);

	}

}
