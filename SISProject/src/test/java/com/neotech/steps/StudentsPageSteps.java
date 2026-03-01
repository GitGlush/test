package com.neotech.steps;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import com.neotech.utils.CommonMethods;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class StudentsPageSteps extends CommonMethods{
	
	@Given("I am logged in with valid credentials")
	public void i_am_logged_in_with_valid_credentials() {
		loginPage.adminLogin();
		}
	
		@When("I navigate to the “Students” tab")
	public void i_navigate_to_the_students_tab() {
	    click(mainPage.studentsTab);
	}
	
	@Then("I validate all sub tabs are visible:")
	public void i_validate_all_sub_tabs_are_visible(DataTable dataTable) {
	   List <String> expectedList = dataTable.asList();
	   List<String> actualList=new ArrayList<>();
	   
		for(WebElement el:studentPage.studentsSubTabs) {
			actualList.add(el.getText().trim());
		}
		
		
		if(actualList.equals(expectedList)) {
			System.out.println("All sub-tab items on the Student's page are available: "+actualList);
		}
		Assert.assertEquals("Not all expected sub-tab items are available on the Student's page",expectedList, actualList);
	}



}
