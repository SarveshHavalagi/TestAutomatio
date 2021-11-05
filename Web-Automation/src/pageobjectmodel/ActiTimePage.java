package pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActiTimePage {
	public ActiTimePage(WebDriver oBrowser)    //constructor
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
	@FindBy(xpath="//div[text()='USERS']")
	private WebElement createuser;
	public WebElement getuser()
	{
		return createuser;
	}
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
	@FindBy(xpath="//*[@id=\"topnav\"]/tbody/tr/td[3]/a/div[2]")
	private WebElement customer;
	public WebElement Tasks()
	{
		return customer;
	}
	@FindBy(xpath="//*[@id=\'cpTreeBlock\']/div[2]/div[1]/div[2]/div/div[2]")
	private WebElement addcusto;
	public WebElement addcustomer()
	{
		return addcusto;
	}
	@FindBy(xpath="/html/body/div[14]/div[1]")  
	private WebElement newcusto;
	public WebElement newcustomer()
	{
		return newcusto;
	}
	private WebElement customerLightBox_nameField;
	public WebElement getcustomername()
	{
		return customerLightBox_nameField;
	}
	@FindBy(xpath="//*[@id=\"customerLightBox_commitBtn\"]/div/span")
	private WebElement clickcustomer;
	public WebElement clickoncustomer()
	{
		return clickcustomer;
	}
	@FindBy(xpath="//*[@id=\"cpTreeBlock\"]/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]") 
	private WebElement delcustomer1;
	public WebElement flowercustomer()
	{
		return delcustomer1;
	}
	@FindBy(xpath="//*[@id=\'taskListBlock\']/div[2]/div[1]/div[4]/div/div/div[2]")
	private WebElement delcustomer2;
	public WebElement ActionDeletcustomer()
	{
		return delcustomer2;
	}
	@FindBy(xpath="//*[@id=\"taskListBlock\"]/div[2]/div[4]/div/div[3]/div")////*[@id="taskListBlock"]/div[2]/div[4]/div/div[3]/div
	private WebElement delcustomer3;
	public WebElement clickdelete()
	{
		return delcustomer3;
	}
	private WebElement customerPanel_deleteConfirm_submitTitle;
	public WebElement deleteperminently()
	{
		return customerPanel_deleteConfirm_submitTitle;
	}
	//modify custo
	
	@FindBy(xpath="//*[@id=\'cpTreeBlock\']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")
	private WebElement modifycustomer1;
	public WebElement flowermodifycustomer()
	{
		return modifycustomer1;
	}
	@FindBy(xpath="//*[@id=\'taskListBlock\']/div[2]/div[1]/div[3]/div/div[1]")
	private WebElement modifycustomer2;
	public WebElement clickcustomername()
	{
		return modifycustomer2;
	}
	@FindBy(xpath="//*[@id=\'taskListBlock\']/div[2]/div[1]/div[3]/div/div[2]/input")
	private WebElement modifycustomer3;
	public WebElement selectandclickcustoname()
	{
		return modifycustomer3;
	}
	@FindBy(xpath="//*[@id=\"taskListBlock\"]/div[2]/div[1]/div[3]/div/div[2]/input")
	private WebElement modifycustomer4;
	public WebElement newcustomername()
	{
		return modifycustomer4;
	}
	//project create
	@FindBy(xpath="/html/body/div[14]/div[2]")
	private WebElement project1;
	public WebElement clicknewproject()
	{
		return project1;
	}
	private WebElement projectPopup_projectNameField;
	public WebElement giveprojectname()
	{
		return projectPopup_projectNameField;
	}
	@FindBy(xpath="//*[@id=\'projectPopup_commitBtn\']/div/span")
	private WebElement project3;
	public WebElement clickcreateproject()
	{
		return project3;
	}
	//project delete
	@FindBy(xpath="//*[@id=\'cpTreeBlock\']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[3]/div[3]")
	private WebElement project4;
	public WebElement flowerproject()
	{
		return project4;
	}@FindBy(xpath="//*[@id=\'taskListBlock\']/div[4]/div[1]/div[2]/div[3]/div/div") 
	private WebElement project5;
	public WebElement projectAction()
	{
		return project5;
	}
	@FindBy(xpath="//*[@id=\'taskListBlock\']/div[4]/div[4]/div/div[3]/div")
	private WebElement project6;
	public WebElement delectproject()
	{
		return project6;
	}
	private WebElement projectPanel_deleteConfirm_submitTitle;
	public WebElement deleteprojectperminently()
	{
		return projectPanel_deleteConfirm_submitTitle;
	}
	//modify project
	@FindBy(xpath="//*[@id=\'cpTreeBlock\']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[3]/div[3]")
	private WebElement modifyproject1;
	public WebElement flowermodifyproject1()
	{
		return modifyproject1;
	}
	@FindBy(xpath="//*[@id=\'taskListBlock\']/div[4]/div[2]/div[1]/div[1]/div[2]/div[2]/div/div[1]/textarea")
	private WebElement modifyproject2;
	public WebElement descrbeproject()
	{
		return modifyproject2;
	}
	//create task
	@FindBy(xpath="//*[@id=\'taskListBlock\']/div[1]/div[1]/div[3]/div/div[2]")
	private WebElement createtask1;
	public WebElement addnewtask()
	{
		return createtask1;
	}
	@FindBy(xpath="/html/body/div[13]/div[1]")
	private WebElement createtask2;
	public WebElement createnewtask()
	{
		return createtask2;
	}
	@FindBy(xpath="//*[@id=\'createTasksPopup_createTasksTableContainer\']/table/tbody/tr[1]/td[1]/input")
	private WebElement createtask3;
	public WebElement task1()
	{
		return createtask3;
	}
	@FindBy(xpath="//*[@id=\'createTasksPopup_commitBtn\']/div/span")
	private WebElement createtask4;
	public WebElement clickcreatetask()
	{
		return createtask4;
	}
	//deleteTask
	
	
	@FindBy(xpath="//div[@class='taskRowCellWrapper']")
	private WebElement oDelete;
	public WebElement getDelete()
	{
		return oDelete;
	}
	@FindBy(xpath="//*[@id=\'taskListBlock\']/div[3]/div[1]/div[2]/div[3]/div/div/div[2]")
	private WebElement oAction;
	public WebElement getAction()
	{
		return oAction;
	}
	@FindBy(xpath="//*[@id=\'taskListBlock\']/div[3]/div[4]/div/div[3]/div")
	private WebElement oDelete1;
	public WebElement getDelete1()
	{
		return oDelete1;
	}
	
	private WebElement taskPanel_deleteConfirm_submitTitle;
	public WebElement getdeletepermanantly()
	{
		return  taskPanel_deleteConfirm_submitTitle;
	}
}
