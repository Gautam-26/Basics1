package tests;

import org.testng.annotations.Test;

import base.BaseTest;

public class LaunchBrowser extends BaseTest
{
	
	
	@Test
	public void tc_launchBrowser()
	{
		driver.get("http://www.google.com");
	}
	
	

}
