Feature: Validate Enroll Student functionality and Enrollment Tab

  Background: 
    Given I am logged in with valid credentials

  @enrollment
  Scenario Outline: validation of enroll student page functionality
    When I find the student I have created "<Username>"
    Then I enroll the student by clicking on the enroll link and filling out all the information: "<Enroll Date>","<Enroll Code>","<Grade Section>","<Comment>"
    And after enrolling, verify your student "<Username>" in the student search functionality by filtering Status "Enrolled"
    And I proceed to the Students enrollment sub tab and verify status of enrollment: "<Enroll Date>","<Enroll Code>","<Grade Section>","<Comment>"

    Examples: 
      | Username     | Enroll Date | Enroll Code   |Grade Section| Comment    |
      | Gump Forrest | 1/21/2025   | 01 - Enrolled | 1st Grade|No comment |
