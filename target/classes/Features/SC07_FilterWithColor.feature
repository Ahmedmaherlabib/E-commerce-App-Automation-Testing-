Feature:

  Scenario: user could filter with color
    Given user navigate to home page
    And user hover in categories
    And user hover in subcategories and click in one
    And user navigate to subcategory page
    When user choose the filteration color
    Then user found all items in the choosen color

