@happyPath


Feature: Happy path

 Scenario Outline: registration an account
   Given the user get the url
   When the user enter the username "<username data>"
    Then the user enter the "<email data>"
    When the user enter the password "<password data>"
    When the user enter the confirm password "<confirm data>"
    When the user click checkboxes
   When the user click the Create an account button
    Then verify the congrulations message
   Examples:
     |username data|email data|  password data |confirm data|
     |validusername |email    |password|confirmPassword|