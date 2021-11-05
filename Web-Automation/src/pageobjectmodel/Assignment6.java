package pageobjectmodel;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment6 {
	public static WebDriver oBrowser=null;
	public static ActiTimePage oPage=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		flyout();
		 createcustomer();
		 createproject();
		 modifyproject();
		 deleteproject();
		 deletecustomer();
		 logout();
		 closeApplication();

	}
	static void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver","E:\\ExampleAutomation\\Automation\\Web-Automation\\Library\\driver\\chromedriver.exe");
			oBrowser=new ChromeDriver();
			oPage=new ActiTimePage(oBrowser);
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
			oPage.getUserName().sendKeys("admin");
			oPage.getPassword().sendKeys("manager");
			oPage.getLogin().click();
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	static void flyout()
	{
		try
		{
			oPage.getFlyOut().click();
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	static void createcustomer()
	{
		try
		{
			oPage.Tasks().click();
			oPage.addcustomer().click();
			Thread.sleep(4000);
			oPage.newcustomer().click();
			Thread.sleep(4000);
			oPage.getcustomername().sendKeys("Laxop");
			oPage.clickoncustomer().click();
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	static void createproject()
	{
		try
		{
			oPage.Tasks().click();
			Thread.sleep(4000);
			oPage.addcustomer().click();
			Thread.sleep(4000);
			oPage.clicknewproject().click();
			Thread.sleep(4000);
			oPage.giveprojectname().sendKeys("Aero");
			oPage.clickcreateproject().click();
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	static void modifyproject()
	{
		try
		{
			oPage.flowermodifyproject1().click();
			Thread.sleep(4000);
			oPage.descrbeproject().click();
			Thread.sleep(4000);
			oPage.descrbeproject().sendKeys("Its a Project1");
			Thread.sleep(4000);
			oPage.flowermodifyproject1().click();
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	static void deleteproject()
	{
		try
		{
			oPage.flowerproject().click();
			Thread.sleep(4000);
			oPage.projectAction().click();
			Thread.sleep(4000);
			oPage.delectproject().click();
			Thread.sleep(4000);
			oPage.deleteprojectperminently().click();
			Thread.sleep(4000);
			
			
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	static void deletecustomer()
	{
		try
		{
			oPage.flowercustomer().click();
			Thread.sleep(4000);
			oPage.ActionDeletcustomer().click();
			oPage.clickdelete().click();
			oPage.deleteperminently().click();
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
			oPage.getlogout().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	static void closeApplication()
	{
		try
		{
			oBrowser.close();
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	
}
