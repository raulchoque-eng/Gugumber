Feature: Account manage
  Background:
    Given I am logged in SalesForce with "username.admin" and "password.admin"
      And I navigate home page

  @deleteContact
  Scenario: Create a new contact for an user with required data
    When I navigate to salesforce lightning page
    And  I create a new Contact the following data
      |Salutation|Dr.      |
      |First Name|Cxristian|
      |Last Name |Lujan    |
      |Account   |Cxriss   |
      |Phone     |12345678 |
      |Home Page |555555   |
      |Email     |Cxriss@email.com|
      |Title     |Task            |
      |Department|Test            |
      |Birthdate |24-05-2019      |
      |Repost To |Task001         |
      |Lead Source|Web            |
      |Mobile     |55555555       |
      |Other Phone|77777777       |
      |Fax        |123123         |
      |Assistant  |Pedro          |
      |AsstPhone  |838383838      |
    Then The contact should be displayed on contact page
      And

