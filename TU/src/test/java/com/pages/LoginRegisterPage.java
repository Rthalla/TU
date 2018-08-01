package com.pages;

import org.openqa.selenium.By;

import com.cucumberrunner.AbstractMain;

public class LoginRegisterPage  extends AbstractMain{
	
	public void loginButton(String userName , String password)
	{
		driver.findElement(By.linkText("Tu Log In / Register")).click();
		driver.findElement(By.className("cookieClose")).click();
		driver.findElement(By.id("j_username")).clear();
		driver.findElement(By.id("j_username")).sendKeys(userName);
		driver.findElement(By.id("j_password")).sendKeys(password);
	}

	public void submitButton()
	{
		driver.findElement(By.className("loginButtonMain")).click();
	}
	
	public void loginLink()
	{
		driver.findElement(By.linkText("Tu Log In / Register")).click();
	}
}
