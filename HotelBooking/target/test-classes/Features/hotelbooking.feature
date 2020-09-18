Feature: Booking Feature checking

  Background: User is already loggedin website

  Scenario: Test the booking form
    Given User is already in the Hotel Booking form
    When User is entered the details
    And User entered the confirm Booking button
    Then User will get the Booking msg
