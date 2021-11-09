@username
@smoke

Feature: username

  Scenario Outline: Invalid username with white space
    Given the user get the url
    When the user enter the username "<username data>"
    Then it gives an error
    Examples:
      | username data |
      |invalidUsernameWithWhiteSpace|

  Scenario Outline: Invalid username with punctation
    Given the user get the url
    When the user enter the username "<username data>"
    Then it gives an error
    Examples:
      | username data |
      | invalidUserNameWithpunctuation|

  Scenario Outline: Invalid username With less count
    Given the user get the url
    When the user enter the username "<username data>"
    Then it gives an error
    Examples:
      | username data |
      | invalidUserNameWithLessCount|

  Scenario Outline: invalid username with more count
    Given the user get the url
    When the user enter the username "<username data>"
    Then it gives an error
    Examples:
      | username data |
      | invalidUserNameWithMoreCount|