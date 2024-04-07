package pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utilities.PythonExcelReader;

public class GraphPage {
	
	WebDriver driver;
	PythonExcelReader excel = new PythonExcelReader();
	By python_editor =By.xpath("//form[@id='answer_form']/div/div/div/textarea");
	By run = By.xpath("//button[@type='button']");
	By output = By.xpath("//pre[@id='output']");
	//By tryhere = By.xpath("//a[@class='btn btn-info']");
	By getStarted = By.xpath("//a[@href='graph']");
	By graph = By.xpath("//a[@href='graph']");
	By graphicalrepresentation = By.xpath("//a[@href='graph-representations']");
	
	public GraphPage(WebDriver driver) {
		
		this.driver = driver;
	}
	

		public void getStarted() {
			driver.findElement(getStarted).click();
		}

		public void clickOnGraph() {
			driver.navigate().to("https://dsportalapp.herokuapp.com/graph/");
			driver.findElement(graph).click();
			}
		
//		public void tryHere() {
//			driver.findElement(tryhere).click();
//		}
		
		public void graphicalRepresentation() {
			
			driver.navigate().to("https://dsportalapp.herokuapp.com/graph/");
			driver.findElement(graphicalrepresentation).click();
		}

}
