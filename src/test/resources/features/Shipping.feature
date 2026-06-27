Feature: Shipping Charge Functionality

  Scenario: Add standard shipping charge successfully

    Given User launches application for shipping validation
    When User selects standard shipping charge
    Then Standard shipping charge should be added successfully

  Scenario: Verify shipping charge defect when cart already contains products

    Given User launches application for shipping validation
    When User opens sweets catalog page for shipping validation
    And User adds selected products into basket
    And User navigates to checkout basket page
    Then Shipping charge should not be applied when cart already contains products