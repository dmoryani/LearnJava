$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("login.feature");
formatter.feature({
  "line": 1,
  "name": "DMHUB Application Login feature",
  "description": "",
  "id": "dmhub-application-login-feature",
  "keyword": "Feature"
});
formatter.before({
  "duration": 9781708200,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "DMHUB Login Test Scenario",
  "description": "",
  "id": "dmhub-application-login-feature;dmhub-login-test-scenario",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@testCase1"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "user is already on login page",
  "keyword": "Given "
});
formatter.match({
  "location": "Login_stepDefinition.user_already_on_login_page()"
});
formatter.result({
  "duration": 6686187200,
  "status": "passed"
});
formatter.after({
  "duration": 481731000,
  "status": "passed"
});
formatter.before({
  "duration": 7966961200,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "DMHUB Login Test Scenario",
  "description": "",
  "id": "dmhub-application-login-feature;dmhub-login-test-scenario",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 12,
      "name": "@TestCase2"
    }
  ]
});
formatter.step({
  "line": 16,
  "name": "user is already on login page",
  "keyword": "Given "
});
formatter.match({
  "location": "Login_stepDefinition.user_already_on_login_page()"
});
formatter.result({
  "duration": 5520545700,
  "status": "passed"
});
formatter.after({
  "duration": 105041900,
  "status": "passed"
});
});