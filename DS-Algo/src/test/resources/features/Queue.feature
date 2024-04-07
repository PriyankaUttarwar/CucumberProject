Feature: Queue in Homepage

Background:
Given : The user is on DS Algo Portal homepage
When : The user clicks on Signin button
And : The user enters "Techtesters" as username and "ipps@151" as password and clicks on login button
Then :The user should get message as "You are logged in" in homepage

@TC_Q_01
Scenario: Click on Getstarted 
When : The user clicks on Get Started button of Queue
Then : The user should be navigated to the Queue page

@TC_Q_02
Scenario: Click on Implementation of Queue in Python
When : The user clicks on Implementation of Queue in Python
Then : The user should be directed to the "Implementation of Queue in Python" of Queue Page
And : The user clicks on "Try here" button
Then : user should be redirected to a page having an tryEditor with a Run button to test

@TC_Q_03
Scenario: click on Implementation using collections dequeue
When : The user clicks on Implementation using collections dequeue
Then : The user should be directed to the "Implementation using collections dequeue" of Queue Page
And : The user clicks on "Try here" button
Then : user should be redirected to a page having an tryEditor with a Run button to test

@TC_Q_04
Scenario: click on Implementation using array
When : The user clicks on Implementation using array
Then : The user should be directed to the "Implementation using array" of Queue Page
And : The user clicks on "Try here" button
Then : user should be redirected to a page having an tryEditor with a Run button to test

@TC_Q_05
Scenario: click on Queue Operations
When : The user clicks on Queue Operations
Then : The user should be directed to the "Queue Operations" of Queue Page
And : The user clicks on "Try here" button
Then :  user should be redirected to a page having an tryEditor with a Run button to test




