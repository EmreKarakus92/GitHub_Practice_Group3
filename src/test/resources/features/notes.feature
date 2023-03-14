
Feature: As a user, i am able to click notes image so i can see notes

  Background: login
    Given user should be login

  Scenario: Verify that User sees notes page after clicking notes image
    Given user should be login
    When user clicks notes image
    Then user should see notes page


