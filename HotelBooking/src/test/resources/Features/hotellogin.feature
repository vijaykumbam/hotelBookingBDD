Feature: Login Functionality Feature

  Background: User is already registered with the Wrbsite

  Scenario: Test login function with valid login credits
    Given User is already in login screen
    When User is entered the Username and Password
    And User click on the Login button
    Then User will navigate to Homescreen
