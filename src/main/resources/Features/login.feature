Feature: user should be able to login to the system


    Scenario: user login with valid username and password
      Given user open chrome driver
      And user navigate to home page
      And user press login link
      When user enter valid username and password
      And user click on login button
      #expected result
      Then user could login successfully and go to home page


    Scenario: user login with invalid username and password