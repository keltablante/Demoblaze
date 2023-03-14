
@tag
Feature: End-to-end 
 
  @createAccount
  Scenario: Creation of Account
    Given User navigates to Demoblaze webpage
    When User creates account
    Then Close Browser
    
  @logIn
  Scenario: Login to demoblaze
    Given User navigates to Demoblaze webpage
    When User login using valid credentials
    Then Close Browser
    
  @addToCart
  Scenario: Add to cart
    Given User navigates to Demoblaze webpage
    When User login using valid credentials
    And User adds to cart
    Then Close Browser
    
  @checkout
  Scenario: checkout
    Given User navigates to Demoblaze webpage
    When User login using valid credentials
    And User checks out
    Then Close Browser
    
  @signOut
  Scenario: signOut
    Given User navigates to Demoblaze webpage
    When User login using valid credentials
    And User logs out
    Then Close Browser