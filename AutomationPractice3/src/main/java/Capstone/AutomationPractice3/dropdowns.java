package Capstone.AutomationPractice3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdowns {
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\riaz_\\eclipse-workspace\\AutomationPractice3\\src\\Drivers\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.navigate().to("https:www.facebook.com");
			driver.manage().window().maximize();
			Thread.sleep(3000);
			WebElement createaccount = driver.findElement(By.linkText("Create new account"));
			createaccount.click();
			Thread.sleep(3000);
			WebElement fname = driver.findElement(By.name("firstname"));
			fname.sendKeys("john");
			Thread.sleep(3000);
			WebElement lname = driver.findElement(By.name("lastname"));
			lname.sendKeys("Doe");
			Thread.sleep(6000);
			WebElement emailfield = driver.findElement(By.name("reg_email__"));
			emailfield.sendKeys("john@gmail.com");
			Thread.sleep(3000);
			WebElement birthmonth = driver.findElement(By.name("birthday_month"));
			Select ob = new Select(birthmonth);
			ob.selectByIndex(8);
			Thread.sleep(3000);
			WebElement birthday = driver.findElement(By.name("birthday_day"));
			Select ot = new Select(birthday);
			ot.selectByValue("20");
			Thread.sleep(3000);;
			WebElement birthyear = driver.findElement(By.id("year"));
			Select oy = new Select(birthyear);
			oy.selectByVisibleText("2022");
			Thread.sleep(3000);
			WebElement gender = driver.findElement(By.xpath("(//*[@name='sex'])[2]"));
			gender.click();
			
			
			

	}

}
