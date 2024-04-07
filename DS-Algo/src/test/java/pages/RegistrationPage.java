package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegistrationPage {
	
//new
	 WebDriver driver;
	
	
	By username = By.id("id_username");
	By password = By.id("id_password1");
	By password1=By.id("id_password");
	By confirmpassword = By.id("id_password2");
	By register = By.xpath("//input[@value='Register']");
	By passwordmismatch = By.xpath("//div[@role='alert']");
	By successmessage = By.xpath("//div[@role='alert']");
	By signout = By.xpath("//a[normalize-space()='Sign out']");
	By signoutmessage = By.xpath("//div[@role='alert']");
	By signin = By.xpath("//a[@href='/login']");
	By login = By.xpath("//input[@value='Login']");
	
	
	public RegistrationPage(WebDriver driver) {
		
		this.driver=driver;
	}
	
public void clickRegister() {
		
		driver.findElement(register).click();
				
	}

public String errMsgFillFields()
{
	WebElement activeElement =driver.switchTo().activeElement();
	String message = activeElement.getAttribute("validationMessage");
	return message;
}

public void enterUsernamePassword(String userName,String passWord, String confirmPassword) {
	
	driver.findElement(username).sendKeys(userName);

	driver.findElement(password).sendKeys(passWord);
	
	driver.findElement(confirmpassword).sendKeys(confirmPassword);
}

public String passwordMismtach() {
	return driver.findElement(passwordmismatch).getText();
}

public String successMessage() {
	return driver.findElement(successmessage).getText();
}

public void signOut() {
	driver.findElement(signout).click();
}

}
