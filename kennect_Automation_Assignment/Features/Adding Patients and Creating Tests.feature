Feature: Adding new patient, required test and calculate cost of test

  @sanity @regression
  Scenario: Verify user can add new patient and add required tests
    Given the user navigates to login page
    When user enters email as "test@kennect.io" and password as "Qwerty@1234"
    And the user clicks on the Login button
    Then User clicks on Patients feature which is available on GOR Pathology and Diagnostic Home Page
    Then User cliks on Add Patient button
    Then User add Patient Contact Details and clicks on GENERAL DETAILS button
    Then User adds Secondary details of TestData and Blood Pressure
    Then User clicks on ADD TESTS button
    Then User fills the details in Test Cost Calculator and clicks on ADD PATIENT button
