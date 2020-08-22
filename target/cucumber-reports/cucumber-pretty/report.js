$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/classTaks.feature");
formatter.feature({
  "name": "Class tasks",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@classTasks"
    }
  ]
});
formatter.scenario({
  "name": "Testing youtube",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@classTasks"
    },
    {
      "name": "@youtube"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I open \"youtube\"",
  "keyword": "Given "
});
formatter.match({
  "location": "step_definitions.ClassTaskSteps.iOpen(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I verify title is \"YouTube\"",
  "keyword": "Then "
});
formatter.match({
  "location": "step_definitions.ClassTaskSteps.iVerifyTitleIs(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click \"Trending\" button",
  "keyword": "When "
});
formatter.match({
  "location": "step_definitions.ClassTaskSteps.iClickButton(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});