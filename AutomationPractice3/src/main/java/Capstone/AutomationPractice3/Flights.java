package Capstone.AutomationPractice3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flights {
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\riaz_\\git\\repository5\\AutomationPractice3\\src\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("https://www.expedia.com");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement flights = driver.findElement(By.xpath("//*[text()='Flights']"));
		flights.click();
		Thread.sleep(3000);
		WebElement departure = driver.findElement(By.xpath("//*[@data-name='date_form_field']"));
		departure.click();
		Thread.sleep(3000);
		WebElement departuredate = driver.findElement(By.xpath("//*[@aria-label='Aug 30, 2023']"));
		departuredate.click();

	}

}
