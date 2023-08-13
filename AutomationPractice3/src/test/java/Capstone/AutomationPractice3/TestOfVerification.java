package Capstone.AutomationPractice3;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Common.Utilities;

import org.testng.annotations.BeforeMethod;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class TestOfVerification extends Utilities {
	
  @Test(priority = 2,dependsOnMethods = "signin")//This is how to fix priority & dependency.
  public void f() throws IOException, InterruptedException {
	  HomeOfFacebook home = new HomeOfFacebook(driver);
	  String tx = home.verificationOfText();
	  shots();
	  System.out.println(tx);
	 // Assert.assertEquals(tx, "Connect with friends and the world around you on Facebook.");
	  SoftAssert st = new SoftAssert();
	  Thread.sleep(2000);
	  shots();
	  st.assertEquals(tx, "Connect with friends and the world around you on Facebook.");
	  System.out.println("This is after assertion");
	  Thread.sleep(2000);
	  shots();
	  st.assertAll();
	 }
  
  @Test(priority = 1)  
public void signin(){
	HomeOfFacebook home = new HomeOfFacebook(driver);
	home.Username("abcde");
	home.Password("fghijk");
	home.login();
  }
    
	  
  }
  
	  



 


