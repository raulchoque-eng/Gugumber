@contact @delete-contact @create-account @delete-account
Feature: Contact manage
  Background:
    Given I am logged in SalesForce with "username.admin" and "password.admin"
      And I navigate to the Home page

  Scenario: Create a new contact for an user with only required data
    When I go to the Contacts page
      And I open Contact form
      And I create a new Contact with the following information in Contact form
        | Last Name | Carvajal |
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
        | Birthdate               | 5/06/1990        |
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
        | Mailing Street          | mailingS@mail.es |
        | Mailing City            | mailingC@mail.es |
        | Mailing State/Province  | mailStat@mail.es |
        | Mailing Zip/Postal Code | mailZip@mail.org |
        | Mailing Country         | mCountry@mail.es |
        | Other Street            | S/ Bush          |
        | Other City              | Cbba             |
        | Other State/Province    | No               |
        | Other Zip/Postal Code   | 1235             |
        | Other Country           | Yes              |
        | Languages               | french           |
        | Level                   | Secondary        |
        | Description             | No               |
    Then a message that indicates the Contact was created should be displayed
      And the contact last name should be displayed in the Contact Profile page
    When I go to the Contact Details
    Then the contact last name should be displayed in the Contact Details page
    When I go to the Contacts page
    Then the contact last name should be displayed in the contacts list of Contacts page
