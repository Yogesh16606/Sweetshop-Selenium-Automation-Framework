Feature: Popular Items Functionality

  Scenario: Add all popular items from home page into basket

    Given User launches application for popular items validation
    When User adds all popular items from home page into basket
    Then All popular items should be added successfully into basket