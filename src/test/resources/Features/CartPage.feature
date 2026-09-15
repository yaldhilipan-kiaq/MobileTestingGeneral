Feature: General Store Purchasing Website

  Scenario: Verifying the Cart Page Fucntionalities
    Given User is on the Cart Page
    When User Verifies the Shoe is added
    And User verifies the Shoe price
    And User Verifies the second product is added
    And User verifies the second product price
    And User verifies the Total Purchase Amount
    And User clicks the Checkbox
    And User clicks visit official site
    Then It navigates to new page
