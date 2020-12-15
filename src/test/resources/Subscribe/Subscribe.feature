#Author : Rajesh
@SignIn

Feature: Subscribe  

Scenario: Successful Signup with Valid Credentails
Given User Launch Chrome browser
When User opens URL "https://www.universalclass.com/"
Then go to Main menu and click on Subscribe
And click on any Plantium to Start
When User enter Valid Firstname"Xyz" , Lastname "abc" , Email "xyzabc@gmail.com"  and Password "xyzabc@123"
And Click on Checkbox to agree terms and coditions
And Click on Signup
 
Scenario Outline: Signup Unhappy path Test Conditions
Given User Launch Chrome browser
When User opens URL "https://www.universalclass.com/"
Then go to Main menu and click on Subscribe
And click on any Plantium to Start
When User enter valid Firstname <Firstname>,invalid Lastname <Lastname>, invalid Email <email>  and  invalid Password <password>
And Click on Checkbox to agree terms and coditions
And Click on Signup


Examples:
|Firstname|Lastname|email|password|
|Xyz|abc|"xyzabc@gmail.com"|"xyzabc@123"|
|Xyz|123|"xyzabc@gmailcom"|1234567|
|345|123|xyzabc@gmail.com|xyzabc@123|
|345|abc|xyzabc@gmail.com|1234567|
|345|abc|xyzabc@gmailcom|xyzabc@123|
|Xyz|abc|xyzabc@gmailcom|xyzabc@123|
|Xyz|abc|xyzabc@gmail.com|1234567|
|Xyz|123|xyzabc@gmail.com|xyzabc@123|


      