package stepdefinitions;

import java.io.IOException;

import drivers.DriverFactory;
import io.cucumber.java.en.*;
import pages.ArrayPage;
import pages.QueuePage;

public class QueueSteps {
	
	QueuePage queue=new QueuePage(DriverFactory.getDriver());
	ArrayPage array = new ArrayPage(DriverFactory.getDriver());
	
	@When(": The user clicks on Get Started button of Queue")
	public void the_user_clicks_on_get_started_button_of_queue() {
	    
		queue.getStarted();
	}

	@Then(": The user should be navigated to the Queue page")
	public void the_user_should_be_navigated_to_the_queue_page() {
	   
		System.out.println("User navigated to Queue Page");
	}

	@When(": The user clicks on Implementation of Queue in Python")
	public void the_user_clicks_on_implementation_of_queue_in_python() {
	    queue.implementationOfQueue();
	}

	@Then(": The user should be directed to the {string} of Queue Page")
	public void the_user_should_be_directed_to_the_of_queue_page(String string) {
	  
		System.out.println("User redirected to the "+string+" page");
	}

//	@Then(": The user clicks {string} button in Implementation of Queue in Python")
//	public void the_user_clicks_button_in_implementation_of_queue_in_python(String string) {
//	    
//		queue.tryHere();
//	}

	@Then(": user should be redirected to a page having an tryEditor with a Run button to test")
	public void user_should_be_redirected_to_a_page_having_an_try_editor_with_a_run_button_to_test1() throws IOException {
	   queue.pythonEditor();
	}

	@When(": The user clicks on Implementation using collections dequeue")
	public void the_user_clicks_on_implementation_using_collections_dequeue() {
	    queue.Queuedequeue();
	}

	@Then(": The user clicks {string} button in Implementation using collections dequeue")
	public void the_user_clicks_button_in_implementation_using_collections_dequeue(String string) {
	    
		queue.tryHere();
	}

	@When(": The user clicks on Implementation using array")
	public void the_user_clicks_on_implementation_using_array() {
	    queue.implementationUsingArray();
	}

	@Then(": The user clicks {string} button in Implementation using array")
	public void the_user_clicks_button_in_implementation_using_array(String string) {
	 
		queue.tryHere();
	}

	@When(": The user clicks on Queue Operations")
	public void the_user_clicks_on_queue_operations() {
	   
		queue.queueOperations();
	}

//	@Then(": The user clicks {string} button in Queue Operations")
//	public void the_user_clicks_button_in_queue_operations(String string) {
//	    
//		queue.tryHere();
//	}

	@Then(":  user should be redirected to a page having an tryEditor with a Run button to test")
	public void user_should_be_redirected_to_a_page_having_an_try_editor_with_a_run_button_to_test() throws IOException {
		 queue.pythonEditor();
	}

}
