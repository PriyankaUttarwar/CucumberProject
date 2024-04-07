package stepdefinitions;

import java.io.IOException;

import drivers.DriverFactory;
import io.cucumber.java.en.*;
import pages.ArrayPage;
import pages.DataStructuresPage;
import pages.GraphPage;

public class GraphSteps {
	
	GraphPage graph = new GraphPage(DriverFactory.getDriver());
	DataStructuresPage data = new DataStructuresPage(DriverFactory.getDriver());
	ArrayPage array = new ArrayPage(DriverFactory.getDriver());
	
	
	@When(": The user clicks on Get Started button of Graph")
	public void the_user_clicks_on_get_started_button_of_graph() {
	    graph.getStarted();
	}

	@Then(": The user should be navigated to the Graph page")
	public void the_user_should_be_navigated_to_the_graph_page() {
	    System.out.println("User navigated to Graph page");
	}

	@When(": The user clicks on Graph")
	public void the_user_clicks_on_graph() {
	    graph.clickOnGraph();
	}

	@Then(": The user should be directed to the {string} of Graph Page")
	public void the_user_should_be_directed_to_the_of_graph_page(String string) {
	    
		System.out.println("User redirected to "+string+" page");
	}

//	@Then(": The user clicks {string} button in Graph")
//	public void the_user_clicks_button_in_graph(String string) {
//	   data.clickOnTryHere();
//	}

	@Then(": user should be redirected to a page having an TryEditor with a Run button to test")
	public void user_should_be_redirected_to_a_page_having_an_try_editor_with_a_run_button_to_test() throws IOException {
	    array.pythonEditor();
	}

	@When(": The user clicks on Graph Representations")
	public void the_user_clicks_on_graph_representations() {
	   graph.graphicalRepresentation();
	}

}
