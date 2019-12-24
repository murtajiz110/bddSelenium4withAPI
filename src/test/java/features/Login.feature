@Login
Feature: Login MercuryTours complete feature

  Scenario Outline: Login mercurytours website with valid credentials
    Given I navigate to mercurytours login page
    When I enter valid "<username>" and "<password>" values
    And I click sign in button
    Then My landing page is shown
    Then I logout the application
  Examples:
    |username|password |
    |toptal1 |testing#1|
