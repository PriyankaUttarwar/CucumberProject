package pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utilities.PythonExcelReader;

public class LinkedListPage {
	
	WebDriver driver;
	PythonExcelReader excel = new PythonExcelReader();
	By python_editor =By.xpath("//form[@id='answer_form']/div/div/div/textarea");
	By run = By.xpath("//button[@type='button']");
	By output = By.xpath("//pre[@id='output']");
	By getstarted = By.xpath("//a[@href='linked-list']");
	By introduction = By.xpath("//a[@href='introduction']");
	By tryhere = By.xpath("//a[@class='btn btn-info']");
	By creatinglikedlist = By.xpath("//a[@href='creating-linked-list']");
	By typesoflinkedlist = By.xpath("//a[@href='types-of-linked-list']");
	By implementlinkedlist = By.xpath("//a[@href='implement-linked-list-in-python']");
	By traversal = By.xpath("//a[@href='traversal']");
	By insertion = By.xpath(" //a[@href='insertion-in-linked-list']");
	By deletion = By.xpath("//a[@href='deletion-in-linked-list']");
	
	
	
	public LinkedListPage(WebDriver driver) {
		
		this.driver = driver;
	}
	
	public void getStarted() {
		driver.findElement(getstarted).click();
	}
	
	public void clickOnIntroduction() {
		driver.navigate().to("https://dsportalapp.herokuapp.com/linked-list/");
		driver.findElement(introduction).click();
	}
	
//	public void clickOnTryHere() {
//		driver.findElement(tryhere).click();
//	}
	


	public void creatingLinkedList() {
		
		driver.navigate().to("https://dsportalapp.herokuapp.com/linked-list/");
		driver.findElement(creatinglikedlist).click();
	}
	
	public void typesOfLinkedList() {
		
		driver.navigate().to("https://dsportalapp.herokuapp.com/linked-list/");
		driver.findElement(typesoflinkedlist).click();
	}
	
	public void implementLinkedList() {
		driver.navigate().to("https://dsportalapp.herokuapp.com/linked-list/");
		driver.findElement(implementlinkedlist).click();
	}
	
	public void traversal() {
		driver.navigate().to("https://dsportalapp.herokuapp.com/linked-list/");
		driver.findElement(traversal).click();
	}
	public void insertion() {
		driver.navigate().to("https://dsportalapp.herokuapp.com/linked-list/");
		driver.findElement(insertion).click();
	}
	
public void pythonEditor() throws IOException {
		
		WebElement try_editor_clear=driver.findElement(python_editor);
		String[] list = excel.fileReader()	;
		Actions actions= new Actions(driver);
		actions.click(try_editor_clear).keyDown(Keys.CONTROL).sendKeys("\u0061").sendKeys(Keys.BACK_SPACE).keyUp(Keys.CONTROL).perform();
		driver.findElement(python_editor).sendKeys(list[0]);
		driver.findElement(run).click();
		System.out.println("Output is :"+driver.findElement(output).getText());
		
		actions.click(try_editor_clear).keyDown(Keys.CONTROL).sendKeys("\u0061").sendKeys(Keys.BACK_SPACE).keyUp(Keys.CONTROL).perform();
		driver.findElement(python_editor).sendKeys(list[1]);
		driver.findElement(run).click();
		System.out.println("Alert is :"+driver.switchTo().alert().getText() );
		driver.switchTo().alert().accept();
			
			
		}
	
	public void  deletion() {
		driver.navigate().to("https://dsportalapp.herokuapp.com/linked-list/");
		driver.findElement(deletion).click();
	}

}
