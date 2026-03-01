package com.neotech.steps;

import com.neotech.utils.CommonMethods;

import io.cucumber.java.en.When;

public class LoginPageSteps extends CommonMethods{
	@When("I navigate to the HRM website I validate successfully landing on the login page: the Neotech logo, username, password, academic year options")
	public void i_navigate_to_the_hrm_website_i_validate_the_neotech_logo_username_password_academic_year_options() {
	   if(loginPage.logo.isDisplayed() & loginPage.username.isDisplayed() & loginPage.password.isDisplayed() && loginPage.academicYear.isDisplayed()) {System.out.println("all required fields on HRM login page are present");}
	   else {System.out.println("validation of the login page elemenets failed, some elements are missing");}
	      
	}
	
	@When("I validate login button visible")
	public void i_validate_login_button_visible() {
		if(loginPage.loginBtn.isDisplayed()) {System.out.println("login button is present");}
		   else {System.out.println("we couldnt land on the site");}
	}



}
