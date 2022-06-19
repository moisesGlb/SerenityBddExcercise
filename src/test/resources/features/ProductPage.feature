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

    @test3
   Scenario: User try to navigate to home page using the url without login
      Given a customer navigates to the ProductPages of swaglabs
      Then the login page is displayed
      And the error message should be dispayed
      And the error message contains the text "Epic sadface: You can only access '/inventory.html' when you are logged in."



