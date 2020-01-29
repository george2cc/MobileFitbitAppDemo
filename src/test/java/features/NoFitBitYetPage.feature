Feature: Setting up the Charge 3 device scenarios 
	Login Flow Validation via App 
	As a user I should be able to setup the device
	
Scenario: 
	Given I am on Application Home Page 
	When I choose to login using Login link
	When the NoDeviceYest menu displays click it
	Then Verify Lets Get Started Page 