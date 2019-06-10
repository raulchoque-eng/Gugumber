@accounts
Feature: Create a new account
  As an administrator
  I want to create a new account

  Background:
    Given I am logged in SalesForce with "username.admin" and "password.admin"
      And I navigate to the Home page

  @delete-account
  Scenario: Create a new account with requirement fields from accounts page
    When I open the Accounts page
      And I open the Account form from Accounts page
      And I create a new Account with the following information
        | Account Name | Account Test |
    Then the account name should be displayed in the Account page
    When I go to the Account Details from Account page
    Then the account name should be displayed in the Account Details
    When I open the Accounts page
    Then the account should be displayed on Accounts page

  @delete-account
  Scenario: Create a new account with all fields from accounts page
    When I open the Accounts page
      And I open the Account form from Accounts page
      And I create a new Account with the following information
        | Account Name             | Account Test |
        | Parent Account           | Parent Test  |
        | Account Number           | 10 A         |
        | Account Site             | site         |
        | Type                     | Prospect     |
        | Industry                 | Agriculture  |
        | Annual Revenue           | 1            |
        | Rating                   | Hot          |
        | Phone                    | 1234567      |
        | Fax                      | 1234567      |
        | Website                  | mywebsite    |
        | Ticker Symbol            | ticker       |
        | Ownership                | Public       |
        | Employees                | 10           |
        | SIC Code                 | 1234         |
        | Billing Street           | Simon Lopez  |
        | Billing Zip/Postal Code  | 00100        |
        | Billing City             | Cochabamba   |
        | Billing State/Province   | Cercado      |
        | Billing Country          | Bolivia      |
        | Shipping Street          | Simon Lopez  |
        | Shipping Zip/Postal Code | 00100        |
        | Shipping City            | Cochabamba   |
        | Shipping State/Province  | Cercado      |
        | Shipping Country         | Bolivia      |
        | Customer Priority        | High         |
        | SLA Expiration Date      | Today        |
        | Number of Locations      | 2            |
        | Active                   | No           |
        | SLA                      | Gold         |
        | SLA Serial Number        | 7            |
        | Upsell Opportunity       | Maybe        |
        | Description              | Sample test. |
    Then the account name should be displayed in the Account page
    When I go to the Account Details from Account page
    Then the account name should be displayed in the Account Details
    When I open the Accounts page
    Then the account should be displayed on Accounts page
