Feature: login functionality

  Scenario: Successful login with valid credentials
    
    Given user is on login page
    When user enters username and password
    And clicks on login button
    Then user is navigaated to the home page

 