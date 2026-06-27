Feature: Delete Cart Items Functionality

  Scenario: Delete all items from cart

    Given User launches cart application for deletion
    When User opens sweets catalog page for deletion
    And User adds all sweets into cart
    And User navigates to cart for all item deletion
    And User deletes all cart items
    Then Cart should be empty

  Scenario: Delete selected item from cart

    Given User launches cart application for deletion
    When User opens sweets catalog page for deletion
    And User adds selected sweets into cart
    And User navigates to cart for selected item deletion
    And User deletes selected cart item
    Then Selected item should be removed from cart

  Scenario: Delete multiple items from cart

    Given User launches cart application for deletion
    When User opens sweets catalog page for deletion
    And User adds selected sweets into cart
    And User navigates to cart for selected item deletion
    And User deletes multiple cart items
    Then Multiple items should be removed from cart