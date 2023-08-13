package Capstone.AutomationPractice3;

import org.testng.annotations.Test;

import Amazon.pages.Home3;
import Amazon.pages.Sign;
import Common.Utilities;

import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class SignToAmazon extends Utilities {
	
  @Test
  public void f() {
	  Home3 home = new Home3(driver);
	  home.signInClick();
	  Sign sign = new Sign(driver);
	  sign.emailsendkeys();
	  sign.passwordClick();
	  
  }
  
}


