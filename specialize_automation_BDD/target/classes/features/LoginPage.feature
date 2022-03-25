Feature: Testing the LoginPage functionalities. 

Scenario: Validating the user credentials 
	Given user naviage to the "http://demowebshop.tricentis.com/" page 
	When user click on the login link 
	Then user should be on the login page 
	And user enters the below credentials and click on login button 
		|username|password|
		|user_01|user123|
	Then user should be on the homepage 
 