package Capstone.AutomationPractice3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Absolutes {
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver" ,"C:\\Users\\riaz_\\eclipse-workspace\\AutomationPractice3\\src\\Drivers\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.navigate().to("https://www.facebook.com");
			driver.manage().window().maximize();
			Thread.sleep(3000);
			WebElement emailfield = driver.findElement(By.xpath("//input[@placeholder='Email or phone number']"));
			emailfield.sendKeys("john@gmail.com");
			Thread.sleep(3000);
			WebElement passwordfield = driver.findElement(By.xpath("//input[@placeholder='Password']"));
			passwordfield.sendKeys("xyz@123");
			Thread.sleep(3000);
			WebElement forgotpword = driver.findElement(By.xpath("//*[text()='Forgot password?']"));
			forgotpword.click();
			

	}

}
