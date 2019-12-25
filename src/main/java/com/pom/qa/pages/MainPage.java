package com.pom.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import com.pom.qa.base.TestBase;

public class MainPage extends TestBase {
	
	By login=By.xpath("//a[@class='login']");

	public String MainPageTitle()
	{
		return driver.getTitle();
	}
	
	public boolean signinbtnvisible()
	{
		//WebElement element=driver.findElement(By.xpath("//a[@class='login']"));
		return driver.findElement(login).isDisplayed();
		//return element.isDisplayed();

	}
	
	public SigninPage SiginBtnClick()
	{
		//WebElement element=driver.findElement(By.xpath("//a[@class='login']"));
		//element.click();
		driver.findElement(login).click();
		return new SigninPage();
	}
	
}
