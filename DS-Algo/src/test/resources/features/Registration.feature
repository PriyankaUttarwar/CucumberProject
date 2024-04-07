Feature: Registration Page


Background:

Given : The user is on the new user registration page 



Scenario Outline: Entering null values in Username and Password
When : User  enters Username form "<username>" and Password from "<password>" and Confirm Password "<confirm password>"
And : User clicks on Register button
Then : Compare with the expected message "<expected message>" that appears after clicking Register

Examples:
|username			|			password|confirm password|expected message|
|Techtesters	|							|									|Please fill in this field.|
|Techtesters	|		ipps@151	|									|Please fill in this field.|
|							|							|									|Please fill in this field.|
|Tech testers()|ipps@151		|ipps@151					|password_mismatch:The two password fields didn’t match.|
|Techtesters	|		ipps@1		|ipps@1						|password_mismatch:The two password fields didn’t match.|
|Techtesters	|		1234			|1234							|password_mismatch:The two password fields didn’t match.|

Scenario: User enters correct username and correct password
When : Users enters the username password and confirm password in respective fields and click on register
Then :User should be redirected to Home Page of DS Algo
And : The user should able to see successful message on the DS Algo Home Page


