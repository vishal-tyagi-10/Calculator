package stepDefinitions;

import java.io.IOException;
import java.util.ResourceBundle;

import BaseClass.Driver;
import TestCases.TC_001_CarLoan;
import TestCases.TC_002_Homeloan;
import TestCases.TC_003_EMICalculatorValidation;
import TestCases.TC_004_LoanAmountUIValidation;
import TestCases.TC_005_LoanTenureCalculatorUIVAlidation;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Smoke {
	
	TC_001_CarLoan t1;
	TC_002_Homeloan t2;
	TC_003_EMICalculatorValidation t3;
	TC_004_LoanAmountUIValidation t4;
	TC_005_LoanTenureCalculatorUIVAlidation t5;
	
	@Given("User on Emi calculator Website")
	public void user_on_Emi_calculator_website() throws InterruptedException, IOException {
		 Driver d= new Driver();
		 ResourceBundle rb = ResourceBundle.getBundle("config");
			String br = rb.getString("browser");
			d.setup("windows", br);
			
	}

	@When("User Click on Car Loan")
	public void user_click_on_Car_loan_from_menu() {
		t1= new TC_001_CarLoan();
		
		t1.Car_Loan();
	}
	
	@Given("User already on Emi calculator Website")
	public void user_already_on_Emi_calculator_website() {
		t2= new TC_002_Homeloan();
		t2.Menu();
			
	}

	@When("User Click on Home Loan from menu")
	public void user_click_on_home_loan_from_menu() {
		t2.Home_Loan();
	}

	@Given("user is on url emicalculator.net")
	public void user_is_on_url_emicalculator_net() {
		t3= new TC_003_EMICalculatorValidation();
		t3.Menu();
	}

	@When("user clicks on EMI calculator")
	public void user_clicks_on_emi_calculator() {
		
		t3.LoanCalculatorClick();
	}

	@Then("user checks if EMI Calculator input field is displayed")
	public void user_checks_if_emi_calculator_input_field_is_displayed() {
		t3.EMICalculatorTextBoxValidating();
	}

	@Given("user is on Loan Amount calculator")
	public void user_is_on_loan_amount_calculator() {
		t4= new TC_004_LoanAmountUIValidation();
		t4.Menu();
		t4.LoanCalculatorClick();
		t4.Loan_Amount_Calculator_Click();
	}

	@Then("user checks if Loan Amount Calculator input field is displayed")
	public void user_checks_if_loan_amount_calculator_input_field_is_displayed() {
		t4.LoanAmountCalculatorTextBoxValidating();
	}

	@Given("user is on Loan Tenure calculator")
	public void user_is_on_loan_tenure_calculator() {
		t5= new TC_005_LoanTenureCalculatorUIVAlidation();
		t5.Menu();
		t5.LoanCalculatorClick();
		t5.Loan_Tenure_Calculator_Click();
	}

	@Then("user checks if Loan Tenure Calculator input field is displayed")
	public void user_checks_if_loan_tenure_calculator_input_field_is_displayed() {
		t5.Loan_Tenure_Calculator_TextBox_Validation();
	}

	
	}