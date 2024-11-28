Feature: Automate the navigation and interaction with web elements of FitPeo Revenue Calculator Page

  @sanity @regression
  Scenario Outline: Validate revenue calculator slider is working
    Given user navigates to FitPeo Home Page
    Then user clicks on FitPeo Revenue Calculator which will redirect user to FitPeo Revenue Calculator Page
    And user Scroll down the page until the revenue calculator slider is visible and set its value to 816
    Then user verify bottom text field of slider shows value as 816

  @regression
  Scenario Outline: Verify user can update the text field and validate slider is shifting accordingly
    Given user is on FitPeo Revenue Calculator Page
    When user clicks on the text field associated with the slider and enter the value 560
    Then user validate slider positioned updated to 560

  @regression
  Scenario Outline: Verify user can select CPT Codes and validate Total Recurring Reimbursement
    Given user is on FitPeo Revenue Calculator Page
    And user select the check-boxes for CPT-99091, CPT-99453, CPT-99454 and CPT-99474
    Then user validate that header displaying Total Recurring Reimbursement for all Patients Per Month shows the value $110700
