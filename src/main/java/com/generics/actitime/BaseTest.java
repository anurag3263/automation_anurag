package com.generics.actitime;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest implements AutoConstant
{
	public WebDriver driver;
	
	@BeforeMethod(alwaysRun = true)
	public void openBrowser()
	{
		
		 WebDriverManager.chromedriver().setup();
		  driver=new ChromeDriver();
		 
		//System.setProperty(gecko_key, gecko_value);
		//driver=new FirefoxDriver();
		//System.setProperty(edge_key, edge_value);
		//driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get(url);
	}
	
	/*
	 * @AfterMethod 
	 * public void closeBrowser() { 
	 * driver.quit(); 
	 * }
	 */

}
