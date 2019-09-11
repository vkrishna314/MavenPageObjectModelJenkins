package com.applicationor;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;



public class Fresher {

	/* WEB ELEMENTS OF Fresher Page */

	// =======================================================================

	@FindBy(xpath = "//*[@id='aspnetForm']/div[3]/div/div[2]/div[1]/h2")
	public static WebElement lbl_RegistrationForm;

	@FindBy(xpath = "//*[@id='aspnetForm']/div[3]/div/div[2]/div[3]/div[1]/div/div[1]/label")
	public static WebElement lbl_FirstName;

	@FindBy(xpath = "//*[@id='aspnetForm']/div[3]/div/div[2]/div[3]/div[1]/div/div[1]/div/input")
	public static WebElement edi_FirstName;

	@FindBy(xpath = "//*[@id='aspnetForm']/div[3]/div/div[2]/div[3]/div[1]/div/div[2]/label")
	public static WebElement lbl_LastName;

	@FindBy(xpath = "//*[@name='ctl00$ContentPlaceHolder2$txtlastname']")
	public static WebElement edi_LastName;

	@FindBy(xpath = "//label[normalize-space(text())='Email']")
	public static WebElement lbl_Email;

	@FindBy(xpath = "//input[@name='ctl00$ContentPlaceHolder2$txtemail']")
	public static WebElement edi_Email;

	@FindBy(xpath = "//label[normalize-space(text())='Contact No(Mobile)']")
	public static WebElement lbl_MobileCtNum;

	@FindBy(xpath = "//input[@name='ctl00$ContentPlaceHolder2$txtmobile']")
	public static WebElement edi_MobileCtNum;

	@FindBy(xpath = "//label[normalize-space(text())='Landline No :']")
	public static WebElement lbl_LandLineNum;

	@FindBy(xpath = "//input[contains(@name,'Landline')]")
	public static WebElement edi_LandLineNum;

	@FindBy(xpath = "//label[normalize-space(text())='Location']")
	public static WebElement lbl_Location;

	@FindBy(xpath = "//select[ends-with(@name,'Location')]")
	public static WebElement edi_Location;

	@FindBy(xpath = "//label[normalize-space(text())='Gender']")
	public static WebElement lbl_Gender;

	@FindBy(xpath = "//input[@type='radio'][@value='Male']")
	public static WebElement edi_MaleButton;

	@FindBy(xpath = "//input[@type='radio'][@value='Female']")
	public static WebElement edi_FemaleButton;

	@FindBy(xpath = "//label[normalize-space(text())='Date Of Birth :']")
	public static WebElement lbl_DateOfBirth;

	@FindBy(xpath = "//input[@name='ctl00$ContentPlaceHolder2$txtdateOfBirth']")
	public static WebElement edi_DateOfBirth;

	@FindBy(xpath = "//input[@name='ctl00$ContentPlaceHolder2$btnSubmit']")
	public static WebElement btn_Submit;

	@FindBy(xpath = "//input[@id='chkAccept']")
	public static WebElement chk_TermsAndConditions;

	@FindBy(xpath = "//a[normalize-space(text())='Terms and Conditions']")
	public static WebElement lnk_TermsAndConditions;
	
	@FindBy(xpath = "//*[@id='ctl00_ContentPlaceHolder2_lblCheck]")
	public static WebElement error_TermsAndConditions;
	
	@FindBy (xpath = "//*[@id='ctl00_ContentPlaceHolder2_RequiredFieldValidator3']")
	public static WebElement error_FirstName;
	
	@FindBy (xpath = "//*[@id='ctl00_ContentPlaceHolder2_RequiredFieldValidator2']")
	public static WebElement error_LastName;
	
	@FindBy (xpath = "//*[@id='ctl00_ContentPlaceHolder2_RequiredFieldValidator21]")
	public static WebElement error_EmailID;
	
	@FindBy (xpath = "//*[@id='ctl00_ContentPlaceHolder2_RequiredFieldValidator23']")
	public static WebElement error_ContactNo;
	
	@FindBy (xpath = "//*[@id='ctl00_ContentPlaceHolder2_rfvPwd']")
	public static WebElement error_PassWord;
	

}
