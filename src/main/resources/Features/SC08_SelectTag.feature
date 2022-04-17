Feature:
  Scenario: user could select different tags
    Given user navigate to home page
    And user hover in categories
    And user hover in subcategories and click in one
    When user could select item with Tag
    Then user navigate to Tag page