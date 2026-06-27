Feature: Home Page Navigation Functionality

  Scenario: Redirect user from cart page to home page using website logo

    Given User launches sweet shop application
    When User clicks website logo from cart page
    Then User should be redirected to home page successfully