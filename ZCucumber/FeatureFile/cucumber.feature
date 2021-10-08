#Feature Level Tags
@simpleLogin 
Feature: this is Login feature of the Facebook 
Scenario: this test to verify the Login Page 
	Given user has to on Login page
	When user enters the valid username and password
	And user clicks the login button
	Then user should navigated to home page 