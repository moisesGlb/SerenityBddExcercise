@regression @homePage
Feature: Home Page Feature

  @test1
  Scenario: Sort prices low to high
    Given a customer navigates to the home page of swaglabs
    When the customer input the user "standard_user"
    And the customer input the password "secret_sauce"
    And the customer click on the Login button
    And the home page is displayed
    And the customer select the sort order low to high
    Then the products are sorted by prices low to high

  @test2
  Scenario: Sort prices high to low
    Given a customer navigates to the home page of swaglabs
    When the customer input the user "standard_user"
    And the customer input the password "secret_sauce"
    And the customer click on the Login button
    And the home page is displayed
    And the customer select the sort order high to low
    Then the products are sorted by prices high to low



