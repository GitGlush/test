package com.neotech.steps;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.neotech.utils.CommonMethods;
import com.neotech.utils.ConfigsReader;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EnrollmentStudentPage extends CommonMethods {

	@When("I find the student I have created {string}")
	public void i_find_the_student_i_have_created(String username) {
		click(mainPage.studentsTab);

		sendText(studentPage.searchInput, username);
		click(studentPage.searchBtn);

		if (studentPage.studentLastName.getText().equals(ConfigsReader.getProperty("studentLastName"))) {
			studentPage.student.click();
		} else {
			System.out.println("The search button on the student's page is not working!");
		}

		Select sel = new Select(studentPage.enrollmentStatus);
		sel.selectByVisibleText("Unenrolled");

		List<WebElement> list = studentPage.listOfStudents;
		for (WebElement el : list) {

			if (el.getText().equalsIgnoreCase(username)) {
				el.click();
				break;
			}
		}
	}

	@Then("I enroll the student by clicking on the enroll link and filling out all the information: {string},{string},{string},{string}")
	public void i_enroll_the_student(String enrollDate, String enrollCode, String gradeSection, String comment) {

		click(personalPage.enrollBtn);

		sendText(studentPage.enrollmentDate, enrollDate);

		Select code = new Select(studentPage.enrollCode);
		List<WebElement> codeOptions = code.getOptions();
		if (!codeOptions.isEmpty()) {
			code.selectByVisibleText(enrollCode);
		}

		else {
			System.out.println("The enroll code section options are not available to choose!");
		}
		

		Select grade = new Select(studentPage.gradeSection);
		List<WebElement> gradeOptions = grade.getOptions();
		if (!gradeOptions.isEmpty()) {
			grade.selectByVisibleText(gradeSection);
		}

		else {
			System.out.println("The grade section options are not available to choose!");
		}

		sendText(studentPage.comment, comment);

		if(studentPage.enrollBtn.isEnabled()) {click(studentPage.enrollBtn);}
		else {System.out.println("the enroll save button is not active!");}
		
Alert alert=driver.switchTo().alert();
String alertMessage=alert.getText();
System.out.println(alertMessage);
alert.accept();

click(studentPage.cancelEnrollTab);
	}

	@Then("after enrolling, verify your student {string} in the student search functionality by filtering Status {string}")
	public void verify_your_student_in_the_student_search(String username, String enrolled) {

		Select sel = new Select(studentPage.enrollmentStatus);
		sel.selectByVisibleText(enrolled);

		List<WebElement> listOfStudents = studentPage.listOfStudents;
		List<String> students = new ArrayList<>();
		for (WebElement el : listOfStudents) {
			students.add(el.getText().trim());
		}
		System.out.println(students);

		for (String el : students) {
			if (el.equals(username)) {
				System.out.println("The user " + username + " has been successfully enrolled");
			}
		}
	}

	@Then("I proceed to the Students enrollment sub tab and verify status of enrollment: {string},{string},{string},{string}")
	public void i_proceed_to_the_students_enrollment_sub_tab(String enrollDate, String enrollCode, String gradeSection,
			String comment) {
		click(studentPage.enrollmentTab);
		System.out.println(enrollDate);
		System.out.println(enrollmentInfoPage.enrollDate);

		if (enrollmentInfoPage.enrollDate.equals(enrollDate)) {
			System.out.println("The enrollment status is verified");
		} else {
			System.out.println("the enrollment status is not verified");
		}
	}

}
