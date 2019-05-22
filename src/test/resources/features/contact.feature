Feature: Account manage
  Background:
    Given I log in with a valid username and password
    And I navigate home page


  @deleteContact
  Scenario: Create a new workspace for an user with required data
    When I navigate to salesforce lightning page
    And  I create a new Contact the following data
    salutation| First Name| Last Name|
    Dr.       |Cxristian  |Lujan     |

    Then The contact should be displayed on contact page

