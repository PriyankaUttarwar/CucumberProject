package stepdefinitions;

import java.io.IOException;

import org.junit.Assert;

import drivers.DriverFactory;
import io.cucumber.java.en.*;
import pages.ArrayPage;

public class ArraySteps {
	
	ArrayPage array = new ArrayPage(DriverFactory.getDriver());
	
	
	@When(": The user clicks on Get Started button of Arrays")
	public void the_user_clicks_on_get_started_button_of_arrays() {
		
		array.clickOnGetStarted();
	    
	}

	@Then(": The user should be navigated to  the {string} page")
	public void the_user_should_be_navigated_to_the_page(String expstring) {
	   
		String actualtitle = array.arrayTitle();
		Assert.assertEquals(expstring,actualtitle);
		System.out.println("User anvigated to "+expstring+"page");
	}

	@When(": The user clicks {string} button")
	public void the_user_clicks_button(String string) {
		
		array.clickOnArraysInPython();
	   
	}

	@Then(": The user should be redirected to {string} page")
	public void the_user_should_be_redirected_to_page(String string) {
	   
		System.out.println("User redirected to "+string+" page");
	}

	@When(": The user clicks {string} button in Arrays in Python page")
	public void the_user_clicks_button_in_arrays_in_python_page(String string) {
		
		array.clickOnTryHere();
	   
	}

	@Then(": The user should be redirected to the page having an tryEditor with a Run button to test")
	public void the_user_should_be_redirected_to_the_page_having_an_try_editor_with_a_run_button_to_test() throws IOException {
		
		System.out.println("User redirected to try editor page");
		array.pythonEditor();
	    
	}

	@When(": The user clicks {string} button in Arrays using List page")
	public void the_user_clicks_button_in_arrays_using_list_page(String string) {
	   
		array.clickOnTryHere();
	}

	@When(": The user clicks {string} button in Basic Operations in List page")
	public void the_user_clicks_button_in_basic_operations_in_list_page(String string) {
	    
		array.clickOnTryHere();
	}

	@When(": The user clicks Applications of Array button")
	public void the_user_clicks_applications_of_array_button() {
	    
		array.clickOnApplicationArray();
	}


	@When(": The user clicks on try here Button in Applications of Array")
	public void the_user_clicks_on_try_here_button_in_applications_of_array() {
	   
		array.clickOnTryHere();
	}

	@When(": The user clicks on the {string} button")
	public void the_user_clicks_on_the_button(String string) {
	   
	}

	@Then(": The user is redirected to a page having python programs")
	public void the_user_is_redirected_to_a_page_having_python_programs() {
	   
		System.out.println("User is redirected to python programs page");
	}

	@When(": The user clicks on Max consecutive ones")
	public void the_user_clicks_on_max_consecutive_ones() {
	   
		array.clickOnMaxConsecutive();
	}

	@Then(": The user should be redirected to a page having an tryEditor with a Run and Submit button to test")
	public void the_user_should_be_redirected_to_a_page_having_an_try_editor_with_a_run_and_submit_button_to_test() throws IOException {
	    
		array.pythonEditor1();
	}

	@When(": The user click on the link of Find numbers with even number of digits")
	public void the_user_click_on_the_link_of_find_numbers_with_even_number_of_digits() {
	   
		array.clickOnEven();
	}

	@When(": The user clicks on Squares of sorted array")
	public void the_user_clicks_on_squares_of_sorted_array() {
	    array.clickOnSquares();
	}
	
	@When(": The user clicks {string} button.")
	public void the_user_clicks_button1(String string) {
	    
		array.clickOnArraysUsingList();
	}

	@When(": The user clicks the {string} button")
	public void the_user_clicks_the_button(String string) {
	   array.clickOnBasicOperations();
	}
	

@When(": The user clicks on Search the array button")
public void the_user_clicks_on_search_the_array_button() {
    
	array.searchArray();
}




}
