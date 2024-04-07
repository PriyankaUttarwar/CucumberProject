Feature: Array in Homepage
Background:
Given : The user is on DS Algo Portal homepage
When : The user clicks on Signin button
And : The user enters "Techtesters" as username and "ipps@151" as password and clicks on login button
Then :The user should get message as "You are logged in" in homepage

@TC_AR_01
Scenario: Arrays
When : The user clicks on Get Started button of Arrays
Then : The user should be navigated to  the "Array" page

@TC_AR_02
Scenario: Arrays in Python
When : The user clicks "Arrays in Python" button
Then : The user should be redirected to "Arrays in Python" page
When : The user clicks "Try Here" button in Arrays in Python page
Then : The user should be redirected to the page having an tryEditor with a Run button to test

@TC_AR_02
Scenario: Arrays using List
When : The user clicks "Arrays using List" button.
Then : The user should be redirected to "Arrays using List" page
When : The user clicks "Try Here" button in Arrays using List page
Then : The user should be redirected to the page having an tryEditor with a Run button to test

@TC_AR_03
Scenario: Basic Operations in List
When : The user clicks the "Basic Operations in List" button
Then : The user should be redirected to "Basic Operations in List" page
When : The user clicks "Try Here" button in Basic Operations in List page
Then : The user should be redirected to the page having an tryEditor with a Run button to test

@TC_AR_04
Scenario: Applications of Array
When : The user clicks Applications of Array button
Then : The user should be redirected to "Applications of Array" page
When : The user clicks on try here Button in Applications of Array
Then : The user should be redirected to the page having an tryEditor with a Run button to test


@TC_AR_05
Scenario: Practice Questions
When : The user clicks on the "Practice Questions" button
Then : The user is redirected to a page having python programs


@TC_AR_06
Scenario: Max consecutive ones 
When : The user clicks on Max consecutive ones
Then : The user should be redirected to a page having an tryEditor with a Run and Submit button to test

@TC_AR_07
Scenario: Find the numbers with even number of digits
When : The user click on the link of Find numbers with even number of digits
Then : The user should be redirected to a page having an tryEditor with a Run and Submit button to test

@TC_AR_08
Scenario: Squares of sorted array
When : The user clicks on Squares of sorted array
Then : The user should be redirected to a page having an tryEditor with a Run and Submit button to test

@TC_AR_09
Scenario: Search the array
When : The user clicks on Search the array button
Then : The user should be redirected to a page having an tryEditor with a Run and Submit button to test




