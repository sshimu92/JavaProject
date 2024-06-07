@Login
Feature: saucedemo login

@positive
Scenario: login with valid credentials
  Given open the browser
  And navigate to saucedemo
  When user enters "standard_user" and "secret_sauce" as username and password
  And click on login button
  Then user should be logged in successfully 
  
@negative
Scenario Outline: login with invalid credentials
  Given open the browser
  And navigate to saucedemo
  When user enters "<username>" and "<password>" as username and password
  And click on login button
  Then User get "<error>" as error message
  
  
  Examples: Credentials Data
  
  |username        |password   |error                                                                    |
  |                |           |Epic sadface: Username is required                                       |
  |locked_out_user |           |Epic sadface: Password is required                                       |
  |                |secret_sauc|Epic sadface: Username is required                                       |             
  |standard_user   |secret_sauc|Epic sadface: Username and password do not match any user in this service|