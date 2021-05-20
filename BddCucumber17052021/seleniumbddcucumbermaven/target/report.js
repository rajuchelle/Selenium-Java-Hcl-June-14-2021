$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:features/accountcreation.feature");
formatter.feature({
  "name": "As a user I can create Account and verify Account details",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Login with valid credentials and create new Analysis",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I am on Login page",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefinition.LoginPageStepDefinition.iAmOnLoginPage()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "I enter user name as \"5001096\" and Passwrd as \"5001096\"",
  "keyword": "When "
});
formatter.match({
  "location": "stepdefinition.LoginPageStepDefinition.iEnterUserNameAsAndPasswrdAs(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "I click on Login button",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinition.LoginPageStepDefinition.iClickOnLoginButton()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "login should successful",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinition.LoginPageStepDefinition.loginShouldSuccessful()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "I enter account name as \"Test1\" and country as \"United States\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinition.HomePageStepDefinition.iEnterAccountNameAsAndCountryAs(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "I verify account name \"TEST1\" and country name as \"US\"",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinition.HomePageStepDefinition.iVerifyAccountNameAndCountryNameAs(java.lang.String,java.lang.String)"
});
formatter.result({
  "error_message": "junit.framework.ComparisonFailure: expected:\u003cUS[1]\u003e but was:\u003cUS[]\u003e\r\n\tat junit.framework.Assert.assertEquals(Assert.java:100)\r\n\tat junit.framework.Assert.assertEquals(Assert.java:107)\r\n\tat stepdefinition.HomePageStepDefinition.iVerifyAccountNameAndCountryNameAs(HomePageStepDefinition.java:41)\r\n\tat ✽.I verify account name \"TEST1\" and country name as \"US\"(file:///E:/BddCucumber17052021/seleniumbddcucumbermaven/features/accountcreation.feature:9)\r\n",
  "status": "failed"
});
formatter.embedding("image/jpeg", "embedded0.jpg", null);
formatter.afterstep({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});