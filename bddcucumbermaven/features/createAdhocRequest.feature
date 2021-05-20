Feature: As a user I can able to create adhoc request and verifies adhoc request

Scenario: Create Adhoc request
	Given adhoc popup shoud be available
	When user enters the valid adhoc request data
				| adhocName | segmentName | accountNumbers | selectdate |
				| reques1 	| FXE International|123456,345678 | 18052021 |
				| request2 | FXE Domestic | 6482686,8628926 | 17052021	|
				| request3 | FXE Ground 	| 35835535,57385757	| 16052021 |	
	Then adhoc request should be created
#	And verfiy adhoc data "reques1","FXE International",123456,345678,18052021,82638538,"Request Submted","status success","Update", "Close"