Feature: As a user I want to verify the user credentials

Scenario Outline: Login with dufferent user credentials
	Given I am on Login page
	When I enter user name as <userName> and Passwrd as <password>
	And I click on Login button
	Then login should successful

Examples: 
	| userName | password |
	| "5001096"| "5001096"|
	| "632872" | "632872" |
	| "540449" | "540449" |