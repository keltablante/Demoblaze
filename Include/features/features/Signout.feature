@tag
Feature: signOut

  @signOut
  Scenario: signOut
    Given User navigates to Demoblaze webpage
    When User login using valid credentials
    And User logs out
    Then Close Browser