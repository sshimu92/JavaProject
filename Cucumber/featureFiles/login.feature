Feature: As a registered user I want to use login form so that I can login to the system

Scenario: Login with valid username and password
  Given User is in homepage
  When Clicks on login button
  Then User see the login page
  And enter username 'standard_user'
  And enter password 'secret_sauce'
  And click login button
  Then user redirected to the Swag Labs Page
  
 Scenario: Login with invalid username and password
  Given User is in homepage
  And clicks on login button
  And enter username 'standauser'
  And enter password 'sec_sauce'
  And click login button
  Then user sees the error message
  
  
  
  

  
  

  