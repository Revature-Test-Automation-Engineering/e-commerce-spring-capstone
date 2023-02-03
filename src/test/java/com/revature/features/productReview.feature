Feature: User would like to review the product

  Background:
    Given User logged into the home page


  Scenario: User products review
    When User put product name in the input box
    """
    TShirts
    """
    When User clicks product review plus search button
    Then User is on the product review page
    When User clicks page enlarge arrow mark
    Then Page maximizes its size
    When User clicks minus button
    Then User can reduce the quantity of item to purchase
    When User clicks plus button
    Then User can increase the quantity of item to purchase
    When User clicks product delete button
    Then User cart shows zero as product quantity
    When User clicks on stars for his rating
    When User inputs comments in the product review box
    """
    This product is fairly good.
    """
    When User clicks submit review button
    Then User can see his ratings and comments
    When User clicks delete button to remove his product reviews
    Then Comments and ratings should be removed
    When User clicks X button to close the product review page
    Then User is in the home page

  Scenario: User can't rate the product he didn't purchase
    When User put product name in the input box
    """
    Jeans
    """
    When User clicks product review plus search button
    Then User is on the product review page
    When User clicks on stars for his rating
    When User inputs comments in the product review box
    When User clicks submit review button
    Then User should get a message that you can't rate a product that you didn't purchase
    When User clicks X button to close the product review page
    Then User is in the home page

  Scenario Outline: User comment less than a word
    When User put product name in the input box
    """
    Jeans
    """
    When User clicks product review plus search button
    Then User is on the product review page
    When User clicks on stars for his rating
    When User inputs "<comments>" in the product review box
    When User clicks submit review button
    Then User should get appropriate message for the product review box
    When User clicks X button to close the product review page
    Then User is in the home page

    Examples:
      |    comments  |
      |    a         |
      | 123654       |
      |  $%#@&       |

