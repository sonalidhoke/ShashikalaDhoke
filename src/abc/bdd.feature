Feature: Login Functionality for  OpenCart  E=commerce Website
  As a user of the opecart 	website
  I want be able to login with my website
  So that i can access my account- related features and manage my orders

  Background: 
    Given I am on opencart login page

  Scenario: Successful login with valid credentials
    Given I have entered valid username and password
    When I click on login button
    Then I should be login successfully

  Scenario Outline: Unsuccessful login with invalid or empty credential
    Given I have enter invalid "<username>" and "<password>"
    When I click on the login button
    Then I should see an error message indicating "<error_message>"

    Examples: 
      | username          | password        | error_message                                       |
      | invalid@gmail.com | invalidpassword | Warning: No match for email address and/or password |
      | abccc             | validPassword   | Warning: No match for email address and/or password |
      | valid@email.com   | abccc           | Warning: No match for email address and/or password |

  Scenario: Navigating to forgotton password page
    When I click on "Forgotton Password" link
    Then I should be redirected to the password reset page
    
    
     #Scenario Outline: Chech Login is successful with valid credentials
    #Given User is on login page
    #When User enters <username> and <password>
    #And Click on login button
    #Then User is navigate to homepage
#
    #Examples: 
      #| username | password |
      #| user1    | pass1    |
      #| user2    | pass2    |
    
    
    
