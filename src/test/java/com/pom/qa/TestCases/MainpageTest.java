package com.pom.qa.TestCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.pom.qa.base.TestBase;
import com.pom.qa.pages.MainPage;

public class MainpageTest extends TestBase {
	MainPage mainpage;
	public MainpageTest(){
		super();
	}
	
	@BeforeMethod
	public void setUp()
	{
		mainpage=new MainPage();
		initialization();
	}
	
	@Test(priority=1)
	public void MainPageTitleTest()
	{
	String title=mainpage.MainPageTitle();
	Assert.assertEquals(title, "My Store");
	}
	@Test(priority=2)
	public void signinbtnvisibleTest() 
	{
		boolean flag=mainpage.signinbtnvisible();
		Assert.assertTrue(flag);
		
	}
	@Test(priority=3)
	public void SiginBtnClickTest()
	{
		mainpage.SiginBtnClick();
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}

}
