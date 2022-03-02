package com.training;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChromeTest {

	
	String browserName ="chrome";
	
	WebDriver driver;
	
	@BeforeEach
	public  void setup() {
		if(browserName.equals("edge"))
		{
			WebDriverManager.edgedriver().setup();;
			driver = new EdgeDriver();
		}	
		else if(browserName.equals("chrome"))
		{
			WebDriverManager.chromedriver().setup();;
			driver = new ChromeDriver();
		}
	}
	
	@Test
	public void testAmazonSearchFunctionality(){
		driver.get("http://www.amazon.in");
		driver.manage().window().maximize();
		// XPATH locators
		driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("mobiles");
		driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]")).click();
		
	}
	
	@Test
	public void testGoogleSearchFunctionality(){
		driver.get("http://www.google.in");
		driver.manage().window().maximize();
		// XPATH locators
		driver.findElement(By.name("q")).sendKeys("ray ban sunglasses");
		driver.findElement(By.name("btnK")).click();
		
		
	}
	
	@AfterEach
	public void tearDown() {
		driver.close();
		driver.quit();
		
	}
}
