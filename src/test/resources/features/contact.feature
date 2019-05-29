Feature: Contact manage
  Background:
    Given I am logged in SalesForce with "username.admin" and "password.admin"
      And I navigate to the Home page

     @deleteContact
  Scenario: Create a new contact for an user with only required data
    When I go to the Contacts page
      And I open Contact form
      And I create a new Contact with the following information in Contact form
        | Last Name | Valdez |
#    Then a message that indicates the Contact was created should be displayed
      And the contact last name should be displayed in the Contact Profile page
    When I go to the Contacts page
#  Then the contact last name should be displayed in the contacts list of Contacts page



#  @deleteContact
#  Scenario: Create a new contact for an user with all data
#    When I navigate to the Contacts page
#    And  I create a new Contact the following data
#      |Salutation              |Dr.              |
#      |First Name              |Cxristian        |
#      |Last Name               |Lujan            |
#      |Account                 |Cxriss           |
#      |Phone                   |12345678         |
#      |Home Page               |555555           |
#      |Email                   |Cxriss@email.com |
#      |Title                   |Task             |
#      |Department              |Test             |
#      |Birthdate               |24-05-2019       |
#      |Repost To               |Task001          |
#      |Lead Source             |Web              |
#      |Mobile                  |55555555         |
#      |Other Phone             |77777777         |
#      |Fax                     |123123           |
#      |Assistant               |Pedro            |
#      |AsstPhone               |838383838        |
#      |Mailing Street          |S/N              |
#      |Mailing City            |S/N              |
#      |Mailing State/Province  |S/N              |
#      |Mailing Zip/Postal Code |S/N              |
#      |Mailing Country         |S/N              |
#      |Other Street            |S/N              |
#      |Other City              |Cbb              |
#      |Other State/Province    |No               |
#      |Other Zip/Postal Code   |S/N              |
#      |Other Country           |S/N              |
#      |Languages               |french           |
#      |Level                   |Secondary        |
#      |Description             |No               |
#    Then The contact should be displayed on contact page

#    Scenario: Delete a contact
#    When I navigate to the Contacts page
#      And  I delete a Contact exist with the following information
#        |Last Name |Valdez |
##    Then I should see a green message "Contact was deleted."
#      Then The contact should no longer appear on the contact page
#
#    Scenario: Update a contact
#    When I navigate to the Contacts page
#      And  I update a Contact exist with the following information
#        |Last Name |Raldez |
##    Then I should see a green message "Contact "Raldez" was saved."
#      Then The contact should no longer appear on the contact page