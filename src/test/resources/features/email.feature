
@smoke

Feature: email
  @email
  Scenario Outline: İnvalid email without @
    Given the user get the url
    When the user enter the username "<username data>"
    Then the user enter the "<email data>"
    Then it gives an error message for email
    Examples:
      | username data | email data |
      |validusername  |invalidEmailwithout@|

@email2
  Scenario Outline: İnvalid email without .
    Given the user get the url
    When the user enter the username "<username data>"
    Then the user enter the "<email data>"
    Then it gives an error message for email
    Examples:
      | username data | email data           |
      | validusername | invalidEmailWithoutdot |
