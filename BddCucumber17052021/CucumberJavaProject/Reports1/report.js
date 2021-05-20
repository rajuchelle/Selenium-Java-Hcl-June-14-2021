$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/createAdhocRequest.feature");
formatter.feature({
  "line": 1,
  "name": "As a user I can able to create adhoc request and verifies adhoc request",
  "description": "",
  "id": "as-a-user-i-can-able-to-create-adhoc-request-and-verifies-adhoc-request",
  "keyword": "Feature"
});
formatter.before({
  "duration": 475000,
  "status": "passed"
});
formatter.before({
  "duration": 1654300,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "Create Adhoc request",
  "description": "",
  "id": "as-a-user-i-can-able-to-create-adhoc-request-and-verifies-adhoc-request;create-adhoc-request",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "adhoc popup shoud be available",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user enters the valid adhoc request data",
  "rows": [
    {
      "cells": [
        "adhocName",
        "segmentName",
        "accountNumbers",
        "selectdate"
      ],
      "line": 6
    },
    {
      "cells": [
        "reques1",
        "FXE International",
        "123456,345678",
        "18052021"
      ],
      "line": 7
    },
    {
      "cells": [
        "request2",
        "FXE Domestic",
        "6482686,8628926",
        "17052021"
      ],
      "line": 8
    },
    {
      "cells": [
        "request3",
        "FXE Ground",
        "35835535,57385757",
        "16052021"
      ],
      "line": 9
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "adhoc request should be created",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition2.adhocPopupShoudBeAvailable()"
});
formatter.result({
  "duration": 337714500,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition2.userEntersTheValidAdhocRequestData(DataTable)"
});
formatter.result({
  "duration": 6243000,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition2.dhocRequestShouldBeCreated()"
});
formatter.result({
  "duration": 318200,
  "status": "passed"
});
formatter.after({
  "duration": 125700,
  "status": "passed"
});
});