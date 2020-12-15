#Author : Rajesh
Feature: Signin
 
 Scenario: Successsful login with valid credentials
 Given User Launch Chrome browser
 When User opens URL "https://www.universalclass.com/"
 Then go to Main menu and click on Signin
 And User enters Email as "kavururajesh8514@gmail.com" and Password as "Rajesh@143"
 And Click on Signin

 
 Scenario Outline: login with Unhappy Path Test Condition
 Given User Launch Chrome browser
 When User opens URL "https://www.universalclass.com/"
 Then go to Main menu and click on Sign
 And User enters Email as <Email> and Password as <Password>
 And Click on Signin
Examples:
|Email|Password|
|kavururajesh8514@gmailcom|Rajesh@143|
|kavururajesh8514@gmail.com|Raj@1234|
|kavururajesh8514@gmailcom|Raj@1234|
 