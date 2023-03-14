Feature: As a user, i am able to click photos image so i can see uploaded images
  Env  : https://qa.seamlessly.net/
  username  :Employee61
  password  :Employee123

  @wip
  Scenario:
    Given User is on the login page
    Given user should be login
    When user click the photos icon
    #And Your photos should be selected
    Then user should see MarchImg and AugustImg
