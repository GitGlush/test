package com.neotech.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.neotech.utils.CommonMethods;

public class EnrollmentInfoPageElements extends CommonMethods{

	@FindBy (id="gridEnrollment_ctl02_dLeaveCode_list")
	public WebElement leaveCode;
	
	@FindBy (xpath="//input[@id='gridEnrollment_ctl02_tEnrollDate']")
	public WebElement enrollDate;
	
	
	public EnrollmentInfoPageElements () {
		PageFactory.initElements(driver, this);
	}
}
