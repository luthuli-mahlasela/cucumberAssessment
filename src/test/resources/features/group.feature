@group, @regression,@sanity
Feature: group

  Background: as a user i want to login to ndosi website
    Given i am on login
    And I enter email admin@gmail.com
    And I enter password @12345678
    When I click on login button
    Then I should be logged in successfully


  Scenario: as admin i want to create a group
    Given I navigate to admin panel
    When I click on group
    And I create a group
    Then I logout from site
    And I navigate to sign-up
    Then I validate that the group created exist

