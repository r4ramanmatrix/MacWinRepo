Feature: Testing the Books page 

Scenario: Validating the Books Page 
	Given user naviage to the "http://demowebshop.tricentis.com/" page 
	When the user click on the login link 
	Then the user should be on the login page 
	And user enters the below credentials and click on login button 
		|USERNAME				|PASSWORD	|
		|abc1		|	abc1	|
		|abc2@gmail.com			|	abc12	|
		|abc3@gmail.com			|	abc123	|
		|r4ramanmatrix@gmail.com|	Demo123	|
	Then the user should be on the homepage 
	And user click on the Books page 
	Then user count the number of books and sort the books according to price in ascending order 
	