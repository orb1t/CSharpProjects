package BasicWebdriverCommands;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;

public class Actionsclass {
  
public static WebDriver driver;
	
	@BeforeMethod
	public void beforeMethod() throws InterruptedException {
		// to launch a firefox browser
		System.setProperty("webdriver.chrome.driver", "C:\\Ruby22-x64\\bin\\chromedriver.exe");
		driver = new ChromeDriver();

		// naviagte to salesforce url
		driver.get("https://test.salesforce.com/");

		// implicit wait method
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

		// selenium command to maximize the browser
		driver.manage().window().maximize();

		// to pass username in text box
		driver.findElement(By.id("username")).sendKeys("dsintegration-admin@servicesource.com.sitnxtqlik");

		// to pass username in text box
		driver.findElement(By.id("password")).sendKeys("srevds123!");

		// to perform click action on login button
		driver.findElement(By.name("Login")).click();

		// implicit wait
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

  
  @Test
  public void mouseover() throws InterruptedException {
	  
	  WebElement element=driver.findElement(By.id("userNavLabel"));
	  
	  Actions act=new Actions(driver);
	  act.moveToElement(element).build().perform();
	  Thread.sleep(2000);
	  act.contextClick(element).build().perform();
//	  act.clickAndHold().build().perform();
//	  act.doubleClick(element).build().perform();
//	  act.dragAndDrop(source, target);
  }

  @AfterMethod
  public void afterMethod() {
    driver.quit();
  }
 
}
