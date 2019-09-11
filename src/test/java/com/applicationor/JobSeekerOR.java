package com.applicationor;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class JobSeekerOR {
	
	//************************************************* Job Seeker Page WebElement **************************************
		//=========================================================Step 2============================================================================================

	@FindBy(xpath="//label[normalize-space(text())='Current Industry']")
	public static WebElement lbl_CurrentIndustry;
	
	
	@FindBy(xpath="//select[@id='ctl00_ContentPlaceHolder2_ddlIndustry']")
	public static WebElement drp_CurrentIndustry;
	
	@FindBy(xpath="//span[text()='* Please specify industry.']")
	public static WebElement txt_MandatoryCurrentIndustry;
	
	@FindBy(xpath="//label[normalize-space(text())='Role' ]")
	public static WebElement lbl_Role;
	
	
	@FindBy(xpath="//select[@id='ctl00_ContentPlaceHolder2_ddlrole']")
	public static WebElement drp_Role;
	
	@FindBy(xpath="//span[text()='* Please select job type.']")
	public static WebElement txt_MandatoryRole;
	
	@FindBy(xpath="//label[normalize-space(text())='Job Type']")
	public static WebElement lbl_JobType;
	
	@FindBy(xpath="//select[@id='ctl00_ContentPlaceHolder2_ddlJobType']")
	public static WebElement  drp_JobType1;
	
	@FindBy(xpath="//span[text()='* Please select job type.']")
	public static WebElement txt_MandatorytxtJobType;
	
	@FindBy(xpath="//label[normalize-space(text())='Current Designation :']")
	public static WebElement lbl_CurrentDesignation;
	
	@FindBy(xpath="//select[@id='ctl00_ContentPlaceHolder2_ddlJobType']")
	public static WebElement drp_JobType;

	
	@FindBy(xpath="//input[@name='ctl00$ContentPlaceHolder2$txtCurrentDesignation']")
	public static WebElement edi_CurrentDesignation;
	
	@FindBy(xpath="//span[text()='* Please select job type.']")
	
	public static WebElement txt_MandatorytextJobType;
	
	@FindBy(xpath="//label[normalize-space(text())='Current Designation :']")
	public static WebElement lbl_TotalExperience;
	
	@FindBy(xpath="//select[@name='ctl00$ContentPlaceHolder2$ddlExp']")
	public static WebElement drp_TotalExperience_Years;
	

	
	
	
@FindBy(xpath="//select[@id='ctl00_ContentPlaceHolder2_ddlExpMonths']")
	public static WebElement drp_TotalExperience_Months;
	
	@FindBy(xpath="//select[@id='ctl00_ContentPlaceHolder2_ddlLakhs']")
	public static WebElement drp_CurrentCTC_Lakhs;
	
	@FindBy(xpath="//select[@id='ctl00_ContentPlaceHolder2_ddlThousands']")
	public static WebElement drp_CurrentCTC_Thousands1;
	
	@FindBy(xpath="//select[@id='ctl00_ContentPlaceHolder2_ddlExpectedCTC']")
	public static WebElement drp_ExpectedCTC_Lakhs;
	
	@FindBy(xpath="//select[@id='ctl00_ContentPlaceHolder2_ddlExpectedCTCThousand']")
	public static WebElement drp_ExpectedCTC_Thousands;
	
	@FindBy(xpath="//input[@id='ctl00_ContentPlaceHolder2_txtkeywords']")
	public static WebElement txt_Keyskills;
	
	@FindBy(xpath="//input[@id='ctl00_ContentPlaceHolder2_txtresumeheadline']")
	public static WebElement txt_ResumeHeadline;
	
	@FindBy(xpath="//input[@id='ctl00_ContentPlaceHolder2_txtCurrentCompany']")
	public static WebElement txt_CurrentCompany;
	
	@FindBy(xpath="//select[@id='ctl00_ContentPlaceHolder2_ddlocation']")
	public static WebElement drp_CurrentLocation;
	
	@FindBy(xpath="//select[@id='ctl00_ContentPlaceHolder2_ddllocality']")
	public static WebElement txt_Locaclity;
	
	@FindBy(xpath="//button[@class='multiselect dropdown-toggle btn-block btn btn-default']")
	public static WebElement drp_PreferredLocation;
	
	@FindBy(xpath="//input[@placeholder='Search']")
	public static WebElement drp_PreferredLocationSearch;
	
	
	@FindBy(xpath="//a[@id='backtostep1']")
	public static WebElement btn_back;
	
	@FindBy(xpath="//input[@id='ctl00_ContentPlaceHolder2_btnEducation']")
	public static WebElement btn_ContinueStep2;


	//************************************** JobSeeker Page WebElements *******************************************
	//*************************************  Step  1 **************************************************************

	//=======================================================================================================================


	@FindBy(xpath="//input[@id='ctl00_ContentPlaceHolder2_txtfirstname']")
	public static WebElement edi_FirstName;
	
	@FindBy(xpath="//span[@id='ctl00_ContentPlaceHolder2_RequiredFieldValidator3']")
	public static WebElement txt_FirstNameMandatorytext;

	@FindBy(xpath="//input[@id='ctl00_ContentPlaceHolder2_txtlastname']")
	public static WebElement edi_LastName;
	
	@FindBy(xpath="//span[@id='ctl00_ContentPlaceHolder2_RequiredFieldValidator2']")
	public static WebElement txt_LastNameMandatorytext;

	@FindBy(xpath="//input[@id='ctl00_ContentPlaceHolder2_txtemail']")
	public static WebElement edi_Email;
	
	@FindBy(xpath="//span[@id='ctl00_ContentPlaceHolder2_RequiredFieldValidator21']")
	public static WebElement txt_EmailMandatorytext;

	@FindBy(xpath="//input[@id='ctl00_ContentPlaceHolder2_txtmobile']")
	public static WebElement edi_ContactNumber;
	
	@FindBy(xpath="//span[@id='ctl00_ContentPlaceHolder2_RequiredFieldValidator23']")
	public static WebElement txt_ContactMandatorytext;


	@FindBy(xpath="//input[@id='ctl00_ContentPlaceHolder2_txtLandlineNo']")
	public static WebElement edi_LandLineNumber;

	@FindBy(xpath="//label[normalize-space(text())='First Name']")
	public static WebElement lbl_FirstName;

	@FindBy(xpath="//label[normalize-space(text())='Last Name']")
	public static WebElement lbl_LastName;

	@FindBy(xpath="//label[normalize-space(text())='Email']")
	public static WebElement lbl_Email;

	@FindBy(xpath="//label[normalize-space(text())='Contact No(Mobile)']")
	public static WebElement lbl_ContactNumber;

	@FindBy(xpath="//label[normalize-space(text())='Landline No :']")
	public static WebElement lbl_LandLineNumber;


	@FindBy(xpath ="//input[@id='ctl00_ContentPlaceHolder2_txtpwd']")
	public static WebElement edi_password ;
	
	@FindBy(xpath="//label[normalize-space(text())='Password']")
	public static WebElement lbl_Password;
	
	@FindBy(xpath="//span[text()='* Please specify password.']")
	public static WebElement txt_PasswordMandatorytext;
	
	
	
	@FindBy(xpath="//label[normalize-space(text())='Confirm Password']")
	public static WebElement lbl_ConfirmPassword;
	
	@FindBy(xpath="//span[text()='* Please specify confirm password.']")
	public static WebElement txt_ConfirmPasswordMandatorytext;
	
	
	@FindBy(xpath ="//input[@id='ctl00_ContentPlaceHolder2_txtconfirmpwd']")
	public static WebElement edi_confirmpassword ;
	
	
	@FindBy(xpath="//div[@id='ctl00_ContentPlaceHolder2_UpdatePanel1']/div[5]/label[1]")
	public static WebElement lbl_DOB;
	
	@FindBy(xpath ="//input[@id='ctl00_ContentPlaceHolder2_txtdateOfBirth']")
	public static WebElement edi_dob ;
	
	
	
	
	@FindBy(xpath="//label[normalize-space(text())='Gender']")
	public static WebElement lbl_Gender ;
	
	@FindBy(xpath="//span[text()='* Please specify gender.']")
	public static WebElement txt_GenderMandatorytext;
	
	
	
	@FindBy(xpath ="//input[@id='ctl00_ContentPlaceHolder2_rdoGender_0']")
	public static WebElement rdo_GenderMale;
	
	@FindBy(xpath ="//input[@id='ctl00_ContentPlaceHolder2_rdoGender_1']")
	public static WebElement rdo_GenderFeMale;
	
	
   @FindBy(xpath="//div[@id='ctl00_ContentPlaceHolder2_UpdatePanel1']/div[7]/label[1]")
	public static WebElement lbl_AreYouNotice ;


   @FindBy(xpath ="//input[@id='ctl00_ContentPlaceHolder2_rblstNotice_0']")
    public static WebElement rdo_Yes;
   
	@FindBy(xpath ="//input[@id='ctl00_ContentPlaceHolder2_rblstNotice_1']")
	public static WebElement rdo_No;
	
	@FindBy(xpath ="//select[@id='ctl00_ContentPlaceHolder2_ddlNoticePeriod']")
    public static WebElement drp_notice;
	
	
	

	
	@FindBy(xpath="//div[@id='ctl00_ContentPlaceHolder2_UpdatePanel1']/div[8]/label[1]")
	public static WebElement lbl_languagesKnown ;
	
	@FindBy(xpath ="//input[@id='ctl00_ContentPlaceHolder2_txtlanguagesKnown']")
	public static WebElement edi_LanguagesKnown;
	
	@FindBy(xpath ="//h3[contains(text(),'Why become a member of Talentzing.com?')]")
	public static WebElement txt_SideHeader;
	
	@FindBy(xpath ="//h3[contains(text(),'Your Privacy and Confidentiality ')]")
	public static WebElement txt_SideHeaderbottom;
	

	@FindBy(xpath="//input[@id='ctl00_ContentPlaceHolder2_btnProfessional']")
	public static WebElement btn_ContinueStep1;
	
	
	//************************************************* Job Seeker Page WebElement **************************************
	
	//=========================================================Step 3============================================================================================
	
	@FindBy(xpath="//select[@id='ctl00_ContentPlaceHolder2_ddlEducation']")
	public static WebElement drp_Education;
	
	@FindBy(xpath="//label[normalize-space(text())='Education ']")
	public static WebElement lbl_Education;
	
	@FindBy(xpath="//select[@id='ctl00_ContentPlaceHolder2_ddlinstitute']")
	public static WebElement drp_Institute;

	@FindBy(xpath="//select[@id='//select[@id='ctl00_ContentPlaceHolder2_ddlyop']']")
	public static WebElement Drp_YearOfPassing;
	
	@FindBy(xpath="//input[@id='ctl00_ContentPlaceHolder2_flUpdPhoto']")
	public static WebElement file_AttachPhoto_ChooseFile;
	
	@FindBy(xpath="//a[@id='record']/i")
	public static WebElement Audioprofile_mike;
	
	@FindBy(xpath="//a[@id='pause']/i")
	public static WebElement Audioprofile_pause;
	
	@FindBy(xpath="//a[@id='play']/i")
	public static WebElement Audioprofile_play;
	
	@FindBy(xpath="//a[@id='download']/i")
	public static WebElement Audioprofile_download;
	
	@FindBy(xpath="//input[@id='chkEmail']")
	public static WebElement chk_ActiveJobAlerts_Email;
	
	@FindBy(xpath="//input[@id='chkSMS']")
	public static WebElement chk_ActiveJobAlerts_SMS;
	
	@FindBy(xpath="//input[@id='chkChat']")
	public static WebElement chk_ActiveJobAlerts_Chat;
	
	@FindBy(xpath="//input[@id='chkReferral']")
	public static WebElement chk_ActiveJobAlerts_Referral_Chat;
	
	@FindBy(xpath="//input[@id='chkNone']")
	public static WebElement chk_ActiveJobAlerts_None;
	
	@FindBy(xpath="//input[@id='chkTrainingEmail']")
	public static WebElement chk_TrainingAlerts_Email;
	
	@FindBy(xpath="//input[@id='chkTrainingSMS']")
	public static WebElement chk_TrainingAlerts_SMS;
	
	@FindBy(xpath="//input[@id='chkTrainingChat']")
	public static WebElement chk_TrainingAlerts_Chat;
	
	@FindBy(xpath="//input[@id='chkTrainingNone']")
	public static WebElement chk_TrainingAlerts_None;
	
	@FindBy(xpath="//input[@id='chkAccept']")
	public static WebElement chk_Terms_Conditions;
	
	@FindBy(xpath="//a[text()='Terms and Conditions']")
	public static WebElement Terms_and_conditions;
	
	@FindBy(xpath="//a[@id='backtostep2']")
	public static WebElement btn_backbutton;
	
	@FindBy(xpath="//input[@name='ctl00$ContentPlaceHolder2$btnSubmit']")
	public static WebElement btn_Submit;

	
	
	
	

	
	
	

}
