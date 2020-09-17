@homPageTests
Feature: Home Page tests

  Scenario: Verify Home Page title
    Given I open home page
    Then I verifies title is TLA Automation

  Scenario: Verify Home Page title
    Given I open home page
    Then I verifies title is TLA Automation


  Scenario: Verify Home Page title
    Given I open home page
    Then I verifies title is TLA Automation

  @parameterType
  Scenario: Parameter type example
    Given I open "http://automation.techleadacademy.io/#/home"
    Then Verifies main text contains words such as WebDriver, Selenium, CSS