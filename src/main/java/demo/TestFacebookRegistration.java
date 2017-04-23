package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class TestFacebookRegistration {

	public static void main(String[] args) {
		
		  	System.setProperty("webdriver.gecko.driver", "C:\\geckodriver.exe");
	        WebDriver driver = new FirefoxDriver();
	        driver.get("https://www.facebook.com");
	        driver.manage().window().maximize();
	        driver.findElement(By.name("firstname")).sendKeys("Name");
	        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	        driver.findElement(By.name("lastname")).sendKeys("LastName");
	        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	        driver.findElement(By.id("u_0_6")).sendKeys("1234567890");
	        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	        driver.findElement(By.id("u_0_d")).sendKeys("Password");
	        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	        driver.findElement(By.id("u_0_h")).click();
	        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	        Select sell = new Select(driver.findElement(By.id("day")));
	        sell.selectByIndex(5);
	        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	        Select sell2 = new Select(driver.findElement(By.id("month")));
	        sell2.selectByValue("5");
	        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	        Select sell3 = new Select(driver.findElement(By.id("year")));
	        sell3.selectByVisibleText("2005");
	        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	        driver.findElement(By.name("websubmit")).click();
	        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	        driver.quit();

	}

}
