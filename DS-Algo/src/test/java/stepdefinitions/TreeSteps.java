package stepdefinitions;

import java.io.IOException;

import drivers.DriverFactory;
import io.cucumber.java.en.*;
import pages.ArrayPage;
import pages.TreePage;

public class TreeSteps {
	
	TreePage tree = new TreePage(DriverFactory.getDriver());
	ArrayPage array = new ArrayPage(DriverFactory.getDriver());
	
	@When(": The user clicks on Get Started button of Tree")
	public void the_user_clicks_on_get_started_button_of_tree() {
	    
		tree.getStarted();
	}

	@Then(": The user should be navigated to the Tree page")
	public void the_user_should_be_navigated_to_the_tree_page() {
	 
		System.out.println("User navigated to Tree page");
	}

	@When(": The user clicks on Overview of Trees")
	public void the_user_clicks_on_overview_of_trees() {
	    
		tree.clickOnOverview();
	}

	@Then(": The user should be directed to the {string} of Tree Page")
	public void the_user_should_be_directed_to_the_of_tree_page(String string) {
	   
		System.out.println("User navigated to "+string+" page");
	}

//	@Then(": The user clicks {string} button in Tree")
//	public void the_user_clicks_button_in_tree(String string) {
//	    tree.tryHere();
//	}

	@Then(": user should be redirected to a page having a TryEditor with a Run button to test")
	public void user_should_be_redirected_to_a_page_having_a_try_editor_with_a_run_button_to_test() throws IOException {
	   
		tree.pythonEditor();
	}

	@When(": The user clicks on Terminologies")
	public void the_user_clicks_on_terminologies() {
	    
		tree.clickTerminologies();
	}

//	@Then(": The user clicks {string} button in Terminologies")
//	public void the_user_clicks_button_in_terminologies(String string) {
//	    
//		tree .tryHere();
//	}

	@When(": The user clicks on Types of Trees")
	public void the_user_clicks_on_types_of_trees() {
	    tree.typesOfTrees();
	}

//	@Then(": The user clicks {string} button in Types of Trees")
//	public void the_user_clicks_button_in_types_of_trees(String string) {
//		tree .tryHere();
//	}

	@When(":  The user clicks on Tree Traversals")
	public void the_user_clicks_on_tree_traversals() {
	   tree.treeTraversal();
	}

//	@Then(": The user clicks {string} button in Tree Traversals")
//	public void the_user_clicks_button_in_tree_traversals(String string) {
//	    
//		tree .tryHere();
//	}

	@When(":  The user clicks on Traversal Illustration")
	public void the_user_clicks_on_traversal_illustration() {
	   
		tree.traversalIllustration();
	}

//	@Then(": The user clicks {string} button in Traversal Illustration")
//	public void the_user_clicks_button_in_traversal_illustration(String string) {
//	    
//		tree .tryHere();
//	}

	@When(":  The user clicks on Binary Trees")
	public void the_user_clicks_on_binary_trees() {
	    tree.binaryTrees();
	}

//	@Then(": The user clicks {string} button in Binary Trees")
//	public void the_user_clicks_button_in_binary_trees(String string) {
//		tree .tryHere();
//	}

	@When(":  The user clicks on Types of Binary Trees")
	public void the_user_clicks_on_types_of_binary_trees() {
	   tree.typesOfBinaryTrees();
	}

//	@Then(": The user clicks {string} button in Types of Binary Trees")
//	public void the_user_clicks_button_in_types_of_binary_trees(String string) {
//	    
//		tree .tryHere();
//	}

	@When(":  The user clicks on Implementation in Python")
	public void the_user_clicks_on_implementation_in_python() {
	     tree.implementationInPython();
	}

//	@Then(": The user clicks {string} button in Implementation in Python")
//	public void the_user_clicks_button_in_implementation_in_python(String string) {
//	    
//		tree .tryHere();
//	}

	@When(":  The user clicks on Binary Tree traversals")
	public void the_user_clicks_on_binary_tree_traversals() {
	    tree.binaryTreeTraversal();
	}
//
//	@Then(": The user clicks {string} button in Binary Tree traversals")
//	public void the_user_clicks_button_in_binary_tree_traversals(String string) {
//	    
//		tree .tryHere();
//	}

	@When(":  The user clicks on Implementation of Binary Trees")
	public void the_user_clicks_on_implementation_of_binary_trees() {
	  tree.implementationOfBinaryTrees();
	}

//	@Then(": The user clicks {string} button in Implementation of Binary Trees")
//	public void the_user_clicks_button_in_implementation_of_binary_trees(String string) {
//	    
//		tree .tryHere();
//	}

	@When(":  The user clicks on Applications of Binary Trees")
	public void the_user_clicks_on_applications_of_binary_trees() {
	    tree.applicationOfBinaryTrees();
	}

//	@Then(": The user clicks {string} button in Applications of Binary Trees")
//	public void the_user_clicks_button_in_applications_of_binary_trees(String string) {
//	    
//		tree .tryHere();
//	}

	@When(":  The user clicks on Binary Search Trees")
	public void the_user_clicks_on_binary_search_trees() {
	    tree.binarySearchTree();
	}

//	@Then(": The user clicks {string} button in Binary Search Trees")
//	public void the_user_clicks_button_in_binary_search_trees(String string) {
//	    
//		tree .tryHere();
//	}

	@When(":  The user clicks on Implementation of BST")
	public void the_user_clicks_on_implementation_of_bst() {
	   tree.implementationOfBST();
	}

//	@Then(": The user clicks {string} button in Implementation of BST")
//	public void the_user_clicks_button_in_implementation_of_bst(String string) {
//	    
//		tree .tryHere();
//	}
	@Then(":The user clicks on {string} button")
	public void the_user_clicks_on_button(String string) {
	    
	}


}
