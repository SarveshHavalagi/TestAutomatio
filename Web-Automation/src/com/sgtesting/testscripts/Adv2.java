package com.sgtesting.testscripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Adv2 {
	public static WebDriver oBrowser=null;

	public static void main(String[] args)  {
		launchBrowser();
		 navigate();
		 login();
		 minimize();
		 Createuser1();
		 logout();
}
		
	


static void launchBrowser()
{
	try
	{
		System.setProperty("webdriver.chrome.driver","E:\\ExampleAutomation\\Automation\\Web-Automation\\Library\\driver\\chromedriver.exe");
		oBrowser=new ChromeDriver();
	}catch(Exception e)
	{
		e.printStackTrace();	
	}
}
static void navigate()
{
	try
	{
		oBrowser.navigate().to("http://localhost:82/login.do");
		oBrowser.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
	}catch(Exception e)
	{
		e.printStackTrace();	
	}
}
static void login()
{
	try
	{
	
		oBrowser.findElement(By.id("username")).sendKeys("admin");
		oBrowser.findElement(By.name("pwd")).sendKeys("manager");
		oBrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
		Thread.sleep(4000);
	}catch(Exception e)
	{
		e.printStackTrace();
	}
}
static void minimize()
{
	try
	{
		oBrowser.findElement(By.xpath("//*[@id=\'gettingStartedShortcutsPanelId\']")).click();
	}catch(Exception e)
	{
		e.printStackTrace();
	}
}
static void Createuser1()
{
	try
	{
		oBrowser.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a/div[2]")).click();
		Thread.sleep(4000);
		oBrowser.findElement(By.xpath("//*[@id=\'createUserDiv\']/div/div[2]")).click();
		Thread.sleep(4000);
		oBrowser.findElement(By.id("userDataLightBox_firstNameField")).sendKeys("Zaid");
		oBrowser.findElement(By.id("userDataLightBox_lastNameField")).sendKeys("Quadri");
		oBrowser.findElement(By.id("userDataLightBox_emailField")).sendKeys("sarve@gmail.com");
		oBrowser.findElement(By.id("userDataLightBox_usernameField")).sendKeys("apple");
		oBrowser.findElement(By.id("userDataLightBox_passwordField")).sendKeys("12345");
		oBrowser.findElement(By.id("userDataLightBox_passwordCopyField")).sendKeys("12345");
		oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']/div/span")).click();	
		Thread.sleep(4000);
		
	}catch(Exception e)
	{
		e.printStackTrace();
	}
}
static void logout()
{
	try
	{
		oBrowser.findElement(By.linkText("Logout")).click();
	}catch(Exception e)
	{
		e.printStackTrace();
	}
}
}
