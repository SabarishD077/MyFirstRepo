package com.pom.qa.TestCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.pom.qa.base.TestBase;
import com.pom.qa.pages.MainPage;
import com.pom.qa.pages.SigninPage;
@Listeners(CustomListener.class)
public class SiginpageTest extends TestBase {
	SigninPage signinpage;
	MainPage mainpage;
	public SiginpageTest()
	{
		super();
	}
	@BeforeMethod
	public void setUp()
	{
		signinpage=new SigninPage();
		mainpage=new MainPage(); 
		initialization();
		mainpage.SiginBtnClick();
	}
	
    @Test
    public void PageSigninTest()
    {
    	signinpage.PageSignin();
    }
    @Test
    public void SigninTitleTest()
    
    {
    	signinpage.PageSignin();
    	String titlesignin=signinpage.SigninTitle();
    	Assert.assertEquals(titlesignin, "My account - My Store");
    }
    @AfterMethod
    public void tearDown()
    {
    	driver.quit();
    }
    

}
