Feature: Login Functionality

Scenario Outline: Verify login using Excel data

    Given User launches browser
    When User opens login page
    And User logs in using Excel row "<row>"
    Then Login result should be "<status>"

Examples:
| row | status |
| 1 | success |
| 2 | success |
| 3 | success |
| 4 | failure |