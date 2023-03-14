@wip
Feature: As a user, i am able to see my name so ı can understand that this is my profile

  Scenario: Verify that User logins with valid credentials
    Given User is on the login page
    When User enters valid username
    And User enters valid password
    And User clicks login button
    And User should land on Dashboard page
    Then Verify user sees own profile name







