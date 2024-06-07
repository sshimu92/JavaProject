@Login
Feature: Login
  As a user i want login to sauce demo
  
  Background: open the browser and navigate to saucedemo
    Given User already open the website sauce demo
    #Given open the browser
    #And navigate to saucedemo

  @positive
  Scenario: Login With Valid Data
    #Given User already open the website sauce demo
    When User input "standard_user" as username "secret_sauce" as password
    Then User already on homepage

  @negative
  Scenario Outline: Login With Invalid Data
    #Given User already open the website sauce demo
    When User input "<username>" as username "<password>" as password
    Then User get "<error>" as error message

    Examples: Credentials Data
      | username        | password    | error                                                                     |
      |                 |             | Epic sadface: Username is required                                        |
      | locked_out_user |             | Epic sadface: Password is required                                        |
      |                 | secret_sauc | Epic sadface: Username is required                                        |
      | standard_user   | secret_sauc | Epic sadface: Username and password do not match any user in this service |