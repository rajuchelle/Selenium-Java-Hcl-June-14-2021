Feature: As a user I can create Account and verify Account details

Scenario: Login with valid credentials and create new Analysis
	Given I am on Login page
	When I enter user name as "5001096" and Passwrd as "5001096"
	And I click on Login button
	Then login should successful
	And I enter account name as "Test1" and country as "United States"
	Then I verify account name "TEST1" and country name as "US"