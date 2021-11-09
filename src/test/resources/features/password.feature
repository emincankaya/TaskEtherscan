@password
@smoke

Feature: password

  Background:
    Given the user get the url

  @smoke2
  Scenario Outline: Invalid password with less count
    When the user enter the username "<username data>"
    Then the user enter the "<email data>"
    When the user enter the password "<password data>"
    Then it gives an error message for password"<String>"
    Examples:
      | username data | email data | password data                | String                                            |
      | validusername | email      | invalidPasswordWithLessCount | Your password must be at least 5 characters long. |


  Scenario Outline: Invalid Confirm Password
    When the user enter the username "<username data>"
    Then the user enter the "<email data>"
    When the user enter the password "<password data>"
    When the user enter the confirm password "<confirm data>"
    Then it gives a error message for confirm password
    Examples:
      | username data | email data | password data | confirm data           |
      | validusername | email      | password      | invalidConfirmPassword |

  Scenario Outline: Verify Weak Password Message
    When the user enter the username "<username data>"
    Then the user enter the "<email data>"
    When the user enter the password "<password data>"
    Then it gives a message for password's strength"<passwords strength>"
    Examples:
      | username data | email data | password data | passwords strength |
      | validusername | email      | weakPassword  | Weak               |


  Scenario Outline: Verify Medium Password Message
    When the user enter the username "<username data>"
    Then the user enter the "<email data>"
    When the user enter the password "<password data>"
    Then it gives a message for password's strength"<passwords strength>"
    Examples:
      | username data | email data | password data  | passwords strength |
      | validusername | email      | mediumPassword | Medium             |


  Scenario Outline: Verify Strong Password Message
    When the user enter the username "<username data>"
    Then the user enter the "<email data>"
    When the user enter the password "<password data>"
    Then it gives a message for password's strength"<passwords strength>"
    Examples:
      | username data | email data | password data  | passwords strength |
      | validusername | email      | strongPassword | Strong             |

  Scenario Outline: Invalid Confirm Password With less count
    When the user enter the username "<username data>"
    Then the user enter the "<email data>"
    When the user enter the password "<password data>"
    When the user enter the confirm password "<confirm data>"
    Then it gives an error message for confirm password"<String>"
    Examples:
      | username data | email data | password data | confirm data           | String                                           |
      | validusername | email      | password      | invalidPasswordWithLessCount | Your password must be at least 5 characters long. |