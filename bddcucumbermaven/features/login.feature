Feature: As a user I want to verify the login funtionality

@RegressionTest
Scenario: Login with valid credentials
	Given I am on home page
	When I enter user name as 5001096 and Passwrd as 5001096
	And I click on Login button
	Then login should successful
	
@SanityTest @SmokeTest
Scenario: Login with valid credentials
	Given I am on home page
	When I enter user name as 1234567 and Passwrd as 1234567
	And I click on Login button
	Then login should fail