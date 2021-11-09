@smoke @regression
Feature: Checkbox

 Scenario Outline: verify selected a condition checkbox
   Given the user get the url
   When the user enter the username "<username data>"
   Then the user enter the "<email data>"
   When the user enter the password "<password data>"
   When the user enter the confirm password "<confirm data>"
   When the user click checkboxes
  Then verify the checkbox
   Examples:
     |username data|email data|  password data |confirm data|
     |validusername |email|password|confirmPassword|

 Scenario Outline: Verify the condition error message
    Given the user get the url
    When the user enter the username "<username data>"
    Then the user enter the "<email data>"
    When the user enter the password "<password data>"
    When the user enter the confirm password "<confirm data>"
    When the user click the Create an account button
    Then verify the checkbox error message
   Examples:
     |username data|email data|  password data |confirm data|
     |validusername |email    |password|confirmPassword|

