$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("APIgetAllLeagues.feature");
formatter.feature({
  "line": 2,
  "name": "invoke the API get all leagues list",
  "description": "",
  "id": "invoke-the-api-get-all-leagues-list",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@api"
    }
  ]
});
formatter.scenario({
  "line": 3,
  "name": "hit api to get list of all leagues",
  "description": "",
  "id": "invoke-the-api-get-all-leagues-list;hit-api-to-get-list-of-all-leagues",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "I invoke the api to get all leagues information",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I get the list of all available leagues",
  "keyword": "Then "
});
formatter.step({
  "line": 6,
  "name": "I Validate the count of leagues",
  "keyword": "And "
});
formatter.match({
  "location": "StepsApiGetAllLeagues.iInvokeTheApiToGetAllLeaguesInformation()"
});
formatter.result({
  "duration": 8272848400,
  "status": "passed"
});
formatter.match({
  "location": "StepsApiGetAllLeagues.iGetTheListOfAllAvailableLeagues()"
});
formatter.result({
  "duration": 456271700,
  "status": "passed"
});
formatter.match({
  "location": "StepsApiGetAllLeagues.iValidateTheCountOfLeagues()"
});
formatter.result({
  "duration": 4455000,
  "status": "passed"
});
formatter.uri("Login.feature");
formatter.feature({
  "line": 2,
  "name": "Login MercuryTours complete feature",
  "description": "",
  "id": "login-mercurytours-complete-feature",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Login"
    }
  ]
});
formatter.scenarioOutline({
  "line": 4,
  "name": "Login mercurytours website with valid credentials",
  "description": "",
  "id": "login-mercurytours-complete-feature;login-mercurytours-website-with-valid-credentials",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "I navigate to mercurytours login page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I enter valid \"\u003cusername\u003e\" and \"\u003cpassword\u003e\" values",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I click sign in button",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "My landing page is shown",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "I logout the application",
  "keyword": "Then "
});
formatter.examples({
  "line": 10,
  "name": "",
  "description": "",
  "id": "login-mercurytours-complete-feature;login-mercurytours-website-with-valid-credentials;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 11,
      "id": "login-mercurytours-complete-feature;login-mercurytours-website-with-valid-credentials;;1"
    },
    {
      "cells": [
        "toptal1",
        "testing#1"
      ],
      "line": 12,
      "id": "login-mercurytours-complete-feature;login-mercurytours-website-with-valid-credentials;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 12,
  "name": "Login mercurytours website with valid credentials",
  "description": "",
  "id": "login-mercurytours-complete-feature;login-mercurytours-website-with-valid-credentials;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@Login"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "I navigate to mercurytours login page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I enter valid \"toptal1\" and \"testing#1\" values",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I click sign in button",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "My landing page is shown",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "I logout the application",
  "keyword": "Then "
});
formatter.match({
  "location": "StepsLogin.I_navigate_to_mercurytours_login_page()"
});
formatter.result({
  "duration": 3372121700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "toptal1",
      "offset": 15
    },
    {
      "val": "testing#1",
      "offset": 29
    }
  ],
  "location": "StepsLogin.I_enter_valid_username_and_password_values(String,String)"
});
formatter.result({
  "duration": 516545000,
  "status": "passed"
});
formatter.match({
  "location": "StepsLogin.I_click_sing_in_button()"
});
formatter.result({
  "duration": 61600218200,
  "status": "passed"
});
formatter.match({
  "location": "StepsLogin.My_landing_page_is_shown()"
});
formatter.result({
  "duration": 18876500,
  "error_message": "java.lang.AssertionError: did not expect to find [true] but found [false]\r\n\tat org.testng.Assert.fail(Assert.java:97)\r\n\tat org.testng.Assert.failNotEquals(Assert.java:969)\r\n\tat org.testng.Assert.assertTrue(Assert.java:43)\r\n\tat org.testng.Assert.assertTrue(Assert.java:53)\r\n\tat testActions.MercuryToursHome_tests.verifyLandingPageIsShown(MercuryToursHome_tests.java:33)\r\n\tat steps.StepsLogin.My_landing_page_is_shown(StepsLogin.java:42)\r\n\tat ✽.Then My landing page is shown(Login.feature:8)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "StepsLogin.iLogoutTheApplication()"
});
formatter.result({
  "status": "skipped"
});
});