Feature: User can update his profile and user can change his payment details and user can deactivate his account
  Background:
    Given User logged into the home page

  Scenario Outline: User update your profile(Positive Testing)
    When User clicks profile button
    Then User welcome to his dashboard
    When User puts his new "<firstname>" in the input field
    When User puts his new "<lastname>" in the input field
    When User puts his new "<password>" in the input field
    When User clicks update button
    Then User gets message You've successfully updated your profile
    Examples:
      |   firstname   | |   lastname   | |   password   |
      |      Raj      | |      Soy     | |  4569Pass!   |



  Scenario Outline: User update your profile(Negative Testing)
    When User clicks profile button
    Then User welcome to his dashboard
    When User puts his new "<firstname>" in the input field
    When User puts his new "<lastname>" in the input field
    When User puts his new "<password>" in the input field
    When User clicks update button
    Then User gets appropriate message

    Examples:
      |   firstname   | |   lastname   | |   password   |
      |               | |              | |      5       |
      |    #          | |       *      | |      #       |
      |   546         | |     &&       | |     ""       |
      |   a           | |     c        | |              |
      |               | |              | | 1234Pa56*    |

  Scenario Outline: User adds payment method (Positive Testing)
    When User clicks profile button
    Then User welcome to his dashboard
    When User put "<cardNumber>" in the input field
    When User put cards "<expiryDate>" in the input field
    When User put "<ccv>" in the input field
    When User clicks add payment button
    Then A message alerts You've successfully added your payment method!
    Examples:
      |   cardNumber      |  |   expiryDate   |  |   ccv   |
      |  123456780123     |  |  05/23/2024    |  |    654  |

  Scenario Outline: User adds payment method (Negative Testing)
    When User clicks profile button
    Then User welcome to his dashboard
    When User put "<cardNumber>" in the input field
    When User put cards "<expiryDate>" in the input field
    When User put "<ccv>" in the input field
    When User clicks add payment button
    Then A mandatory appropriate input message should appear for each field
    Examples:
      |   cardNumber      |  |   expiryDate   |  |   ccv   |
      |  1                |  |  05/23/2024    |  |    6    |
      |  0                |  |  05/01/2026    |  |         |
      |                   |  |                |  |    025  |
      | 541223657894      |  |  01/28/2022    |  |   102   |
      | fghb1235          |  |  08/05/2030    |  |   852   |
      | 302132148965      |  |  06/00/0000    |  |   707   |
      | 302132148965      |  |  00/01/2025    |  |   a*b   |
      | 302132148965      |  |  20/20/0001    |  |   a*b   |

  Scenario: User delete payment method
    When User clicks profile button
    Then User welcome to his dashboard
    When User clicks delete payment method he added earlier
    Then The payment method should be removed

  Scenario: Deactivate your account
    When User clicks profile button
    Then User welcome to his dashboard
    When User put deactivate in the input field
    """
    deactivate
    """
    Then Deactivate button becomes enabled
    When User clicks DEACTIVATE button
    Then User will be logged out to login page

