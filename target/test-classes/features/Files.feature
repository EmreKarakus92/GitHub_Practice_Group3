Feature: Uploaded file

  Scenario: As a user, i am able to click file image so i can see uploaded files
    Given user is already logged in
    When user should able to click file image
    Then user should see uploaded files
    Scenario: As a user , I am able to upload new folder over app
      Given user is already logged in
      When user should able to click file image
      And user should able to click plus button
      And user should able to click new folder option and write folder name
      And user should able to click upload button or enter keyse
      Then user should able to see folder that is uploaded on the filestable

