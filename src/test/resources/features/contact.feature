@contact @delete-contact @create-account @delete-account
Feature: Contact manage
  Background:
    Given I am logged in SalesForce with "username.admin" and "password.admin"
      And I navigate to the Home page

  Scenario: Create a new contact for an user with only required data
    When I go to the Contacts page
      And I open Contact form
      And I create a new Contact with the following information in Contact form
      | Last Name | Valencia |
    Then a message that indicates the Contact was created should be displayed
      And the contact last name should be displayed in the Contact Profile page
    When I go to the Contact Details
    Then the contact last name should be displayed in the Contact Details page
    When I go to the Contacts page
    Then the contact last name should be displayed in the contacts list of Contacts page

  Scenario: Create a new contact for an user with only required data
    When I go to the Contacts page
      And I open Contact form
      And I create a new Contact with the following information in Contact form
      | Salutation              | Dr.              |
      | First Name              | Cxristian        |
      | Last Name               | Lujan            |
      | Account                 | Account_Test     |
      | Title                   | Task             |
      | Department              | Test             |
      | Reports To              | Contact Event    |
      | Lead Source             | Web              |
      | Phone                   | 12345678         |
      | Other Phone             | 777777           |
      | Fax                     | 123123           |
      | Mobile                  | 55555555         |
      | Home Phone              | 4444444          |
      | Email                   | Cxriss@email.com |
      | Assistant               | Pedro            |
      | Asst Phone              | 838383           |
      | Mailing Street          | S/N              |
      | Mailing City            | S/N              |
      | Mailing State/Province  | S/N              |
      | Mailing Zip/Postal Code | S/N              |
      | Mailing Country         | S/N              |
      | Other Street            | S/N              |
      | Other City              | Cbb              |
      | Other State/Province    | No               |
      | Other Zip/Postal Code   | S/N              |
      | Other Country           | S/N              |
      | Languages               | french           |
      | Level                   | Secondary        |
      | Description             | No               |
    Then a message that indicates the Contact was created should be displayed
      And the contact last name should be displayed in the Contact Profile page
    When I go to the Contact Details
    Then the contact last name should be displayed in the Contact Details page
    When I go to the Contacts page
    Then the contact last name should be displayed in the contacts list of Contacts page
