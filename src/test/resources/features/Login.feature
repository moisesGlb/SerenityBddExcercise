@regression @login
Feature: Login Scenarios

  @test1
  Scenario: Login with valid Credentials
    Given a customer navigates to the home page of swaglabs
    When the customer input the user "standard_user"
    And the customer input the password "secret_sauce"
    And the customer click on the Login button
    Then the home page is displayed

  @test2
  Scenario: Login with invalid credentials
    Given a customer navigates to the home page of swaglabs
    When the customer input the user "locked_out_user"
    And the customer input the password "secret_sauce"
    And the customer click on the Login button
    Then the error message should be dispayed
    And the error message contains the text "Epic sadface: Sorry, this user has been locked out."

  @test3
  Scenario:Missing Login Credentials
    Given a customer navigates to the home page of swaglabs
    When the customer click on the Login button
    Then the error message should be dispayed
    And the error message contains the text "Epic sadface: Username is required"

  @test4
  Scenario:Missing Password
    Given a customer navigates to the home page of swaglabs
    When the customer input the user "standard_user"
    When the customer click on the Login button
    Then the error message should be dispayed
    And the error message contains the text "Epic sadface: Password is required"

  @test5
  Scenario:Validate Error message close button
    Given a customer navigates to the home page of swaglabs
    When the customer click on the Login button
    And the error message should be dispayed
    And the user close the error message
    Then the error message is closed