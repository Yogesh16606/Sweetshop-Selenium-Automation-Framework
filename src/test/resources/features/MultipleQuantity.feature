Feature: Multiple Quantity Cart Functionality

  Scenario: Add same items multiple times into basket

    Given User launches application for multiple quantity validation
    When User adds same products multiple times into basket
    Then Product quantities should be updated successfully in basket