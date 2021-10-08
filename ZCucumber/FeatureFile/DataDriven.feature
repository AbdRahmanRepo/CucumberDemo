#Feature Level Tags   #using DataTables to get data with&without Header
@dataTable         
Feature: this is Login functionality 
Scenario: this test  Login using DataTable
	Given user has on Login page
	When user enters the valid username and password without header
	|abdul|abdul1234|
	And user enters the valid username and password with header
	|username1|password1|
	|abdulrahman|abdul9876|
	Then user navigated to home page 