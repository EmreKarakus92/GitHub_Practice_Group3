@wip
Feature:Seamlessly app task functionality and verification
 User story: As a user, I am able to click tasks image so I can see tasks



 Scenario: User clicks on tasks image and views contact details
   Given User is on the login page
   Given user should be login
   Then User should land on Dashboard page
   And User clicks on the Tasks image
   And User should land on Tasks Page
   Then User can see the tasks list

