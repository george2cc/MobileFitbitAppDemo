$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/features/NegativeLogins.feature");
formatter.feature({
  "line": 1,
  "name": "Login Test Smoke scenarios",
  "description": "",
  "id": "login-test-smoke-scenarios",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "Login Flow Validation via App",
  "description": "As a user I should be able to log into my account\r\n when I try to login myself in Fitbit\r\n\r\nExecution of parameterized test for various negative login details",
  "id": "login-test-smoke-scenarios;login-flow-validation-via-app",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 9,
  "name": "I am on Application Home Page",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "I choose to log in using Login link",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "I enter valid \"\u003cusername\u003e\" and valid \"\u003cpassword\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I tap on log in button",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "I should be able to login unsuccessfully",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "a popup window shows",
  "keyword": "And "
});
formatter.examples({
  "line": 16,
  "name": "",
  "description": "",
  "id": "login-test-smoke-scenarios;login-flow-validation-via-app;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 18,
      "id": "login-test-smoke-scenarios;login-flow-validation-via-app;;1"
    },
    {
      "cells": [
        "george@gmail.com",
        "password1"
      ],
      "line": 19,
      "id": "login-test-smoke-scenarios;login-flow-validation-via-app;;2"
    },
    {
      "cells": [
        "george2@gmail.com",
        "password2"
      ],
      "line": 20,
      "id": "login-test-smoke-scenarios;login-flow-validation-via-app;;3"
    },
    {
      "cells": [
        "1234@hotmail.com",
        "simonsays"
      ],
      "line": 21,
      "id": "login-test-smoke-scenarios;login-flow-validation-via-app;;4"
    },
    {
      "cells": [
        "georgeUp@gmail.com",
        "23232332"
      ],
      "line": 22,
      "id": "login-test-smoke-scenarios;login-flow-validation-via-app;;5"
    },
    {
      "cells": [
        "blink123@com",
        "2323Weod"
      ],
      "line": 23,
      "id": "login-test-smoke-scenarios;login-flow-validation-via-app;;6"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 10356166600,
  "status": "passed"
});
formatter.scenario({
  "line": 19,
  "name": "Login Flow Validation via App",
  "description": "As a user I should be able to log into my account\r\n when I try to login myself in Fitbit\r\n\r\nExecution of parameterized test for various negative login details",
  "id": "login-test-smoke-scenarios;login-flow-validation-via-app;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 9,
  "name": "I am on Application Home Page",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "I choose to log in using Login link",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "I enter valid \"george@gmail.com\" and valid \"password1\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I tap on log in button",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "I should be able to login unsuccessfully",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "a popup window shows",
  "keyword": "And "
});
formatter.match({
  "location": "NegativeLoginsSteps.i_am_on_Application_Home_Page()"
});
formatter.result({
  "duration": 170353800,
  "status": "passed"
});
formatter.match({
  "location": "NegativeLoginsSteps.i_choose_to_log_in_using_Logiin_link()"
});
formatter.result({
  "duration": 125928400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "george@gmail.com",
      "offset": 15
    },
    {
      "val": "password1",
      "offset": 44
    }
  ],
  "location": "NegativeLoginsSteps.i_enter_valid_and_valid(String,String)"
});
formatter.result({
  "duration": 2083529600,
  "status": "passed"
});
formatter.match({
  "location": "NegativeLoginsSteps.i_tap_on_log_in_button()"
});
formatter.result({
  "duration": 653434700,
  "status": "passed"
});
formatter.match({
  "location": "NegativeLoginsSteps.i_should_be_able_to_login_unsuccessfully()"
});
formatter.result({
  "duration": 1002855600,
  "status": "passed"
});
formatter.match({
  "location": "NegativeLoginsSteps.a_popup_window_shows()"
});
formatter.result({
  "duration": 21500,
  "status": "passed"
});
formatter.after({
  "duration": 9100,
  "status": "passed"
});
formatter.before({
  "duration": 10346819300,
  "status": "passed"
});
formatter.scenario({
  "line": 20,
  "name": "Login Flow Validation via App",
  "description": "As a user I should be able to log into my account\r\n when I try to login myself in Fitbit\r\n\r\nExecution of parameterized test for various negative login details",
  "id": "login-test-smoke-scenarios;login-flow-validation-via-app;;3",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 9,
  "name": "I am on Application Home Page",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "I choose to log in using Login link",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "I enter valid \"george2@gmail.com\" and valid \"password2\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I tap on log in button",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "I should be able to login unsuccessfully",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "a popup window shows",
  "keyword": "And "
});
formatter.match({
  "location": "NegativeLoginsSteps.i_am_on_Application_Home_Page()"
});
formatter.result({
  "duration": 239498500,
  "status": "passed"
});
formatter.match({
  "location": "NegativeLoginsSteps.i_choose_to_log_in_using_Logiin_link()"
});
formatter.result({
  "duration": 99642700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "george2@gmail.com",
      "offset": 15
    },
    {
      "val": "password2",
      "offset": 45
    }
  ],
  "location": "NegativeLoginsSteps.i_enter_valid_and_valid(String,String)"
});
formatter.result({
  "duration": 2051290100,
  "status": "passed"
});
formatter.match({
  "location": "NegativeLoginsSteps.i_tap_on_log_in_button()"
});
formatter.result({
  "duration": 683489900,
  "status": "passed"
});
formatter.match({
  "location": "NegativeLoginsSteps.i_should_be_able_to_login_unsuccessfully()"
});
formatter.result({
  "duration": 1139141500,
  "status": "passed"
});
formatter.match({
  "location": "NegativeLoginsSteps.a_popup_window_shows()"
});
formatter.result({
  "duration": 23700,
  "status": "passed"
});
formatter.after({
  "duration": 11100,
  "status": "passed"
});
formatter.before({
  "duration": 10415463900,
  "status": "passed"
});
formatter.scenario({
  "line": 21,
  "name": "Login Flow Validation via App",
  "description": "As a user I should be able to log into my account\r\n when I try to login myself in Fitbit\r\n\r\nExecution of parameterized test for various negative login details",
  "id": "login-test-smoke-scenarios;login-flow-validation-via-app;;4",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 9,
  "name": "I am on Application Home Page",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "I choose to log in using Login link",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "I enter valid \"1234@hotmail.com\" and valid \"simonsays\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I tap on log in button",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "I should be able to login unsuccessfully",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "a popup window shows",
  "keyword": "And "
});
formatter.match({
  "location": "NegativeLoginsSteps.i_am_on_Application_Home_Page()"
});
formatter.result({
  "duration": 254966200,
  "status": "passed"
});
formatter.match({
  "location": "NegativeLoginsSteps.i_choose_to_log_in_using_Logiin_link()"
});
formatter.result({
  "duration": 100538700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1234@hotmail.com",
      "offset": 15
    },
    {
      "val": "simonsays",
      "offset": 44
    }
  ],
  "location": "NegativeLoginsSteps.i_enter_valid_and_valid(String,String)"
});
formatter.result({
  "duration": 2038302400,
  "status": "passed"
});
formatter.match({
  "location": "NegativeLoginsSteps.i_tap_on_log_in_button()"
});
formatter.result({
  "duration": 657079400,
  "status": "passed"
});
formatter.match({
  "location": "NegativeLoginsSteps.i_should_be_able_to_login_unsuccessfully()"
});
formatter.result({
  "duration": 1084533500,
  "status": "passed"
});
formatter.match({
  "location": "NegativeLoginsSteps.a_popup_window_shows()"
});
formatter.result({
  "duration": 26200,
  "status": "passed"
});
formatter.after({
  "duration": 13000,
  "status": "passed"
});
formatter.before({
  "duration": 10346829300,
  "status": "passed"
});
formatter.scenario({
  "line": 22,
  "name": "Login Flow Validation via App",
  "description": "As a user I should be able to log into my account\r\n when I try to login myself in Fitbit\r\n\r\nExecution of parameterized test for various negative login details",
  "id": "login-test-smoke-scenarios;login-flow-validation-via-app;;5",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 9,
  "name": "I am on Application Home Page",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "I choose to log in using Login link",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "I enter valid \"georgeUp@gmail.com\" and valid \"23232332\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I tap on log in button",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "I should be able to login unsuccessfully",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "a popup window shows",
  "keyword": "And "
});
formatter.match({
  "location": "NegativeLoginsSteps.i_am_on_Application_Home_Page()"
});
formatter.result({
  "duration": 206350200,
  "status": "passed"
});
formatter.match({
  "location": "NegativeLoginsSteps.i_choose_to_log_in_using_Logiin_link()"
});
formatter.result({
  "duration": 103674800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "georgeUp@gmail.com",
      "offset": 15
    },
    {
      "val": "23232332",
      "offset": 46
    }
  ],
  "location": "NegativeLoginsSteps.i_enter_valid_and_valid(String,String)"
});
formatter.result({
  "duration": 2013201600,
  "status": "passed"
});
formatter.match({
  "location": "NegativeLoginsSteps.i_tap_on_log_in_button()"
});
formatter.result({
  "duration": 684540800,
  "status": "passed"
});
formatter.match({
  "location": "NegativeLoginsSteps.i_should_be_able_to_login_unsuccessfully()"
});
formatter.result({
  "duration": 1098883200,
  "status": "passed"
});
formatter.match({
  "location": "NegativeLoginsSteps.a_popup_window_shows()"
});
formatter.result({
  "duration": 32500,
  "status": "passed"
});
formatter.after({
  "duration": 12700,
  "status": "passed"
});
formatter.before({
  "duration": 10331685000,
  "status": "passed"
});
formatter.scenario({
  "line": 23,
  "name": "Login Flow Validation via App",
  "description": "As a user I should be able to log into my account\r\n when I try to login myself in Fitbit\r\n\r\nExecution of parameterized test for various negative login details",
  "id": "login-test-smoke-scenarios;login-flow-validation-via-app;;6",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 9,
  "name": "I am on Application Home Page",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "I choose to log in using Login link",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "I enter valid \"blink123@com\" and valid \"2323Weod\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I tap on log in button",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "I should be able to login unsuccessfully",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "a popup window shows",
  "keyword": "And "
});
formatter.match({
  "location": "NegativeLoginsSteps.i_am_on_Application_Home_Page()"
});
formatter.result({
  "duration": 125228800,
  "status": "passed"
});
formatter.match({
  "location": "NegativeLoginsSteps.i_choose_to_log_in_using_Logiin_link()"
});
formatter.result({
  "duration": 113636400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "blink123@com",
      "offset": 15
    },
    {
      "val": "2323Weod",
      "offset": 40
    }
  ],
  "location": "NegativeLoginsSteps.i_enter_valid_and_valid(String,String)"
});
formatter.result({
  "duration": 1942758700,
  "status": "passed"
});
formatter.match({
  "location": "NegativeLoginsSteps.i_tap_on_log_in_button()"
});
formatter.result({
  "duration": 654509400,
  "status": "passed"
});
formatter.match({
  "location": "NegativeLoginsSteps.i_should_be_able_to_login_unsuccessfully()"
});
formatter.result({
  "duration": 1097363100,
  "status": "passed"
});
formatter.match({
  "location": "NegativeLoginsSteps.a_popup_window_shows()"
});
formatter.result({
  "duration": 34000,
  "status": "passed"
});
formatter.after({
  "duration": 19400,
  "status": "passed"
});
});