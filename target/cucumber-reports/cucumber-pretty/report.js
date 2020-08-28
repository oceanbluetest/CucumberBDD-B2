$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/logIn.feature");
formatter.feature({
  "name": "Login Page tests",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Verify user log in credentials",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@userCredentialsTest"
    }
  ]
});
formatter.step({
  "name": "I open \"http://automation.techleadacademy.io/#/usermgt\"",
  "keyword": "Given "
});
formatter.step({
  "name": "I click a button \"login\"",
  "keyword": "When "
});
formatter.step({
  "name": "I input \"\u003cusername\u003e\" as a \"username\"",
  "keyword": "And "
});
formatter.step({
  "name": "I input \"\u003cpassword\u003e\" as a \"password\"",
  "keyword": "And "
});
formatter.step({
  "name": "I click a button \"login user\"",
  "keyword": "And "
});
formatter.step({
  "name": "I verify title is \"\u003ctitle value\u003e\"",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "password",
        "title value"
      ]
    },
    {
      "cells": [
        "student@techleadacademy.io",
        "john.smith$",
        "Student Page"
      ]
    },
    {
      "cells": [
        "instructor@techleadacademy.io",
        "kate.anderson$",
        "Instructor Page"
      ]
    },
    {
      "cells": [
        "mentor@techleadacademy.io",
        "stephanie.adams$",
        "Mentor Page"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Verify user log in credentials",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@userCredentialsTest"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I open \"http://automation.techleadacademy.io/#/usermgt\"",
  "keyword": "Given "
});
formatter.match({
  "location": "step_definitions.ClassTaskSteps.iOpen(java.lang.String)"
});
formatter.write("08-27-2020 21:34:53 INFO:  opened website: http://automation.techleadacademy.io/#/usermgt");
formatter.embedding("image/png", "embedded0.png", "Screenshot | 08-27-2020 21:34:53");
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click a button \"login\"",
  "keyword": "When "
});
formatter.match({
  "location": "step_definitions.CommonPageTest.i_click_a_button(java.lang.String)"
});
formatter.write("08-27-2020 21:34:53 INFO: Clicked a button: login");
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I input \"student@techleadacademy.io\" as a \"username\"",
  "keyword": "And "
});
formatter.match({
  "location": "step_definitions.UserMgtPageTest.i_input_as_a(java.lang.String,java.lang.String)"
});
formatter.write("08-27-2020 21:34:53 INFO: Input student@techleadacademy.io in username field");
