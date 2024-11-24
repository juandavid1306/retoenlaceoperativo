Feature: Registration

  Scenario Outline: Successful registration
    Given Juan enter to the web page
    When Juan sends the required information to sign up
      | <username> | <password> |
    Examples:
      | username    | password |
      | juan1036964 | david13  |

  Scenario: Add items to the cart
    Given Juan enter to the web page
    When Juan adds to the cart several items
    Then Juan should can see the total price of the items
