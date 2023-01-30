Feature: Create/Update Product Page - Positive

  Scenario Outline: Admin creates a new product
    Given The admin is logged in
    When Admin clicks the Edit Product button
    When Admin clicks Create New Product button
    When Admin types a name "<name>"
    When Admin types a description "<description>"
    When Admin types an image URL "<URL>"
    When Admin types a price "<price>"
    Then Admin clicks the Create Product button
    Then Admin will be on the product update page with the correct info displayed

    Examples:
      |     name      |                 description                 |                  URL                   | price |
      | Smart Watch   | This is the newest smart watch on the market! |  https://pixabay.com/images/id-889639/ | 700 |


  Scenario Outline: Admin updates a product field
    Given The admin is logged in
    When Admin clicks the Edit Product button
    When Admin clicks on an existing product
    When Admin types a new description "<description>"
    Then Admin clicks the update button
    Then Admin will be on the product update page with the correct info displayed

    Examples:
      |             description            |
      | This description has been updated. |