Feature: Login Test Smoke scenarios 

Scenario Outline: Login Flow Validation via App 
	As a user I should be able to log into my account
 	 when I try to login myself in Fitbit
  
  Execution of parameterized test for various negative login details

	Given I am on Application Home Page 
	When I choose to log in using Login link 
	And I enter valid "<username>" and valid "<password>" 
	When I tap on log in button 
	Then I should be able to login unsuccessfully 
	And a popup window shows
	
	Examples: 
	
		|	username			    | password			|
		|	george@gmail.com		|	password1		|
		|	george2@gmail.com		|	password2		|
		|	1234@hotmail.com		|	simonsays		|
		|	georgeUp@gmail.com  	|	23232332		|
		|	blink123@com     	    |	2323Weod		|
		
		
          