#Author: jogesh 
@BrowseCourse

Feature: BrowseCourse

Background: 

Scenario: Successfully typing in the search box
Given User is on Universal homepage
When User clicks in the search box
Then check the search box is in focus
But the search box is not highlighted
Then return the boolean to be false

Scenario: Failure in searching a given course
Given User is on Universal homepage
When User clicks in the search box
And user types a invalid course name
And clicks the Find button
Then check the error message displayed
