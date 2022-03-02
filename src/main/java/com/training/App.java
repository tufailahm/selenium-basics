package com.training;

import org.openqa.selenium.chrome.ChromeDriver;

public class App 
{
    public static void main( String[] args )
    {
    	String browserName = "chrome";
    	
    	//setting up web driver
    	System.setProperty
    	("webdriver.chrome.driver", "C:\\Users\\tufai\\Downloads\\chromedriver\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("http://www.amazon.com");
        
      //setting up web driver for edge
    }
}
