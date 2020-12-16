#Author: Rajesh
@ForgotPassword

Feature: Password

 Scenario: Password
 Given User Launch Chrome browser
 When User opens URL
 Then go to Main menu and click on Signin
 And Click on forgot your password
 Then enter valid mail as "kavururajesh8514@gmail.com"
 And click on reset password
 
  Scenario Outline: Password with unhappy Path Test condition
 Given User Launch Chrome browser
 When User opens URL
 Then go to Main menu and click on Signin
 And Click on forgot your password
 Then enter invalid <email>
 And click on reset password
 Examples:
 |email|
 |"kavururajesh@gmail.com"|