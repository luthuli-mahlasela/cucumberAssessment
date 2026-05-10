@login,@regression
Feature: login

  Scenario Outline:   as a user i want to login to ndosi website
    Given i am on login
    And I enter email <email>
    And I enter password <password>
    When I click on login button
    Then I should be logged in successfully
    Examples:
      | email           | password  |
      | admin@gmail.com | @12345678 |
