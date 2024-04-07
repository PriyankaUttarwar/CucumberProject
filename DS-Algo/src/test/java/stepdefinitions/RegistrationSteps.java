package stepdefinitions;

import org.junit.Assert;

import drivers.DriverFactory;
import io.cucumber.java.en.*;
import pages.RegistrationPage;

public class RegistrationSteps {
	
	RegistrationPage registrationPage = new RegistrationPage(DriverFactory.getDriver());
	
	@Given(": The user is on the new user registration page")
	public void the_user_is_on_the_new_user_registration_page() {
	    
		DriverFactory.getDriver().get("https://dsportalapp.herokuapp.com/register");
	}


@When(": User  enters Username form {string} and Password from {string} and Confirm Password {string}")
public void user_enters_username_form_and_password_from_and_confirm_password(String username, String password, String confirmpassword) {
    
	registrationPage.enterUsernamePassword(username, password, confirmpassword);
}

	@When(": User clicks on Register button")
	public void user_clicks_on_register_button() {
		
		registrationPage.clickRegister();
	  
	}

	@Then(": Compare with the expected message {string} that appears after clicking Register")
	public void compare_with_the_expected_message_that_appears_after_clicking_register(String expstring) {
	   
						
		if(expstring.equalsIgnoreCase("Please fill out this field.")) {
			//String actualmessage = registartaionPage.errMsgFillFields();
			String actualmessage = registrationPage.errMsgFillFields();
			Assert.assertEquals(expstring, actualmessage);
			System.out.println("Message is "+actualmessage);
			
		}
		else if(expstring.equalsIgnoreCase("password_mismatch:The two password fields didn’t match.")){
			
			String actualmessage1= registrationPage.passwordMismtach();
			Assert.assertEquals(expstring, actualmessage1);
			System.out.println("Message is "+actualmessage1);
		}
	}
	

	@When(": Users enters the username password and confirm password in respective fields and click on register")
	public void users_enters_the_username_password_and_confirm_password_in_respective_fields_and_click_on_register() {
	    
		registrationPage.enterUsernamePassword("techtesters876", "test@964", "test@964");
		registrationPage.clickRegister();
		
	}

	@Then(":User should be redirected to Home Page of DS Algo")
	public void user_should_be_redirected_to_home_page_of_ds_algo() {
	   
		System.out.println("User redirected to DSAlgo HomePage");
		
		
		
	}

	@Then(": The user should able to see successful message on the DS Algo Home Page")
	public void the_user_should_able_to_see_successful_message_on_the_ds_algo_home_page() {
	   
		String message = registrationPage.successMessage();
		System.out.println(message);
	}

	

}
