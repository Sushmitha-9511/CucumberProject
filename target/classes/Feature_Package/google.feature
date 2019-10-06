Feature: Google
@SmokeTest
Scenario: Search via google
Given User is on the Google page
When Page loads properly
Then User will search name in  the search box
|name|
|sushmitha|


@RegressionTest
Scenario: Open the facebook.com
Given User is on facebook.com