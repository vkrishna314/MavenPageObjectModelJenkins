package com.applicationor;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class HomepageOR {

	// ************************************************* HOME PAGE WebElements
	// **************************************
	// ====================================================================================================================================================================

	@FindBy(xpath = "//span[@id='lnkRegistration']")
	public static WebElement lnk_Register;

	@FindBy(xpath = "//span[@id='lblJsRegister']")
	public static WebElement lnk_JobSeeker;

	@FindBy(xpath = "//label[text()='Fresher']")
	public static WebElement lnk_Fresher;

}
