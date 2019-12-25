package com.pom.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {
	public static WebDriver driver;
	public static Properties prop;
	
	public TestBase()
{
	try {
		prop=new Properties();
		FileInputStream ip= new FileInputStream("C:\\Users\\SABARISH\\eclipse-workspace\\PageObjectModelPracticeTest"
				+ "\\src\\main\\java\\com\\pom\\qa\\config\\config.properties");
		prop.load(ip);
	}
	catch(FileNotFoundException e)
	{
		e.printStackTrace();
	}
	catch(IOException e)
	{
		e.printStackTrace();
	}
}
	
	public void initialization()
	{
		String browsername=prop.getProperty("browser");
		if(browsername.equals("chrome"))
		
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\SABARISH\\Downloads\\chromedriver"
					+ "\\chromedriver.exe");
			driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
	}

}
