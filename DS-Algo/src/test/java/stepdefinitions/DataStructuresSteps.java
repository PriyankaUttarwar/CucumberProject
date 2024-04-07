package stepdefinitions;

import java.io.IOException;

import org.junit.Assert;

import drivers.DriverFactory;
import drivers.DriverFactory;
import io.cucumber.java.en.*;
import pages.DataStructuresPage;

public class DataStructuresSteps {
	
	DataStructuresPage datastucture = new DataStructuresPage(DriverFactory.getDriver());

	@Given(": The user is on DS Algo Portal homepage")
	public void the_user_is_on_ds_algo_portal_homepage() {
		datastucture.homePage();
	    
	}

	@When(": The user clicks on Signin button")
	public void the_user_clicks_on_signin_button() {
	    
		datastucture.cicksOnSignin();
		System.out.println("Clicked on Signin");
	}

	@When(": The user enters {string} as username and {string} as password and clicks on login button")
	public void the_user_enters_as_username_and_as_password_and_clicks_on_login_button(String username, String password) {
		datastucture.enterUsernameAndPassword(username, password);
	}

	@Then(":The user should get message as {string} in homepage")
	public void the_user_should_get_message_as_in_homepage(String expectedmessage) {

		String actualmessage = datastucture.getMessage();
		
		Assert.assertEquals(expectedmessage, actualmessage);
	}

	@When(": The user clicks on Get Started button of Data structures")
	public void the_user_clicks_on_get_started_button_of_data_structures() {
		datastucture.clickOnGetStarted();
		System.out.println("User clicks on Get Started");
	}

	@Then(": The user should be navigated to {string} page")
	public void the_user_should_be_navigated_to_page(String string) {
		System.out.println("User gets navigated to "+string+"page");
	    
	}

	@Given(": The user is on Data Structure Introduction page")
	public void the_user_is_on_data_structure_introduction_page() {
		System.out.println("User is on the Data Structures Introduction Page");
	}

	@When(": The user clicks on Time Complexity")
	public void the_user_clicks_on_time_complexity() {
		datastucture.clickOnTimeComplexity();
	}

	@Then(": The user should be redirected to {string} of Data structures-Introduction")
	public void the_user_should_be_redirected_to_of_data_structures_introduction(String string) {
		System.out.println("User gets navigated to"+string+"page");
	}

	@When(": The user clicks on {string} button")
	public void the_user_clicks_on_button(String string) {
		datastucture.clickOnTryHere();
		System.out.println("User clicks on Try Here button");
	}

	@Then(": The user should be redirected to a page having an tryEditor with a Run button to test")
	public void the_user_should_be_redirected_to_a_page_having_an_try_editor_with_a_run_button_to_test() {
	    
		System.out.println("User gets navigated to try editor page");
	}

	@Then(": The user enter the python code and click Run")
	public void the_user_enter_the_python_code_and_click_run() throws IOException {
	   
		datastucture.pythonEditor();
	}


}
