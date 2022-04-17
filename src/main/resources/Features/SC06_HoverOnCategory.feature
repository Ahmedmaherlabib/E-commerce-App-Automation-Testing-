Feature:
  Scenario: user can hover in categories and subcategories and click in subcategory
    Given user navigate to home page
    When user hover in categories
    And user hover in subcategories and click in one
    Then user navigate to subcategory page