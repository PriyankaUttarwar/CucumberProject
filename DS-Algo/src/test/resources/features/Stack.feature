Feature: Stack in Homepage

Background:
Given : The user is on DS Algo Portal homepage
When : The user clicks on Signin button
And : The user enters "Techtesters" as username and "ipps@151" as password and clicks on login button
Then :The user should get message as "You are logged in" in homepage

@TC_ST_01
Scenario: Stack
When : The user clicks on Get Started button of Stack
Then : The user should be navigated to  the Stack page

@TC_ST_02
Scenario: User clicks on Operations in Stack
When : The user clicks on Opeartions in Stack
Then : The user should be directed to the "Operations in Stack" of stack Page
And : The user clicks on "Try here" button
Then : user should be redirected to the page having an tryEditor with a Run button to test

@TC_ST_03
Scenario: User clicks on Implementation
When : The user clicks on Implementation
Then : The user should be directed to the "Implementation" of stack Page
And : The user clicks on "Try here" button
Then : user should be redirected to the page having an tryEditor with a Run button to test

@TC_ST_04
Scenario: User clicks on Applications
When : The user clicks on Applications
Then : The user should be directed to the "Applications" of stack Page
And : The user clicks on "Try here" button
Then : user should be redirected to the page having an tryEditor with a Run button to test


