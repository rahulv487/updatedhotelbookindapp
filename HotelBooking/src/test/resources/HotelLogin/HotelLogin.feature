#Author: Rahul

Feature: Login

Scenario: check the heading of the login page
Given User is on login page
Then check the heading of the age

Scenario: Successful login with valid data
Description: to login, user needs to enter his valid username, password
Given User is on login page
When user enters valid username, valid password
Then navigate to hotel booking

Scenario: Prompt user to enter the data when he leaves the login fields empty
Given User is on login page
When user doesnot enter either username or password
And clicks the Login Button
Then display appropriate message

Scenario: Unsuccessful login due to incorrect username or password
Given User is on login page
When user enters incorrect username or password
Then display login failed message
