package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import com.cucumberrunner.AbstractMain;

public class Homepage extends AbstractMain{
	
	public void setHomePage()
	{
		System.setProperty("webdriver.chrome.driver", "/Users/shivakumarthalla/Documents/Automation/driver/chromedriver");
		 driver=new ChromeDriver();
		driver.get ("https://tuclothing.sainsburys.co.uk/");
	}
	public void enterSearchDetails()
	{
		driver.findElement(By.id("search")).clear();
		driver.findElement(By.id("search")).sendKeys("dresses");
	}
	public void searchButton()
	{
		driver.findElement(By.className("searchButton")).click(); 
	}

}
