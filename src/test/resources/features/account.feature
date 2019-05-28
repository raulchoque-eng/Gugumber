Feature: Create a new account
  As an administrator
  I want to create a new account

  Background:
    Given I am logged in SalesForce with "username.admin" and "password.admin"
    And I navigate to the Home page

  Scenario: Create a new account from accounts page
    When I navigate to the Accounts page
    And I create a new Account with the following information
    |Name Account | AccountTest20 |
    Then The information account should display in the profile account
    When I navigate to the Accounts page
    Then The account should display on Account page