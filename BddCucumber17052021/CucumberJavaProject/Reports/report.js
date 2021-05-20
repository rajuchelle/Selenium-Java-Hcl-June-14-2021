$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("login.feature");
formatter.feature({
  "line": 1,
  "name": "As a user I want to verify the login funtionality",
  "description": "",
  "id": "as-a-user-i-want-to-verify-the-login-funtionality",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Login with valid credentials",
  "description": "",
  "id": "as-a-user-i-want-to-verify-the-login-funtionality;login-with-valid-credentials",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "I am on home page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I enter user name as \"5001096\" and Passwrd as \"5001096\"",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "I click on Login button",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "login should successful",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.iAmOnHomePage()"
});
formatter.result({
  "duration": 248187700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "5001096",
      "offset": 22
    },
    {
      "val": "5001096",
      "offset": 47
    }
  ],
  "location": "StepDefinition.iEnterUserNameAsAndPasswrdAs(String,String)"
});
formatter.result({
  "duration": 8343000,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.iClickOnLoginButton()"
});
formatter.result({
  "duration": 114600,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.loginShouldSuccessful()"
});
formatter.result({
  "duration": 286600,
  "status": "passed"
});
});