Feature:

  Scenario: User could switch between currencies US-Euro
    Given user navigate to home page
    When user click on the currency list
    And user change currency to Euro
    Then user found all items prices in Euro
    When user click on the currency list
    And user change currency to us-dollar
    Then user found all items prices in us-dollar