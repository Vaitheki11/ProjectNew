
Feature: User Registration
  As a new user
  I want to register on the website
  
 Background:
 Given User is on the registration page

 
  Scenario: Successful registration
    When User fill in the registration form with valid information
    And User submit the form
    Then I should see a confirmation message
    And I should be logged in to the website

  Scenario: Registration with existing email
    When User fill in the registration form with an existing email
    And User submit the form
    Then User should see an error message indicating the email is already registered

  Scenario: Registration with invalid information
    When User fill in the registration form with invalid information
    And User submit the form
    Then User should see validation errors next to the relevant fields

  Scenario: Password strength validation
    When User fill in the registration form with a weak password
    And User submit the form
    Then User should see a message indicating password strength requirements

  Scenario: Terms and Conditions acceptance
    When User try to submit the registration form without accepting the terms and conditions
    Then User should see an error message prompting me to accept the terms and conditions



