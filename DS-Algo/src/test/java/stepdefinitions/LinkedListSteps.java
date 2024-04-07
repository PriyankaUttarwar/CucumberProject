package stepdefinitions;

import java.io.IOException;

import drivers.DriverFactory;
import io.cucumber.java.en.*;
import pages.ArrayPage;
import pages.DataStructuresPage;
import pages.LinkedListPage;

public class LinkedListSteps {

	LinkedListPage linkedlist = new LinkedListPage(DriverFactory.getDriver());
	//DataStructuresPage data = new DataStructuresPage(DriverFactory.getDriver());
	ArrayPage array = new ArrayPage(DriverFactory.getDriver());
	
	@When(": The user clicks on Get Started button of Linked List")
	public void the_user_clicks_on_get_started_button_of_linked_list() {
	    
		linkedlist.getStarted();
	}

	@Then(": The user should be navigated to  the Linked List page")
	public void the_user_should_be_navigated_to_the_linked_list_page() {
	    
		System.out.println("User is navigated to Linked list page");
	}

	@When(": The user clicks on Introduction button")
	public void the_user_clicks_on_introduction_button() {
		
		linkedlist.clickOnIntroduction();
	    
	}

	@Then(": The user should be directed to {string} of Linked List Page")
	public void the_user_should_be_directed_to_of_linked_list_page(String string) {
	    
		System.out.println("User is redirected to "+string+" page");
	}

	@Then(": User should be redirected to the page having an tryEditor with a Run button to test")
	public void user_should_be_redirected_to_the_page_having_an_try_editor_with_a_run_button_to_test() throws IOException {
	   
		System.out.println("User redirected to Python editor page");
		linkedlist.pythonEditor();
	}

	@When(": The user clicks  Creating a Linked List button")
	public void the_user_clicks_creating_a_linked_list_button() {
	   
		linkedlist.creatingLinkedList();
	}

	@When(": User clicks the Types of Linked List button")
	public void user_clicks_the_types_of_linked_list_button() {
	    
		linkedlist.typesOfLinkedList();
	}

	@When(": User clicks Implement Linked List in Python")
	public void user_clicks_implement_linked_list_in_python() {
		
		linkedlist.implementLinkedList();
	}

	@When(": User clicks on Traversal button")
	public void user_clicks_on_traversal_button() {
	   
		linkedlist.traversal();
	}

	@When(": User clciks on Insertion button")
	public void user_clciks_on_insertion_button() {
	    
		linkedlist.insertion();
	}

	@When(": User clicks on Deletion button")
	public void user_clicks_on_deletion_button() {
	    
		linkedlist.deletion();
	}
//	@Then(": The user clicks {string} button in Introduction")
//	public void the_user_clicks_button_in_introduction(String string) {
//	    
//		linkedlist.clickOnTryHere();
//	}

//	@Then(": The user clicks {string} button in Create a Linked List")
//	public void the_user_clicks_button_in_create_a_linked_list(String string) {
//		
//		linkedlist.clickOnTryHere();
//	}

//	@Then(": The user clicks {string} button in Types of Linked List")
//	public void the_user_clicks_button_in_types_of_linked_list(String string) {
//	    
//		linkedlist.clickOnTryHere();
//	}
//
//	@Then(": The user clicks {string} button in Implement Linked List in Python")
//	public void the_user_clicks_button_in_implement_linked_list_in_python(String string) {
//	   
//		linkedlist.clickOnTryHere();
//	}
//
//	@Then(": The user clicks {string} button in Traversal")
//	public void the_user_clicks_button_in_traversal(String string) {
//	   
//		linkedlist.clickOnTryHere();
//	}
//
//	@Then(": The user clicks {string} button in Insertion")
//	public void the_user_clicks_button_in_insertion(String string) {
//	    
//		linkedlist.clickOnTryHere();
//	}

//	@Then(": The user clicks {string} button in Deletion")
//	public void the_user_clicks_button_in_deletion(String string) {
//	    
//		linkedlist.clickOnTryHere();
//	}


}
