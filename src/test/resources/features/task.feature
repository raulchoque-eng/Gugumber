Feature: Create scenarios for add task from home page

  Scenario: Add a new task from from page
    Given I navigate to Home page
    When I add a new task with the following values
    | Assigned | User   |
    | Asunto   | call   |
    | Priority | Normal |
    | Status   | Not Started |
    Then I should see in salesforce classic home page the new task