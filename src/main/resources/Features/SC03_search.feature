@regression
Feature:
  Scenario: user can search for any item by item's name
    Given user navigate to home page1
    When user press on search field
    And user search with Item name"book"
    And user press on search button
    Then user could find relative result

