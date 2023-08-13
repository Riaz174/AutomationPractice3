package Capstone.AutomationPractice3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomeOfFacebook {
	public static WebDriver driver;
	@FindBy(xpath = "//*[contains(text(),'Connect with friends and the world around you on Facebook.')]") WebElement text;
	@FindBy(name = "email") WebElement email;
	@FindBy(name = "pass") WebElement passwd; 
	@FindBy(name = "login") WebElement button;
	
	public HomeOfFacebook(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	public String verificationOfText() {
		String tx = text.getText();
		return tx;
	}
	public void Username(String id) {
		email.sendKeys(id);
	}
	public void Password(String id) {
		passwd.sendKeys(id);
	}
	public void login() {
		button.click();
		
	}
	

}
