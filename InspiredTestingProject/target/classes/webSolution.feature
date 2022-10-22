Feature: FaXimme Web

  Scenario: Login functionality for online shop website.

    Given user navigates to online shop
    When User enter Username and Password
    Then login should be successful

    Scenario: Buy a backpack
    Given User Select a backpack
    When  User Add a backpack to cart
    And   User View the cart
    Then  User Remove backpack from cart
    And   User navigate to home page



