$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:/C:/Users/Sushmitha/eclipse-workspace/CucumberFrameworkPractise/src/main/java/Feature_Package/google.feature");
formatter.feature({
  "name": "Google",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Search via google",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "name": "User is on the Google page",
  "keyword": "Given "
});
formatter.match({
  "location": "google_StepDefinition.goToGoogle()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Page loads properly",
  "keyword": "When "
});
formatter.match({
  "location": "google_StepDefinition.waitForPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User will search name in  the search box",
  "rows": [
    {
      "cells": [
        "name"
      ]
    },
    {
      "cells": [
        "sushmitha"
      ]
    }
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "google_StepDefinition.searchElement(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Open the facebook.com",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@RegressionTest"
    }
  ]
});
formatter.step({
  "name": "User is on facebook.com",
  "keyword": "Given "
});
formatter.match({
  "location": "google_StepDefinition.openFacebook()"
});
formatter.result({
  "status": "passed"
});
});