Feature: General Store Purchasing Website

  Scenario: Verify Initial datas before shopping
    Given User is on the Home Page
    When user clicks the Countrty field
    And User selects the Country
    And User enters name in the name field
    And User selects the Gender
    And User verifies other gender button
    And User clicks lets shop button
    Then user should navigates to Products page
