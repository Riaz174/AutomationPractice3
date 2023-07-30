package Capstone.AutomationPractice3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ilocators {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\riaz_\\eclipse-workspace\\AutomationPractice3\\src\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("https://www.amazon.com/");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		//WebElement emailfield = driver.findElement(By.name("email"));
		//emailfield.sendKeys("abc@gmail.com");
		//Thread.sleep(3000);
		//WebElement continuefield = driver.findElement(By.id("continue"));
		//continuefield.click();
		//Thread.sleep(3000);
		//WebElement passwordfield = driver.findElement(By.id("ap_password"));
		//passwordfield.sendKeys("john@123");
		//Thread.sleep(3000);
		//WebElement signfield = driver.findElement(By.id("signInSubmit"));
		//signfield.click();
		//Thread.sleep(3000);
		//WebElement forgotpword = driver.findElement(By.xpath("//*[contains(text(),'Forgot your password?')]"));
		//forgotpword.click();
		
		WebElement bestsellers = driver.findElement(By.linkText("Best Sellers"));
		bestsellers.click();
		Thread.sleep(3000);
		WebElement customer = driver.findElement(By.linkText("Customer Service"));
		customer.click();
		Thread.sleep(3000);
		WebElement basic = driver.findElement(By.linkText("Amazon Basics"));
		basic.click();
		Thread.sleep(3000);
		WebElement music = driver.findElement(By.linkText("Music"));
		music.click();
		Thread.sleep(3000);
		//WebElement backtoschool = driver.findElement(By.partialLinkText("Back"));
		//backtoschool.click();// PatialLinkText means a part of text.
		//Thread.sleep(3000);
		//WebElement serchfield = driver.findElement(By.name("field-keywords"));
		//serchfield.sendKeys("Computer");
		//Thread.sleep(3000);
		WebElement book = driver.findElement(By.linkText("Books"));
		book.click();
		
		
		

	}

}
