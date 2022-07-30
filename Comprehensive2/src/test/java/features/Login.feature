Feature: Application login

Scenario: Successful Login with Valid Credentials
Given User Launch Chrome browser
When User opens URL "http://tide.com/en_us"
Then page Title should be "Register"
And Click on sign up now
When user enter "FirstName" and "email" and "password"
When User click on create account
And close browser
