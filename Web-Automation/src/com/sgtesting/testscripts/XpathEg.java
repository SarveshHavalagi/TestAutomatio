package com.sgtesting.testscripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class XpathEg {
	public static WebDriver oBrowser=null;

	public static void main(String[] args) {
		
		launchBrowser();
		navigate();
	//	absoluteXpath();
	//	TagnameAlone();
	//	TagnameWithIndex(); //on password
	//	clickonSubmitUsingIndex();//on submit button
	//	tagNamewithAttributNameAndValue(); //click on submit
	//	withoutusingTag(); //submit
	//	 OnlyattributeValue();
	//	 MultipleAttribute();
	//	MultipleAttributeAnd();
	//	 MultipleAttributeOR();
	//	 PartialImplementation();  //submit
	//	 TagwithAttribute();
	//	displaylinks();
	//	particularLink();
	//	PartialTextEndsWith();
	//	stale();
	//	 TextContent();
	//	withoutTagName();
		PartialImplementationTextContent();
		

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
			oBrowser.get("file:\\C:/Users/Lenovo/Downloads/XPATH_26th_OCT_2021/Sample.html");//html link given by sir through page
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void absoluteXpath()
	{
		try
		{
			oBrowser.findElement(By.xpath("html/body/div/form/input")).sendKeys("DemoUser1");
		
		}catch(Exception e)
		{
		e.printStackTrace();
		}
	}
	/**
	 * Case1:
	 * Syntax:
	 * //<tagName>
	 */
	static void TagnameAlone()
	{
		oBrowser.findElement(By.xpath("//input")).sendKeys("DemoUser12");
	}
	/**
	 * Case2:
	 * Syntax:
	 * //<tagName>[Index]
	 */
	static void TagnameWithIndex()
	{
		oBrowser.findElement(By.xpath("//input[2]")).sendKeys("DemoUser12");
	}
	static void clickonSubmitUsingIndex()
	{
		oBrowser.findElement(By.xpath("//input[3]")).click();
	}
	/**
	 * Case3:
	 * Syntax:
	 * //<tagName>[@attributname='attributevalue']
	 * 
	 */
	static void tagNamewithAttributNameAndValue()
	{
		oBrowser.findElement(By.xpath("//input[@value='Submit']")).click();// o/p:click on submit button
	}
	/**
	 * Case4:
	 * Syntax:
	 * //*[@attributename='attributevalue']
	 */
	static void withoutusingTag()
	{
		oBrowser.findElement(By.xpath("//*[@name='submit1btn1']")).click();
	}
	/**
	 * Case5:
	 * Syntax:
	 * //*[@*='attributevalue']
	 */
	static void OnlyattributeValue()
	{
		oBrowser.findElement(By.xpath("//*[@*='submit1btn1']")).click();
	}
	/**
	 * Case6:
	 * Syntex:
	 * //<tagName>[@attributeName='attributeValue'][@attributeName='attributeValue']
	 */
	static void MultipleAttribute()
	{
		oBrowser.findElement(By.xpath("//input[@type='button'][@value='Submit']")).click();
	}
	/**
	 * Case7:
	 * Syntex:
	 * //<tagName>[@attributeName='attributeValue' and @attributeName='attributeValue']
	 */
	static void MultipleAttributeAnd()
	{
		oBrowser.findElement(By.xpath("//input[@type='button' and @value='Submit']")).click();
	}
	/**
	 * Case8:
	 * Syntex:
	 * //<tagName>[@attributeName='attributeValue' or @attributeName='attributeValue']
	 */
	static void MultipleAttributeOR()
	{
		oBrowser.findElement(By.xpath("//input[@type='button' or @value='Submit']")).click();
	}
	/**
	 * Case9:
	 * Syntax:
	 * //<tagName>[starts_with(@attributename,'partial attribute value')]
	 * //<tagName>[end_with(@attributename,'partial attribute value')]
	 * //<tagName>[contains(@attributename,'partial attribute value')]
	 */
	static void PartialImplementation()
	{
	//	oBrowser.findElement(By.xpath("//input[starts-with(@id,'btn1')]")).click();
		oBrowser.findElement(By.xpath("//input[contains(@id,'submit')]")).click();
	}
	/**
	 * Case10:
	 * Syntax:
	 * //<tagname>[@attributename]
	 */
	static void TagwithAttribute()
	{
		List<WebElement> olinks=oBrowser.findElements(By.xpath("//a[@href]"));//inspect any of five links
		System.out.println("Number of Link:"+olinks.size());
	}
	static void displaylinks()
	{
		List<WebElement> olinks=oBrowser.findElements(By.xpath("//a[@href]"));
		for(int i=0;i<olinks.size();i++)
		{
			WebElement link=olinks.get(i);
			String content=link.getText();
			System.out.println(content);
		}
	}
	static void particularLink()
	{
		List<WebElement> olinks=oBrowser.findElements(By.xpath("//a[@href]"));
		olinks.get(2).click();
	}
	static void PartialTextEndsWith()
	{
		List<WebElement> olinks=oBrowser.findElements(By.xpath("//a[@href]"));
		for(int i=0;i<olinks.size();i++)
		{
			WebElement link=olinks.get(i);
			String content=link.getText();
			if(content.endsWith("Tool"))     //Maven Build Tool in links
			{
				link.click();
				break;
			}
		}
		
	}
	static void stale()
	{
		List<WebElement> olinks=oBrowser.findElements(By.xpath("//a[@href]"));
		for(int i=0;i<olinks.size();i++)
		{
			WebElement link=olinks.get(i);
			String content=link.getText();
			if(content.startsWith("Selenium"))     
			{
				link.click();
				break;
			}
		}
	}
	/**
	 * Case11:
	 * Syntex:
	 *  //<tagName>[text()='text content']
	 */
	static void TextContent()
	{
		oBrowser.findElement(By.xpath("//a[text()='Eclipse']")).click();
	}
	/**
	 * Case12:
	 * Syntex:
	 * //*[text()='text content']
	 */
	static void withoutTagName()
	{
		oBrowser.findElement(By.xpath("//*[text()='Eclipse']")).click();
	}
	/**
	 * Case13:
	 * Syntax:
	 * //<tagName>[starts-with(text(),'partial attribute value')]
	 * //<tagName>[end-with(text(),'partial attribute value')]
	 * //<tagName>[contains(text(),'partial attribute value')]
	 */
	static void PartialImplementationTextContent()
	{
	//	oBrowser.findElement(By.xpath("//a[starts-with(text(),'POI')]")).click();
		oBrowser.findElement(By.xpath("//a[contains(text(),'Build')]")).click();
	}
	
}


