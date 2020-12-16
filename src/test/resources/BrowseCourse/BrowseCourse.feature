#Author: jogesh 
@BrowseCourse

Feature: BrowseCourse

Background: 

Scenario: Successfully searching a given course
Given User is on Universal homepage
When User clicks in the search box
And user types a valid course name
And clicks the Find button

Scenario: Failure in searching a given course
Given User is on Universal homepage
When User clicks in the search box
And user types a invalid course name
And clicks the Find button
Then check the error message displayed
