
Feature: feature to test login functionality

  Scenario: Check login is successful with valid user
    Given user is on B2C test harness page
    When user clicks on "CIAM Test"
    And User clicks on sign in
    And user enters his username and clicks on signin
    And user enters his password and clicks on signin
    Then user should login successfully
