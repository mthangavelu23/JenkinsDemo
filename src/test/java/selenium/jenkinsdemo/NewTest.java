package selenium.jenkinsdemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewTest {
  @Test
  public void NewTest() {
	  //System.setProperty("webdriver.chrome.driver", "/path/to/chromedriver");
	  //WebDriver driver = new ChromeDriver();
	  WebDriver driver = new ChromeDriver();
	  driver.navigate().to("google.com");
	  System.out.println("Login Test");
  }
}
