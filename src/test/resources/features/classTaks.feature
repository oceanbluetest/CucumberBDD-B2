@classTasks
Feature: Class tasks
  @youtube
  Scenario: Testing youtube
    Given I open "youtube"
    Then I verify title is "YouTube"
    When I click "Trending" button

  Scenario: Testing amazon
    Given I open "amazon"
    Then I verify title is "Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more"
    When I click "Best sellers" button

  Scenario: Testing chase bank
    Given I open "chase bank"
    Then I verify title is "Credit Card, Mortgage, Banking, Auto | Chase Online | Chase.com"
    When I click "ATM & branch" button
