package pageobjectmodel;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Advanced2 {
	public static WebDriver oBrowser=null;
	public static ActiTimePageforAdvanced oPage=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		flyout();
		createuser1();
		logout();
		
		usernamelogin1();
		rocket();
		createuser2();
		logout();
		
		usernamelogin2();
		rocket();
		createuser3();
		logout();
		
		usernamelogin3();
		rocket();
		logout();
		
		usernamelogin2();
		modifypassword3();
		logout();
		loginasuser33();
		logout();
		
		usernamelogin1();
		modifypassword2();
		logout();
		loginasuser22();
		logout();
		
		login();
		modifypassword1();
		logout();
		loginasuser11();
		logout();
		
	    loginasuser22();
		deleteuserr33();
		logout();
		
		loginasuser11();
		deleteuserr22();
		logout();
		
		login();
		deleteuserr11();
		logout();
		closeApplication();
		
	}
	static void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver","E:\\ExampleAutomation\\Automation\\Web-Automation\\Library\\driver\\chromedriver.exe");
			oBrowser=new ChromeDriver();
			oPage=new ActiTimePageforAdvanced(oBrowser);
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

	static void createuser1()
	{
		try
		{
		oPage.getuser().click();
		Thread.sleep(2000);
		oPage.getAddUser().click();
		oPage.getfirstname().sendKeys("Tazim");
		oPage.getlastname().sendKeys("Khan");
		Thread.sleep(2000);
		oPage.getemail().sendKeys("sarluva@gmail.com");
		oPage.getusername().sendKeys("Prabhakar");
		oPage.getpassword().sendKeys("1236");
		oPage.getcopypasswors().sendKeys("1236");
		oPage.getcreate().click();
		Thread.sleep(2000);
		}catch(Exception e)
		{
		e.printStackTrace();		
		}
	}
	static void createuser2()
	{
		try
		{
		oPage.getuser().click();
		Thread.sleep(2000);
		oPage.getAddUser().click();
		oPage.getfirstname().sendKeys("Gowtam");
		oPage.getlastname().sendKeys("Krishna");
		Thread.sleep(2000);
		oPage.getemail().sendKeys("gohwtam@gmail.com");
		oPage.getusername().sendKeys("Gopal");
		oPage.getpassword().sendKeys("12367");
		oPage.getcopypasswors().sendKeys("12367");
		oPage.getcreate().click();
		Thread.sleep(2000);
		}catch(Exception e)
		{
		e.printStackTrace();		
		}
	}
	static void createuser3()
	{
		try
		{
		oPage.getuser().click();
		Thread.sleep(2000);
		oPage.getAddUser().click();
		oPage.getfirstname().sendKeys("Umesh");
		oPage.getlastname().sendKeys("Ranjan");
		oPage.getemail().sendKeys("umejsh@gmail.com");
		oPage.getusername().sendKeys("danesh");
		oPage.getpassword().sendKeys("123688");
		oPage.getcopypasswors().sendKeys("123688");
		Thread.sleep(2000);
		oPage.getcreate().click();
		Thread.sleep(2000);
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
	static void usernamelogin1()
	{
		try
		{
			oPage.getUserName().sendKeys("Prabhakar");
			oPage.getPassword().sendKeys("1236");
			oPage.getLogin().click();
			Thread.sleep(4000);
			
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	static void usernamelogin2()
	{
		try
		{
			oPage.getUserName().sendKeys("Gopal");
			oPage.getPassword().sendKeys("12367");
			oPage.getLogin().click();
			Thread.sleep(4000);
			
			
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	static void usernamelogin3()
	{
		try
		{
			oPage.getUserName().sendKeys("danesh");
			oPage.getPassword().sendKeys("123688");
			oPage.getLogin().click();
			Thread.sleep(4000);
			
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	static void modifypassword1()
	{
		try
		{
			oPage.getuser().click();
			Thread.sleep(4000);
			oPage.clickoncreateduser1().click();
			Thread.sleep(4000);
			oPage.getpassword().sendKeys("7894");
			Thread.sleep(4000);
			oPage.getcopypasswors().sendKeys("7894");
			Thread.sleep(4000);
			oPage.clickonsavechangesmodifypassword().click();
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	static void modifypassword2()
	{
		try
		{
			oPage.getuser().click();
			Thread.sleep(4000);
			oPage.clickoncreateduser2().click();
			Thread.sleep(4000);
			oPage.getpassword().sendKeys("78945");
			Thread.sleep(4000);
			oPage.getcopypasswors().sendKeys("78945");
			Thread.sleep(4000);
			oPage.clickonsavechangesmodifypassword().click();
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	static void modifypassword3()
	{
		try
		{
			oPage.getuser().click();
			Thread.sleep(4000);
			oPage.clickoncreateduser3().click();
			Thread.sleep(4000);
			oPage.getpassword().sendKeys("789455");
			Thread.sleep(4000);
			oPage.getcopypasswors().sendKeys("789455");
			Thread.sleep(4000);
			oPage.clickonsavechangesmodifypassword().click();
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	static void loginasuser11()
	{
		try
		{
			oPage.getUserName().sendKeys("Prabhakar");
			oPage.getPassword().sendKeys("7894");
			Thread.sleep(4000);
			oPage.getLogin().click();
			Thread.sleep(4000);
			
			
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	static void loginasuser22()
	{
		try
		{
			oPage.getUserName().sendKeys("Gopal");
			oPage.getPassword().sendKeys("78945");
			Thread.sleep(4000);
			oPage.getLogin().click();
			Thread.sleep(4000);
			
			
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	static void loginasuser33()
	{
		try
		{
			oPage.getUserName().sendKeys("danesh");
			oPage.getPassword().sendKeys("789455");
			Thread.sleep(4000);
			oPage.getLogin().click();
			Thread.sleep(4000);
			
			
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	static void deleteuserr11()
	{
		try
		{
			oPage.getuser().click();
			Thread.sleep(2000);
			oPage.clickoncreateduser1().click();
			Thread.sleep(2000);
			oPage.clickondeleteuser().click();
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
	static void deleteuserr22()
	{
		try
		{
			oPage.getuser().click();
			Thread.sleep(2000);
			oPage.clickoncreateduser2().click();
			Thread.sleep(2000);
			oPage.clickondeleteuser().click();
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
	static void deleteuserr33()
	{
		try
		{
			oPage.getuser().click();
			Thread.sleep(2000);
			oPage.clickoncreateduser3().click();
			Thread.sleep(2000);
			oPage.clickondeleteuser().click();
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
	static void rocket()
	{
		try
		{
			oPage.getRocket().click();
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	
	
}
