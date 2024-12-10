Feature: Login with Valid Credentials

  #@sanity @regression
  #Scenario: Successful Login with Valid Credentials
    #Given the user navigates to login page
    #When user enters email as "test@kennect.io" and password as "Qwerty@1234"
    #And the user clicks on the Login button
    #Then the user should be redirected to the GOR Pathology and Diagnostic Home Page
    
    
@regression
  Scenario Outline: Login Data Driven
    Given the user navigates to login page
    When user enters email as "<Username>" and password as "<Password>"
    And the user clicks on the Login button
    Then the user should be redirected to the GOR Pathology and Diagnostic Home Page

    Examples: 
      | Username            | Password 		|
      | test@kennect.io     | Qwerty@1234 |
      

