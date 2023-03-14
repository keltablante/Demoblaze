@tag
Feature: createAccount

  @createAccount
  Scenario: Creation of Account
    Given User navigates to Demoblaze webpage
    When User creates account
    Then Close Browser