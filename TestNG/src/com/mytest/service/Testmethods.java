package com.mytest.service;

import org.testng.annotations.Test;

public class Testmethods {
	@Test(priority= 2)
	public void launchBrowser()
	{
		System.out.println("launchBrowser");
	
	}
	
	@Test(priority= 'A')
	public void openURL()
	{
		System.out.println("openURL");
	
	}
	
	@Test(enabled= false)
	public void closeBrowser()
	{
		System.out.println("closeBrowser");
	
	}
	
	

}
