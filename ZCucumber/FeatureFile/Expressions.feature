#Scenario Level Tags
@simpleExpression  
Feature: this is Regular Expression Kerwords Study
@positive
Scenario: positive scenario 
	Given login with "Abdul" and "abdul1234"
	When user gets 8.7 as output
	And user gives 10 digit number 
	Then user should navigated to home page
	
@Nagative1
Scenario: Nagative scenario one
	Given login with "Abdul123" and "abdulrahman"
	When user gets 8.7 as output
	And user gives 10 digit number 
	Then user should navigated to home page
	
@Nagative2
Scenario: Nagative scenario two 
	Given login with "Abdul@12" and "abdul1234"
	When user gets 8.7 as output
	And user gives 10 digit number 
	Then user should navigated to home page
	
@Nagative3
Scenario: Nagative scenario three
	Given login with "Abdul789" and "abdul@567"
	When user gets 8.7 as output
	And user gives 10 digit number 
	Then user should navigated to home page
