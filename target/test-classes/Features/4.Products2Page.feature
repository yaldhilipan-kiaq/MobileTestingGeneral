Feature: General Store Purchasing Website

  Scenario: Verify Products page in general store
    Given User Clicks Back Button
    When User verifies the new product
    And User verifies the new price
    And User clicks the add to cart button
    And User clicks  Cart button
    Then User navigates to the Cart Page