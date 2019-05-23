#Feature: Account manage.
#  Backgroud:
#  Given I log in with a valid username and password
#  And  I navidate Home page
#
#  @deleteEvent
#  Scenario Create a new Event with required data
#    When  I open the form Event from Home page
#    And   I add a new Event with the following data
#      |Assigned To|User To Event           |
#      |Subject    |Call	                   |
#      |Start      |Today date add hour     |
#      |End        |Today date add two hours|
#    Then  the Subject of new Event should be displayed on Calendar Section
#    When  I open the Subject link
#    Then  the Event Detail section should be displayed
#
#  @deleteEvent
#  Scenario Create a new Event with all data
#    When  I open the form Event from Home page
#    And   I add a new Event with the following data
#      |Assigned To|User To Event           |
#      |Subject    |Call	                   |
#      |Name       |Contact To Event        |
#      |Related To |Account To Event        |
#      |Location   |Virginia                |
#      |Start      |Today date add hour     |
#      |End        |Today date add two hours|
#      |Description|Description Text        |
#    Then  the Subject of new Event should be displayed on Calendar Section
#    When  I open the Subject link
#    Then  the Event Detail section should be displayed
#
#  @createEvent
#  Scenario Delete an Event
#    When  I open the "Other" Event
#    And   I delete the Event
#    Then  the Event should be clear from the list of Events