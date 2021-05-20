$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:features/createAdhocRequest.feature");
formatter.feature({
  "name": "As a user I can able to create adhoc request and verifies adhoc request",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Create Adhoc request",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "adhoc popup shoud be available",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefinition.StepDefinition2.adhocPopupShoudBeAvailable()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters the valid adhoc request data",
  "rows": [
    {},
    {},
    {},
    {}
  ],
  "keyword": "When "
});
formatter.match({
  "location": "stepdefinition.StepDefinition2.userEntersTheValidAdhocRequestData(io.cucumber.datatable.DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "adhoc request should be created",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinition.StepDefinition2.dhocRequestShouldBeCreated()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:features/createAnalysis.feature");
formatter.feature({
  "name": "As a user I want to create new analysis",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Login with valid credentials",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@SmokeTest"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I am on home page",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefinition.StepDefinition.iAmOnHomePage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter user name as 5001096 and Passwrd as 5001096",
  "keyword": "When "
});
formatter.match({
  "location": "stepdefinition.StepDefinition.iEnterUserNameAsAndPasswrdAs(java.lang.Integer,java.lang.Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on Login button",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinition.StepDefinition.iClickOnLoginButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "login should successful",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinition.StepDefinition.loginShouldSuccessful()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "set Acount name and selet country",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinition.StepDefinition1.set_Acount_name_and_selet_country()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on Create analysis button",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinition.StepDefinition1.click_on_Create_analysis_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "analysis shoud be created",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinition.StepDefinition1.analysis_shoud_be_created()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:features/datatable.feature");
formatter.feature({
  "name": "Handle the datatable with DataTable annotation",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Accessing the data from Datatable",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the data table data",
  "rows": [
    {},
    {},
    {},
    {}
  ],
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefinition.StepDefinition3.theDataTableData(java.util.List\u003cstepdefinition.StepDefinition3$AcountInfo\u003e)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:features/login.feature");
formatter.feature({
  "name": "As a user I want to verify the login funtionality",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Login with valid credentials",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@RegressionTest"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I am on home page",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefinition.StepDefinition.iAmOnHomePage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter user name as 5001096 and Passwrd as 5001096",
  "keyword": "When "
});
formatter.match({
  "location": "stepdefinition.StepDefinition.iEnterUserNameAsAndPasswrdAs(java.lang.Integer,java.lang.Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on Login button",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinition.StepDefinition.iClickOnLoginButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "login should successful",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinition.StepDefinition.loginShouldSuccessful()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Login with valid credentials",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@SanityTest"
    },
    {
      "name": "@SmokeTest"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I am on home page",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefinition.StepDefinition.iAmOnHomePage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter user name as 1234567 and Passwrd as 1234567",
  "keyword": "When "
});
formatter.match({
  "location": "stepdefinition.StepDefinition.iEnterUserNameAsAndPasswrdAs(java.lang.Integer,java.lang.Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on Login button",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinition.StepDefinition.iClickOnLoginButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "login should fail",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinition.StepDefinition.loginShouldFail()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:features/parametertype.feature");
formatter.feature({
  "name": "Parameter type data",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Parameter type example",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "verfiy adhoc data \"reques1\",\"FXE International\",123456,345678,18052021,82638538,\"Request Submted\",\"status success\",\"Update\", \"Close\"",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefinition.StepDefinition4.verfiyAdhocData(java.util.List\u003cjava.lang.String\u003e)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:features/verifyLoginCredentials.feature");
formatter.feature({
  "name": "As a user I want to verify the user credentials",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Login with dufferent user credentials",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "I am on home page",
  "keyword": "Given "
});
formatter.step({
  "name": "I enter user name as \u003cuserName\u003e and Passwrd as \u003cpassword\u003e",
  "keyword": "When "
});
formatter.step({
  "name": "I click on Login button",
  "keyword": "And "
});
formatter.step({
  "name": "login should successful",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "userName",
        "password"
      ]
    },
    {
      "cells": [
        "5001096",
        "5001096"
      ]
    },
    {
      "cells": [
        "632872",
        "632872"
      ]
    },
    {
      "cells": [
        "540449",
        "540449"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Login with dufferent user credentials",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I am on home page",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefinition.StepDefinition.iAmOnHomePage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter user name as 5001096 and Passwrd as 5001096",
  "keyword": "When "
});
formatter.match({
  "location": "stepdefinition.StepDefinition.iEnterUserNameAsAndPasswrdAs(java.lang.Integer,java.lang.Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on Login button",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinition.StepDefinition.iClickOnLoginButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "login should successful",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinition.StepDefinition.loginShouldSuccessful()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Login with dufferent user credentials",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I am on home page",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefinition.StepDefinition.iAmOnHomePage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter user name as 632872 and Passwrd as 632872",
  "keyword": "When "
});
formatter.match({
  "location": "stepdefinition.StepDefinition.iEnterUserNameAsAndPasswrdAs(java.lang.Integer,java.lang.Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on Login button",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinition.StepDefinition.iClickOnLoginButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "login should successful",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinition.StepDefinition.loginShouldSuccessful()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Login with dufferent user credentials",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I am on home page",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefinition.StepDefinition.iAmOnHomePage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter user name as 540449 and Passwrd as 540449",
  "keyword": "When "
});
formatter.match({
  "location": "stepdefinition.StepDefinition.iEnterUserNameAsAndPasswrdAs(java.lang.Integer,java.lang.Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on Login button",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinition.StepDefinition.iClickOnLoginButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "login should successful",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinition.StepDefinition.loginShouldSuccessful()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});