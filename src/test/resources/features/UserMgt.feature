Feature: User Management page tests
  @smoke
  Scenario: Verify initially table is empty
    Given I open home page
    And I navigate to UserMgt page
    
  @registerUser
  Scenario: Register new user
    Given I open "http://automation.techleadacademy.io/#/usermgt"
    When I input "Kuba" as a "firstname"
    And I input "Z" as a "lastname"
    And I input "444-444-4444" as a "phone number"
    And I input "kuba@tla.com" as a "email"
    And I input "Instructor" as a "role"
    And I click a button "Submit"