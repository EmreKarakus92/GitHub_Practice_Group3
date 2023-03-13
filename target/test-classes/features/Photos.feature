Feature: As a user, i am able to click photos image so i can see uploaded images
  Env: https://qa.seamlessly.net/
  Username: Employee61      password: Employee123

  Scenario: verify user can click photos image and see uploaded images
    Given user is on Seamlessly page
    When user click on Photos icon
    And user click on Your photos
    Then user sees March Img and August Img
