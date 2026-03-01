package com.neotech.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.neotech.utils.CommonMethods;

public class StudentsPageElements extends CommonMethods{
	
 @FindBy (xpath="//table[@id='Header1_tableHeader']/following-sibling::table[2]//td[@background='../../Common/themes/Blue/mBg.jpg']")
 public List<WebElement> studentsSubTabs;
 
 @FindBy (id="AutoCompleteStudentName_tStudentName")
 public WebElement searchInput;
 
 @FindBy (xpath="//table[@class='enrollBlock textSmall']//td/input[@id='enrollComment']")
 public WebElement comment;
 
 @FindBy (xpath="//table[@class='enrollBlock textSmall']//td/input[@id='enrollDate']")
 public WebElement enrollmentDate;
 
 @FindBy (xpath="//table[@class='enrollBlock textSmall']//td/select[@id='enrollCode_list']")
 public WebElement enrollCode;
 
 @FindBy (xpath="//table[@class='enrollBlock textSmall']//td//select[@name='enrollGradeSection$list']")
	public WebElement gradeSection;
	
 @FindBy (xpath="//table[@class='enrollBlock textSmall']//td//select[@id='enrollGradeSection_list']/option[text()='1st Grade']")
 public WebElement gradeSectionOption1;
 
 @FindBy (xpath="//table[@class='enrollBlock textSmall']//td/input[@id='bEnroll']")
 public WebElement enrollBtn;
 
 @FindBy (xpath="//select[@name='students$students']/option")
 public List <WebElement> studentsUnenrolledList;
 
 @FindBy (id="AutoCompleteStudentName_bStudentSelect")
 public WebElement searchBtn;
  
 @FindBy (id="studentStatus_list")
 public WebElement enrollmentStatus;
 
 @FindBy (xpath="//select[@name='students$students']/option")
 public List <WebElement> listOfStudents;
 
 @FindBy (xpath="//table//td/a[text()='Parental']")
 public WebElement parentalTab;
 
 @FindBy (xpath="//table[@class='enrollBlock textSmall']//td//input[@value='Cancel']")
 public WebElement cancelEnrollTab;
 
 @FindBy (xpath="//table//td/a[text()='Academic']")
 WebElement academicTab;
 
 @FindBy (xpath="//table//td/a[text()='Schedule']")
 WebElement scheduleTab;
 
 @FindBy (xpath="//table//td/a[text()='Discipline Stats']")
 WebElement disciplineStatsTab;
 
 @FindBy (xpath="//table//td/a[text()='Personal 2']")
 WebElement personal2Tab;
 
 @FindBy (xpath="//table//td/a[text()='Enrollment']")
public  WebElement enrollmentTab;
 
 @FindBy (xpath="//select[@name='students$students']/option")
 public WebElement student;
 
 @FindBy (xpath="//table//td/a[text()='Override Final Grade']")
 WebElement overrideFinalGradeTab;
 
 @FindBy (id="tLastName")
 public WebElement studentLastName;
 
 @FindBy (xpath="//table//td/a[text()='Notes']")
 WebElement notesTab;
 
 @FindBy (xpath="//table//td/a[text()='E-Portfolio']")
 WebElement eportfolioTab;
 
 @FindBy (xpath="//table//td/a[text()='Program Enrollment']")
 WebElement programEnrollmentTab;
 
 public StudentsPageElements() {
	 PageFactory.initElements(driver, this);
 }
 
}
