package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import base.BaseTest;

public class AmazonLoginTest extends BaseTest
{
	@Test
	public void tc_amazonLoginTest()
	{
		driver.get("https://www.amazon.in/");

		driver.findElement(By.id("nav-link-accountList")).click();
		
		driver.findElement(By.id("ap_email")).sendKeys("9966973477");
		
		driver.findElement(By.id("continue")).click();
		
		driver.findElement(By.id("ap_password")).sendKeys("Amazon26");
		
		driver.findElement(By.id("signInSubmit")).click();
		
		
		/*
		 * WebElement Signin = driver.findElement(By.id("nav-link-accountList"));
		 * 
		 * Actions actions = new Actions(driver);
		 * 
		 * actions.moveToElement(Signin).build().perform();
		 * 
		 * driver.findElement(By.xpath("//span[contains(text(),'Sign Out')]")).click();
		 */
		
		

	}

}
