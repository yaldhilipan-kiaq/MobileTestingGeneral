Feature: General Store Purchasing Website

  Scenario: Verify Products page in general store
    Given User is on the products page
    When User verifies the product
    And User verifies the price
    And User clicks add to cart button
    And User clicks the Cart button
    Then User navigates to Cart Page
