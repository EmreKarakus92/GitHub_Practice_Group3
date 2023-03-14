@wip
Feature: As a user, i am able to click activity image, so i can see activities

  Background: User should be logged in dashboard
    Given User is on the login page
    And user should be login


  Scenario Outline: Verify user is logged in the Activity page
    When User click on the "<ImageLink>"
    Then User see URL contains "<expectedUrlContained>"
    And User see title equals "<expectedTitle>"
    Examples:
      | ImageLink | expectedUrlContained | expectedTitle         |
      | activity  | activity             | Activity - Seamlessly |