Feature: Event manage
  As an administrator
  I want to manage an Event

  Background:
    Given I am logged in SalesForce with "username.admin" and "password.admin"
      And I navigate to the Home page

#  @delete-event
#  Scenario: Create a new Event with required information
#    When I open the New Event form
#      And I add a new Event with the following information
#        | Assigned To | Automation Testing |
#        | Subject     | Call               |
#        | Start Date  | One hour from now  |
#        | End Date    | Two hours from now |
#    Then the Subject of new Event should be displayed on Calendar Section
#    When I open the Event Details page from Calendar Section
#    Then the information of new Event should be displayed in Event Detail page
#
#  @delete-event
#  Scenario: Create a new Event with all information
#    When I open the New Event form
#      And I add a new Event with the following information
#        | Assigned To | Automation Testing |
#        | Subject     | Call               |
#        | Name        | Contact Event      |
#        | Related To  | Account Event      |
#        | Location    | Virginia           |
#        | Start Date  | One hour from now  |
#        | End Date    | Two hours from now |
#        | Description | Description Text   |
#    Then the Subject of new Event should be displayed on Calendar Section
#    When I open the Event Details page from Calendar Section
#    Then the information of new Event should be displayed in Event Detail page

  @create-event
  Scenario: Delete an Event with subject "Launch" that I was created previously
    When I open the Event that with subject with name Launch
    And I delete the Event selected
    Then the Event is clear the Calendar Section