$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/UserMgt.feature");
formatter.feature({
  "name": "User Management page tests",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Verify Login button",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@verifyButton"
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
formatter.write("08-22-2020 14:13:01 INFO:  opened website: http://automation.techleadacademy.io/#/usermgt");
formatter.embedding("image/png", "embedded0.png", "Screenshot | 08-22-2020 14:13:01");
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
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I verify title is \"Login Page\"",
  "keyword": "Then "
});
formatter.match({
  "location": "step_definitions.ClassTaskSteps.iVerifyTitleIs(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Verify User Database button",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@verifyButton"
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
formatter.write("08-22-2020 14:13:01 INFO:  opened website: http://automation.techleadacademy.io/#/usermgt");
formatter.embedding("image/png", "embedded1.png", "Screenshot | 08-22-2020 14:13:01");
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click a button \"access db\"",
  "keyword": "When "
});
formatter.match({
  "location": "step_definitions.CommonPageTest.i_click_a_button(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I verify title is \"User DB\"",
  "keyword": "Then "
});
formatter.match({
  "location": "step_definitions.ClassTaskSteps.iVerifyTitleIs(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});