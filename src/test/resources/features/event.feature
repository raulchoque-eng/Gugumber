Feature: Event manage

  Background:
    Given I am logged in SalesForce with "username.admin" and "password.admin"
      And I navigate to the Home page

  Scenario: Create a new Event with required information
    When I open the New Event form
      And I add a new Event with the following information
        | Assigned To | user one           |
        | Subject     | Call               |
        | Name        | Contact Event      |
        | Related To  | Account Event      |
        | Location    | Virginia           |
        | Start Date  | One hour from now  |
        | End Date    | Two hours from now |
        | Description | Description Text   |
    Then the Subject of new Event should be displayed on Calendar Section
