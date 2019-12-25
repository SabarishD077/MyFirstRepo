package com.pom.qa.TestCases;

import org.testng.ITestListener;
import org.testng.ITestResult;

import com.pom.qa.pages.SigninPage;

public class CustomListener extends SigninPage implements ITestListener {
	
	
	public void onTestFailure(ITestResult result)
	{
		failed();
	}

}
