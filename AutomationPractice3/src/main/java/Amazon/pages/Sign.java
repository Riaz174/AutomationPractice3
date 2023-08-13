package Amazon.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Sign {
	public WebDriver driver;
	@FindBy(name = "email") WebElement email;
	@FindBy(id = "pass") WebElement psword;
	
	public Sign(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	public void emailsendkeys() {
		email.sendKeys("John");
	}
	public void passwordClick() {
		psword.click();
	}

}
