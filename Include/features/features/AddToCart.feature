@tag
Feature: addToCart

  @addToCart
  Scenario: Add to cart
    Given User navigates to Demoblaze webpage
    When User login using valid credentials
    And User adds to cart
    Then Close Browser