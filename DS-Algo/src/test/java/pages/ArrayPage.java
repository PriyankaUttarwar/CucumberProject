package pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utilities.PythonExcelReader;

public class ArrayPage {
	
	WebDriver driver;
	PythonExcelReader excel = new PythonExcelReader();
	By getstarted = By.xpath("//a[@href='array']");
	By arraytitle = By.xpath("//h4[@class='bg-secondary text-white']");
	By arraysinpython = By.xpath("//a[@href='arrays-in-python']");
	By tryhere =By.xpath("//a[@href='/tryEditor']");
	By arraysusinglist = By.xpath("//a[@href='arrays-using-list']");
	By basicoperation = By.xpath("//a[@href='basic-operations-in-lists']");
	By python_editor =By.xpath("//form[@id='answer_form']/div/div/div/textarea");
	By run = By.xpath("//button[@type='button']");
	By output = By.xpath("//pre[@id='output']");
	By applicationofarray = By.xpath("//a[@href='applications-of-array']");
	By practicequestions = By.xpath("//a[@class='list-group-item list-group-item-light text-info']");
	By maxconsecutive = By.xpath("//a[@href='/question/2']");
	By evennumbers = By.xpath("//a[@href='/question/3']");
	By squares = By.xpath("//a[@href='/question/4']");
	By searcharray = By.xpath("//a[@href='/question/1']");
	Actions action;
	
	
	
	public ArrayPage(WebDriver driver) {
		
		this.driver = driver;
	}
	
	
	public void clickOnGetStarted() {
		
		driver.findElement(getstarted).click();
	}
	
	public String arrayTitle() {
		return driver.findElement(arraytitle).getText();
	}
	
	public void clickOnArraysInPython() {
		driver.navigate().to("https://dsportalapp.herokuapp.com/array/");
		driver.findElement(arraysinpython).click();
	}
	
	public void clickOnTryHere() {
		//driver.navigate().to("https://dsportalapp.herokuapp.com/array/arrays-in-python/");
		driver.findElement(tryhere).click();
	}
	
	public void clickOnArraysUsingList() {
		driver.navigate().to("https://dsportalapp.herokuapp.com/array/");
		driver.findElement(arraysusinglist).click();
	}
	
	public void clickOnBasicOperations() {
		driver.navigate().to("https://dsportalapp.herokuapp.com/array/");
		driver.findElement(basicoperation).click();
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

public  void TextIndentation(WebDriver driver, WebElement pythonElement, int row, int space,boolean flag) {
	 action = new Actions(driver);
      // Keys cmdCtrl = Platform.getCurrent().is(Platform.MAC) ? Keys.COMMAND : Keys.CONTROL;
	for(int i=1;i<=row;i++) {
	      action.sendKeys(Keys.ARROW_UP).keyUp(Keys.SHIFT).perform();
	       for(int j=1;j<=space;j++) {
           if(i==1 && flag) action.sendKeys(Keys.BACK_SPACE).perform();
           else action.sendKeys(Keys.DELETE).perform();
		   }
	}
}


		public void pythonEditor1() throws IOException {
			WebElement try_editor_clear=driver.findElement(python_editor);
			String[] list = excel.fileReader()	;
			Actions actions= new Actions(driver);
			//WebElement try_editor =  driver.findElement(clr_text);
			actions.click(try_editor_clear).keyDown(Keys.CONTROL).sendKeys("\u0061").sendKeys(Keys.BACK_SPACE).keyUp(Keys.CONTROL).perform();
			driver.findElement(python_editor).sendKeys(list[2]);
			TextIndentation(driver, try_editor_clear, 3, 6, true);
			TextIndentation(driver, try_editor_clear, 1, 4, false);
			driver.findElement(run).click();
			System.out.println("Output is :"+driver.findElement(output).getText());
			actions.click(try_editor_clear).keyDown(Keys.CONTROL).sendKeys("\u0061").sendKeys(Keys.BACK_SPACE).keyUp(Keys.CONTROL).perform();
			driver.findElement(python_editor).sendKeys(list[3]);
			TextIndentation(driver, try_editor_clear, 1, 2, true);
			TextIndentation(driver, try_editor_clear, 3, 2, false);
			driver.findElement(run).click();
			System.out.println("Output is :"+driver.findElement(output).getText());
			
				
			
			
		}

	public void clickOnApplicationArray() {
		
		driver.navigate().to("https://dsportalapp.herokuapp.com/array/");
		driver.findElement(applicationofarray).click();
	}
	
	public void clickOnPracticeQuestions() {
		driver.navigate().to("https://dsportalapp.herokuapp.com/array/applications-of-array/");
		driver.findElement(practicequestions).click();
	}
	
	public void clickOnMaxConsecutive() {
		driver.navigate().to("https://dsportalapp.herokuapp.com/array/practice");
		driver.findElement(maxconsecutive).click();
	}
	
	public void clickOnEven() {
		driver.navigate().to("https://dsportalapp.herokuapp.com/array/practice");
		driver.findElement(evennumbers).click();
	}
	public void clickOnSquares() {
		driver.navigate().to("https://dsportalapp.herokuapp.com/array/practice");
		driver.findElement(squares).click();
	}
	
	public void searchArray() {
		driver.navigate().to("https://dsportalapp.herokuapp.com/array/practice");
		driver.findElement(searcharray).click();
	}
	
	

}
