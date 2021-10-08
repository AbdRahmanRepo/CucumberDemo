@Background
Feature: Login Feature 
#One Feature File will contains one Background only
Background: 
	Given Browser Should Launch
	Given Url Should Launch
Scenario: positive Testing Login Page 
	Given user navigates to Login page
	When user enters correct username and password
	And user click login button
	Then user navigates to home page 

Scenario: Negative Testing Login Page 
	Given user navigates to Login page
	When user enters correct username and password
	And user click login button
	Then user navigates to home page