
Feature: As a user I want to create new analysis

@SmokeTest
Scenario: Login with valid credentials
	Given I am on home page
	When I enter user name as "5001096" and Passwrd as "5001096"
	And I click on Login button
	Then login should successful
	And set Acount name and selet country
	And click on Create analysis button
	Then analysis shoud be created
	
	
