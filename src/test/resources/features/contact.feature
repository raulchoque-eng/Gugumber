#@contact
#Feature: Contact manage
#  Background:
#    Given I am logged in SalesForce with "username.admin" and "password.admin"
#      And I navigate to the Home page
#
#  @delete-contact
#  Scenario: Create a new contact for an user with only required data
#    When I go to the Contacts page
#      And I open Contact form
#      And I create a new Contact with the following information in Contact form
#        | Last Name  | Verduguez |
#    Then a message that indicates the Contact was created should be displayed
#      And the contact last name should be displayed in the Contact Profile page
#    When I go to the Contact Details
#    Then the contact last name should be displayed in the Contact Details page
#    When I go to the Contacts page
#    Then the contact last name should be displayed in the contacts list of Contacts page
##    When I request the get of the contact
##    Then the response should contain the contact information