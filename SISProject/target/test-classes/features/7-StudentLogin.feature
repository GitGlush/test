Feature: student user role login

@studentLogin
Scenario Outline: validation of student user role login 

When I login using credentials from add new student functionality 
Then I verify following “Student” information: 
|Student Id|Student Name|Grade Section|User Name|
|1337|Gump Forrest||FoGump|