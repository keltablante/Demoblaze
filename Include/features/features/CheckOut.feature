@tag
Feature: checkout

  @checkout
  Scenario: checkout
    Given User navigates to Demoblaze webpage
    When User login using valid credentials
    And User checks out
    Then Close Browser