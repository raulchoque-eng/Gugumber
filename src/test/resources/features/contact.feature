@contact
Feature: Contact manage
  Background:
    Given I am logged in SalesForce with "username.admin" and "password.admin"
      And I navigate to the Home page

  @delete-contact
  Scenario: Create a new contact for an user with only required data
    When I go to the Contacts page
      And I open Contact form
      And I create a new Contact with the following information in Contact form
        | Last Name | Valdez |
    Then a message that indicates the Contact was created should be displayed
      And the contact last name should be displayed in the Contact Profile page
    When I go to the Contact Details
    Then the contact last name should be displayed in the Contact Details page
    When I go to the Contacts page
    Then the contact last name should be displayed in the contacts list of Contacts page

  @create-account @create-contact @delete-account @delete-contact
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
        | Birthdate               | 05/08/1990       |
        | Reports To              | Contact_Test     |
        | Lead Source             | Web              |
        | Phone                   | 12345678         |
        | Home Phone              | 4444444          |
        | Mobile                  | 55555555         |
        | Other Phone             | 777777           |
        | Fax                     | 123123           |
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
    Then the contact last name should be displayed in the Contact Details page

  Scenario: Delete a new contact for an user with only required data
    Given I go to the Contacts page
    When I open Contact form
      And I create a new Contact with the following information in Contact form
        | Last Name | Valdez |
    Then a message that indicates the Contact was created should be displayed
      And the contact last name should be displayed in the Contact Profile page
    When I delete a Contact exist in the Contact page
    Then a message that indicates the Contact was deleted should be displayed
    When I go to the Contacts page
    Then the contact last name don't should be displayed in the contacts list of Contacts page
