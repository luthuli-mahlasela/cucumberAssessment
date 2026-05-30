@group, @regression,@sanity
Feature: group


  Scenario Outline: as admin user i want to login to ndosi website
    Given i am on the login page
    And I enter email <email>
    And I enter password <password>
    When I click login button
    Then i should be logged in successfully
    And I click on the logged in user
    And I click on the admin panel
    And I click on the groups tab
    And I click on the create group button
    And I enter group name <groupName>
    And I enter group description <groupDescription>
    And I enter year <year>
    And I enter max capacity <maxCapacity>
    And I enter start date <startDate>
    And I enter end date <endDate>
    When I click on the create group button
    Then i should see the group created successfully
    Examples:
      | email           | password  | groupName    | groupDescription | year | maxCapacity | startDate | endDate  |
      | admin@gmail.com | @12345678 | Dusty Rhodes | Group 2026       | 2027 | 9999        | 20260530  | 20270530 |
