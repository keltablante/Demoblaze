@tag
Feature: logIn

  @logIn
  Scenario: Login to demoblaze
    Given User navigates to Demoblaze webpage
    When User login using valid credentials
    Then Close Browser