@smoke
Feature: EMI Calculator Smoke

  #validating click on car loan menu
  @smoke
  Scenario: Validating clicking action for Car Loan
    Given User on Emi calculator Website
    When User Click on Car Loan

  #validating Home Loan
  @smoke
  Scenario: Validating clicking action for Home Loan
    Given User already on Emi calculator Website
    When User Click on Home Loan from menu

  #EMI caluclator input all fields testing
  @smoke
  Scenario: EMI calculator  input field displayed
    Given user is on url emicalculator.net
    When user clicks on EMI calculator
    Then user checks if EMI Calculator input field is displayed

  #  LOAN AMOUNT caluclator input all fields testing
  @smoke
  Scenario: Loan Amount calculator EMI input field displayed
    Given user is on Loan Amount calculator
    Then user checks if Loan Amount Calculator input field is displayed

  #LOAN TENURE caluclator input all fields testing
  @smoke
  Scenario: Loan Tenure calculator loan amount input field displayed
    Given user is on Loan Tenure calculator
    Then user checks if Loan Tenure Calculator input field is displayed
