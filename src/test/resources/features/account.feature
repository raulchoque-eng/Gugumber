Feature: Create a new account
  As an administrator
  I want to create a new account
  So that ...

  Background:
    Given I am logged in SalesForce with "username.admin" and "password.admin"
    And I navigate to the Home page

  Scenario: Create a new account from accounts page
    When I navigate to the Accounts page
    And I create a new Account with the following information
    |Name Account | AccountTest19 |
    Then I should see the information on the profile of new account
    When I navigate to the Accounts page
    Then The account should display on Account page