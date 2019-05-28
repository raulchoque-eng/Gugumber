Feature: Account manage
  Background:
    Given I am logged in SalesForce with "username.admin" and "password.admin"
      And I navigate to the Home page

  @deleteContact
  Scenario: Create a new contact for an user with only required data
    When I navigate to the Contacts page
    And  I create a new Contact the following data
      |Last Name |Valdez    |
    Then The contact should be displayed on contact page
#
#  @deleteContact
#  Scenario: Create a new contact for an user with all data
#    When I navigate to the Contacts page
#    And  I create a new Contact the following data
#      |Salutation|Dr.      |
#      |First Name|Cxristian|
#      |Last Name |Lujan    |
#      |Account   |Cxriss   |
#      |Phone     |12345678 |
#      |Home Page |555555   |
#      |Email     |Cxriss@email.com|
#      |Title     |Task            |
#      |Department|Test            |
#      |Birthdate |24-05-2019      |
#      |Repost To |Task001         |
#      |Lead Source|Web            |
#      |Mobile     |55555555       |
#      |Other Phone|77777777       |
#      |Fax        |123123         |
#      |Assistant  |Pedro          |
#      |AsstPhone  |838383838      |
#      |Mailing Street|S/N         |
#      |Mailing City  |S/N         |
#      |Mailing State/Province|S/N |
#      |Mailing Zip/Postal Code|S/N|
#      |Mailing Country        |S/N|
#      |Other Street           |S/N|
#      |Other City             |Cbb|
#      |Other State/Province   |No |
#      |Other Zip/Postal Code  |S/N|
#      |Other Country          |S/N|
#      |Languages              |french|
#      |Level                  |Secondary|
#      |Description            |No    |
#    Then The contact should be displayed on contact page

