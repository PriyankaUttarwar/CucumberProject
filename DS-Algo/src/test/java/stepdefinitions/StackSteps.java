package stepdefinitions;

import java.io.IOException;

import drivers.DriverFactory;
import io.cucumber.java.en.*;
import pages.ArrayPage;
import pages.StackPage;

public class StackSteps {
	
	StackPage stack = new StackPage(DriverFactory.getDriver());
	ArrayPage array = new ArrayPage(DriverFactory.getDriver());

@When(": The user clicks on Get Started button of Stack")
public void the_user_clicks_on_get_started_button_of_stack() {
    
	stack.getStarted();
}

@Then(": The user should be navigated to  the Stack page")
public void the_user_should_be_navigated_to_the_stack_page() {
    
	System.out.println("User is navigated to Stack Page");
}

@When(": The user clicks on Opeartions in Stack")
public void the_user_clicks_on_opeartions_in_stack() {
   
	stack.operationInStack();
	
}

@Then(": The user should be directed to the {string} of stack Page")
public void the_user_should_be_directed_to_the_of_stack_page(String string) {
 
	System.out.println("User is navigated to "+string+" page");
}

//@Then(": The user clicks {string} button in Operations in Stack")
//public void the_user_clicks_button_in_operations_in_stack(String string) {
//    stack.clickTryHere();
//}

@Then(": user should be redirected to the page having an tryEditor with a Run button to test")
public void user_should_be_redirected_to_the_page_having_an_try_editor_with_a_run_button_to_test() throws IOException {
	stack.pythonEditor();
}

@When(": The user clicks on Implementation")
public void the_user_clicks_on_implementation() {
   stack.clickOnImplementation();
}

//@Then(": The user clicks {string} button in Implementation")
//public void the_user_clicks_button_in_implementation(String string) {
//   stack.clickTryHere();
//}

@When(": The user clicks on Applications")
public void the_user_clicks_on_applications() {
    
	stack.clickOnApplication();

}

//@Then(": The user clicks {string} button in Application")
//public void the_user_clicks_button_in_application(String string) {
//	
//	stack.clickTryHere();
//  }


}
