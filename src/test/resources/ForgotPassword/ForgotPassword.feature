#Author : Jogesh
@ForgotPassword

Feature: Forgot Password functionality
	
	Scenario: Successful resetting the password
	Given user is on the forgot password page
	When user enter the valid email address
	Then navigate to the forgot password page
	And display success message
	
	Scenario: Failure in resetting the password
	Given user is on the forgot password page
	When user enter the invalid email address
	Then nvaigate to the display error page
	
