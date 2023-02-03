Feature: User searching for the products

  Background:
    Given User logged into the home page

  Scenario: Search products available
    When User put product name in the input box
    """
    Shirts
    """
    When User clicks search button
    Then User can view the product details
    When User clicks the cart
    Then The cart should be added one

  Scenario Outline:  Search products not available
    When User put "<product name>" in the input box
    When User clicks search button
    Then User gets message that product not available

    Examples: | product name |
              | Tomato       |
              | @@@@###      |
              |              |
  Scenario Outline: Search product inputs clear
    When User put "<product name>" in the input box
    When User clicks X button
    Then Search input box should be cleared

    Examples: | product name |
              | Shoes        |


