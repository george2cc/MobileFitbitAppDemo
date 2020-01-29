Feature: Setting up the Charge 3 device scenarios 
	Login Flow Validation via App 
	As a user I should be able to setup the device
	
Scenario: 
	Given I am on Application Home Page 
	When I choose to login using Login link
	When I click on Ionic menu
	Then Verify Ionic device is at top section
	When I select the Ionic image
	Then Verify the Ionic setup page displays
	
		
Scenario: 
	Given I am on Application Home Page 
	When I choose to login using Login link
	When I click on Ionic menu
	Then Verify Addidas edition is at bottom section
	When I select the Addidas edition image
	Then the Addidas edition setup page displays
	