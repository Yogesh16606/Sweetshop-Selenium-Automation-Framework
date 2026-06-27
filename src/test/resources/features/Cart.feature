Feature: Cart Functionality

  Scenario: Add all sweets to cart

    Given User launches cart application
    When User opens sweets catalog page
    And User adds all sweets to cart
    Then All sweets should be available in cart

  Scenario: Add selected sweets to cart

    Given User launches cart application
    When User opens sweets catalog page
    And User adds selected sweets to cart
    Then Selected sweets should be available in cart