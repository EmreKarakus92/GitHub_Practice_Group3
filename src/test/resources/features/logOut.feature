
Feature: Library app logoutfeature
  User Story:
  As a user, I should be able to login with correct credentials to different
  accounts. And dashboard should be displayed.
  After as a user, ı should be able to logout when ı click the logout Button

  Background: For the scenarios in the feature file, user is expected to be on login page
    Given user should be login
  Scenario: Logout as a User
    And User click A Button
    And User click logout Button
    Then User see login Page