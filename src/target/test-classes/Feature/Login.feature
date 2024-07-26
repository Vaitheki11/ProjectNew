Feature: Validation of login page in LiveTraining web application

Background:
Given User is on the Livetraining application


Scenario Outline: TC01_Validation of login page with valid crendentials
When User to click login
When User enters valid "<username>" and "<password>"
And User clicks on Login button
Then User Verifies home page is displayed

Examples:
|username|password|
|vai@gmail.com|123456|


Scenario: TC01_Validation of login page with invalid crendentials
When User to click login
When the user enters invalid username and password
|vai@gmail.com|
|Vai@123|
And the user clicks the login button
Then the user should see an error message indicating invalid credentials




