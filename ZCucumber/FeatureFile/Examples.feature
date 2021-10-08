#Feature Level Tags #using Examples to get Data
@examplesData
Feature: this is Login feature  
Scenario Outline: this test to verify the Login 
	Given user has on Login page with Examples
	When user will enters the valid "<username>" and "<password>"
	Then user should navigated to another page

Examples:
|username|password|
|admin|admin123|
|admin2|admin1232|