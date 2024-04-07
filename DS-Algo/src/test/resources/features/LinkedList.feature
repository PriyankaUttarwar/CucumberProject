Feature: Linked List in Homepage

Background:
Given : The user is on DS Algo Portal homepage
When : The user clicks on Signin button
And : The user enters "Techtesters" as username and "ipps@151" as password and clicks on login button
Then :The user should get message as "You are logged in" in homepage

@TC_LL_01
Scenario: Linked List
When : The user clicks on Get Started button of Linked List

Then : The user should be navigated to  the Linked List page

@TC_LL_02
Scenario: User clicks on Introduction
When : The user clicks on Introduction button
Then : The user should be directed to "Introduction" of Linked List Page
And : The user clicks on "Try here" button
Then : User should be redirected to the page having an tryEditor with a Run button to test

@TC_LL_03
Scenario: User clicks on Create a Linked List
When : The user clicks  Creating a Linked List button
Then : The user should be directed to "Creating Linked List" of Linked List Page
And : The user clicks on "Try here" button
Then : User should be redirected to the page having an tryEditor with a Run button to test

@TC_LL_04
Scenario: User clicks on Types of Linked List
When : User clicks the Types of Linked List button
Then : The user should be directed to "Types of Linked List" of Linked List Page
And : The user clicks on "Try here" button
Then : User should be redirected to the page having an tryEditor with a Run button to test

@TC_LL_05
Scenario: User clicks on Implement Linked List in Python
When : User clicks Implement Linked List in Python
Then : The user should be directed to "Implement Linked List in Python" of Linked List Page
And : The user clicks on "Try here" button
Then : User should be redirected to the page having an tryEditor with a Run button to test

@TC_LL_06
Scenario: User clicks on Traversal
When : User clicks on Traversal button
Then : The user should be directed to "Traversal" of Linked List Page
And : The user clicks on "Try here" button
Then : User should be redirected to the page having an tryEditor with a Run button to test

@TC_LL_07
Scenario: User clicks on Insertion
When : User clciks on Insertion button
Then : The user should be directed to "Insertion" of Linked List Page
And : The user clicks on "Try here" button
Then : User should be redirected to the page having an tryEditor with a Run button to test

@TC_LL_08
Scenario: User clicks on Deletion
When : User clicks on Deletion button
Then : The user should be directed to "Insertion" of Linked List Page
And : The user clicks on "Try here" button
Then : User should be redirected to the page having an tryEditor with a Run button to test








