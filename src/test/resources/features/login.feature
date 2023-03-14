
  Feature: As a user, i want to login so i can access my profile

    Background: login page
      Given User is on the login page


    Scenario: Verify that User logins with valid credentials
      When User enters valid username
      And User enters valid password
      And User clicks login button
      Then User should land on Dashboard page

    Scenario: Verify that User is not able to login invalid credentials
      When User enters invalid username
      And User enters invalid password
      And User clicks login button
      Then User should see error message

     Scenario: Verify that user is able to login
       Given user should be login