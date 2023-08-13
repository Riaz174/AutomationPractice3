package Capstone.AutomationPractice3;
import org.testng.annotations.Test;

import Common.Utilities;

import org.testng.annotations.DataProvider;

public class Points extends Utilities {
  @Test(dataProvider = "Set")
  public void f(String n, String s) {
	  HomeOfFacebook home = new HomeOfFacebook(driver);
		home.Username(n);
		home.Password(s);
		home.login();
	  
  }

  @DataProvider
  public Object[][] Set() {
    return new Object[][] {
      new Object[] { "Ali", "abcde" },
      new Object[] { "Saleem", "fghij" },
      new Object[]{"Rabiya","klmnop"},
    };
  }
}
