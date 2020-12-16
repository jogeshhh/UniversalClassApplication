#Author: Jogesh
@Payment

Feature: Payment portal

	Background: courses must be added to the cart
		Given user is on cart check out page
	  And user is navigated to the checkout page
	
  Scenario: Successful payment with all the valid data
  	When user enters all the Valid data
  	Then display information succesfully message
  
  Scenario Outline: Unsuccessful payment due to wrong CC no, CVV, Country & phone no 
  	When user enters incorrect <CC no> or <CVV> or <country> or <phoneNo>
  	Then display payment failed message
  Examples:
	|CC no|CVV|country|phoneNo|
	|"444224563453468"|"23"|"India"|"012345678"|
	|"453545647899489"|"321"|"----------"|"0123456789"|
	|"453545647899489"|"32156"|"India"|"01234567890"|
	|"4535456478994897"|"321"|"----------"|"012345678"|
	|"4535456478994898"|"8645"|"India"|"0123456789"|
	|"4535456478994897"|"321"|"----------"|"01234567890"|
	|"453545647899489845"|"3218"|"----------"|"01234567"|
	|"453545647899489765"|"32"|"India"|"0123456789"|
	|"453545647899489798"|"321"|"India"|"012345678901"|

  
