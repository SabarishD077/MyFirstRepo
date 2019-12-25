package com.pom.qa.pages;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

import com.pom.qa.base.TestBase;

public class SigninPage extends TestBase {
	
	By email=By.xpath("//input[@id='email']");
	By password=By.xpath("//input[@id='passwd']");
	By signin=By.xpath("//button[@id='SubmitLogin']");
	
	public HomePage PageSignin()
	{
		driver.findElement(email).sendKeys(prop.getProperty("username"));
		driver.findElement(password).sendKeys(prop.getProperty("password"));
		driver.findElement(signin).click();
		return new HomePage();
	}
	
	public String SigninTitle()
	{
		return driver.getTitle();
	}
	
	public void failed()
	{
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileHandler.copy(src, new File("C:\\Users\\SABARISH\\eclipse-workspace\\PageObjectModelPracticeTest\\"
					+ "ScreenshotFailedTC\\TCFailed.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
	
	
	
	
	
	
	

}
