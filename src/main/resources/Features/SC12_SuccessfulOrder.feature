Feature:
  Background:
  #Scenario: user login with valid username and password
    Given user navigate to home page
    And user press login link
    When user enter valid Email and password
    And user click on login button
    Given user could add items to shoppingCart
    When user go to Shopping cart
    #Then user found the chosen items in shoppingCart

  Scenario: user make successful order
    When user click checkout button

