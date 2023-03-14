Feature: uploaded file
  Background:
    Given User is on the login page
    Given user should be login

  Scenario: As a user, i am able to click file image so i can see uploaded files

    When user should be able to click file image
    Then user should see uploaded files

   # Scenario: As a user , I am able to upload new folder over app

   #  When user should be able to click file image
    #  And user should be able to click plus button
     # And user should be able to click file new folder option and write folder name
      #And user should be click upload button or enter keyse
     # Then user should be see folder that is uploaded on the filestable