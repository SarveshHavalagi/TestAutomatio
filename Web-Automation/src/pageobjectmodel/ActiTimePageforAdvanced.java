package pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActiTimePageforAdvanced {
	
	
	
	public ActiTimePageforAdvanced(WebDriver oBrowser)    //constructor
	{
		PageFactory.initElements(oBrowser,this);
	}
	private WebElement username;
	public WebElement getUserName()
	{
		return username;
	}
	private WebElement pwd;
	public WebElement getPassword()
	{
		return pwd;
	}
	@FindBy(xpath="//div[text()='Login ']")
	private WebElement oLogin;
	public WebElement getLogin()
	{
		return oLogin;
	}
	private WebElement gettingStartedShortcutsPanelId;
	public WebElement getFlyOut()
	{
		return gettingStartedShortcutsPanelId;
	}
	@FindBy(linkText="Logout")
	private WebElement oLogout;
	public WebElement getlogout()
	{
		return oLogout;
	}
	
	//User
	@FindBy(xpath="//div[text()='USERS']")
	private WebElement createuser;
	public WebElement getuser()
	{
		return createuser;
	}
	
	//Add User
	@FindBy(xpath="//div[text()='Add User']")
	private WebElement adduser;
	public WebElement getAddUser()
	{
		return adduser;
	}
	private WebElement userDataLightBox_firstNameField;
	public WebElement getfirstname()
	{
		return userDataLightBox_firstNameField;
	}
	private WebElement userDataLightBox_lastNameField;
	public WebElement getlastname()
	{
		return userDataLightBox_lastNameField;
	}
	private WebElement userDataLightBox_emailField;
	public WebElement getemail()
	{
		return userDataLightBox_emailField;
	}
	private WebElement userDataLightBox_usernameField;
	public WebElement getusername()
	{
		return userDataLightBox_usernameField;
	}
	private WebElement userDataLightBox_passwordField;
	public WebElement getpassword()
	{
		return userDataLightBox_passwordField;
	}
	private WebElement userDataLightBox_passwordCopyField;
	public WebElement getcopypasswors()
	{
		return userDataLightBox_passwordCopyField;
	}
	@FindBy(xpath="//*[@id=\'userDataLightBox_commitBtn\']/div/span")
	private WebElement create;
	public WebElement getcreate()
	{
		return create;
	}
	//delete user 
	@FindBy(xpath="//*[@id=\"userListTableContainer\"]/table/tbody/tr[2]/td[1]/table")
	private WebElement clickuser;
	public WebElement clickOnuser()
	{
		return clickuser;
	}
	private WebElement userDataLightBox_deleteBtn;
	public WebElement getdeleteuser1()
	{
		return userDataLightBox_deleteBtn;
	}
	//Rocket
	@FindBy(xpath="//*[@id=\'welcomeScreenBoxId\']/div[3]/div/span[1]")
	private WebElement Rock;
	public WebElement getRocket()
	{
		return Rock;
	}
	//click on created user
	@FindBy(xpath="//*[@id=\'userListTableContainer\']/table/tbody/tr[1]/td[1]")
	private WebElement clickon1;
	public WebElement clickoncreateduser1()
	{
		return clickon1;
	}
	@FindBy(xpath="//*[@id=\'userListTableContainer\']/table/tbody/tr[2]/td[1]")
	private WebElement clickon2;
	public WebElement clickoncreateduser2()
	{
		return clickon2;
	}
	@FindBy(xpath="//*[@id=\'userListTableContainer\']/table/tbody/tr[3]/td[1]")
	private WebElement clickon3;
	public WebElement clickoncreateduser3()
	{
		return clickon3;
	}
	@FindBy(xpath="//*[@id=\'userDataLightBox_commitBtn\']/div/span")
	private WebElement savechanges;
	public WebElement clickonsavechangesmodifypassword()
	{
		return savechanges;
	}
	//click on delete user
	@FindBy(xpath="//*[@id=\'userDataLightBox_deleteBtn\']")
	private WebElement deletebutton;
	public WebElement clickondeleteuser()
	{
		return deletebutton;
	}
}
