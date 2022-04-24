Feature: Testing the Homepage functionalities. 

@Smoke_Case 
Scenario: Validating Homepage links 
	Given user naviage to the "http://demowebshop.tricentis.com/" page 
	When the user click on the login link 
	Then the user should be on the login page 
	And user enters the below credentials and click on login button 
		|USERNAME				|PASSWORD	|
		|r4ramanmatrix@gmail.com|	Demo123	|
	Then the user should be on the homepage 
	And user verify the username on the homepage 
	And user verify the number of Links and text on homepage 
	
 