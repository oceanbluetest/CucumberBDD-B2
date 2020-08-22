$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/UserMgt.feature");
formatter.feature({
  "name": "User Management page tests",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Register new user",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@registerUser"
    }
  ]
});
formatter.before({
  "status": "skipped"
});
formatter.step({
  "name": "I open \"http://automation.techleadacademy.io/#/usermgt\"",
  "keyword": "Given "
});
formatter.match({
  "location": "step_definitions.ClassTaskSteps.iOpen(java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I input \"Kuba\" as a \"firstname\"",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "I input \"Z\" as a \"lastname\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "I input \"444-444-4444\" as a \"phone number\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "I input \"kuba@tla.com\" as a \"email\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "I input \"Instructor\" as a \"role\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "I click a button \"Submit\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.after({
  "status": "skipped"
});
});