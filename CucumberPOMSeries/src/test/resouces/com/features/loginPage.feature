
Feature: Login page feature


  Scenario: Login page title
    Given user is on login page
    When user gets the title of the page
    Then page title should be "Login - My Shop"
  


  Scenario: Forgot Password link
    Given user is on login page
    Then forgot password link should be displayed
    
    
  Scenario: Login with correct credentials
    Given user is on login page
    When user enters usename "naveenanimation20@gmail.com"
    And user enters password "Selenium@12345"
    And user cliks on Login button
    Then user gets the title of the home page
    And page title should be "My account - My Shop"
   