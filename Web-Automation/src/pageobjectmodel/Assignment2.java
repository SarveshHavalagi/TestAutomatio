package pageobjectmodel;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2 {
	public static WebDriver oBrowser=null;
	public static ActiTimePage oPage=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		flyout();
		createuser();
		adduser();
		userdetails();
		modifyuser();
		deleteuserr1();
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
	static void createuser()
	{
		try
		{
			oPage.getuser().click();
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	static void adduser()
	{
		try
		{
			oPage.getAddUser().click();
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	static void userdetails()
	{
		try
		{
			oPage.getfirstname().sendKeys("Tazim");
			oPage.getlastname().sendKeys("Khan");
			oPage.getemail().sendKeys("saruva@gmail.com");
			oPage.getusername().sendKeys("Ravi");
			oPage.getpassword().sendKeys("1236");
			oPage.getcopypasswors().sendKeys("1236");
			oPage.getcreate().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
		e.printStackTrace();		
		}
	}
	static void modifyuser()
	{
		try
		{
			oPage.clickOnuser().click(); //khan,tazim
			oPage.getfirstname().clear();
			oPage.getfirstname().sendKeys("Zaid");
			Thread.sleep(2000);
			oPage.getcreate().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
		e.printStackTrace();		
		}
	}
	static void deleteuserr1()
	{
		try
		{
			oPage.clickOnuser().click();
			Thread.sleep(2000);
			oPage.getdeleteuser1().click();
			Thread.sleep(2000);
			Alert oAlert=oBrowser.switchTo().alert();
			String str=oAlert.getText();
			System.out.println(str);
			oAlert.accept();
			Thread.sleep(3000);
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
			oBrowser.quit();
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	
		
	


}
