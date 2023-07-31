package com.actitime.generic;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.asserts.SoftAssert;

import com.actitime.pom.ActiTIME_Enter_Time_Track;
import com.actitime.pom.ActiTIME_Login;

public class BaseClass {

	public static WebDriver driver;
	public SoftAssert s;
	@BeforeClass
	public void OpenBrowser() 
	{
		driver=new ChromeDriver();
		s=new SoftAssert();
	}
	@AfterClass
	public void closeBrowser()
	{
		driver.close();
		
	}
	@BeforeMethod
	public void login() throws IOException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		FileLib l=new FileLib();
		driver.get(l.getPropertyData("Url"));
		String un = l.getPropertyData("Username");
		String pw = l.getPropertyData("Password");
		ActiTIME_Login a=new ActiTIME_Login(driver);
		a.setLogin(un,pw);
	}
	@AfterMethod
	public void logout() {
		ActiTIME_Enter_Time_Track a=new ActiTIME_Enter_Time_Track(driver);
		a.setLogout();
	}
}
	


