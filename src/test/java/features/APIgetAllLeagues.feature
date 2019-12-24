@api
Feature: invoke the API get all leagues list
  Scenario: hit api to get list of all leagues
    Given I invoke the api to get all leagues information
    Then I get the list of all available leagues
    And I Validate the count of leagues