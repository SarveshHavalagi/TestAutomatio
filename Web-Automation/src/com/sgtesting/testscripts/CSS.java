package com.sgtesting.testscripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSS {
	public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchbrowser();
		navigate();
	//	absolutecss();
	//	tagnamealone();
	//	tagnamewithIDattributename();
	//	 withIDattributename();
	//	 tagnamewithClassattributevalue();
	//	 tagnamewithattributenameandattributevalue();
	//	tagnamewithuMultipleattributenameandattributevalue();
	//	attributenameandvalueclick();                      //inspect submit button
	//	relativeCSSUsingParentElement();
	//	relativeCSSUsingnthChildConcept();
	//	relativeCSSUsingnthSiblingConcept();
	//	relativeCSSUsingTagNameWithAttributeNameAlone();
	//	 relativeCSSUsingTagNameWithAttributeNameAlone2();
	//	 relativeCSSUsingTagNameWithAttributeNameAlone3();
		relativeCSSUsingPartialMtchingOfAttributeValue();
	}
	static void launchbrowser()
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
			oBrowser.get("file:E:\\Automation notes\\CSSSelector_02_NOV_2021/Sample.html");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void absolutecss()
	{
		try
		{
			oBrowser.findElement(By.cssSelector("html body div form input")).sendKeys("DemoUser1");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	/**
	 * case1
	 * Syntax
	 * <tagname>
	 */
	static void tagnamealone()
	{
		try
		{
			oBrowser.findElement(By.cssSelector("input")).sendKeys("DemoUser1");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	/**
	 * Case2
	 * syntax
	 * <tagname>#<id attribute value>
	 */
	static void tagnamewithIDattributename()
	{
		try
		{
			oBrowser.findElement(By.cssSelector("input#pwd1pass1word1")).sendKeys("Pass1");
			
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	/**
	 * Case3
	 * syntax
	 * #<id attribute value>
	 */
	static void withIDattributename()
	{
		try
		{
			oBrowser.findElement(By.cssSelector("#pwd1pass1word1")).sendKeys("Pass1");
			
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	/**
	 * case4
	 * syatax
	 * <tagname>.<class attribute value>
	 */
	static void tagnamewithClassattributevalue()
	{
		try
		{
			oBrowser.findElement(By.cssSelector("input.pass1word1")).sendKeys("Pass1");
			
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	/**
	 * case5
	 * syatax
	 * .<class attribute value>
	 */
	static void withClassattributevalue()
	{
		try
		{
			oBrowser.findElement(By.cssSelector(".pass1word1")).sendKeys("Pass1");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	/**
	 * case6
	 * Syntax
	 * <tagname>[attributrname='attribute value']
	 */
	static void tagnamewithattributenameandattributevalue()
	{
		try
		{
			oBrowser.findElement(By.cssSelector("input[name='pass1word1'")).sendKeys("pass1");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	/**
	 * case7
	 * Syntax
	 * <tagname>[attributrname='attribute value'][attributrname='attribute value']
	 */
	static void tagnamewithuMultipleattributenameandattributevalue()
	{
		try
		{
			oBrowser.findElement(By.cssSelector("input[name='pass1word1'][class='pass1word1']")).sendKeys("pass1");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	/**
	 * case8
	 * syntax
	 * *[attribute name='attribute value']
	 */
	static void attributenameandvalueclick()  //inspect submit button
	{
		try
		{
			oBrowser.findElement(By.cssSelector("*[value='Submit']")).click();
	    }catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	/**
	 * Case 9: Identify based on parent Element reference
	 * Syntax:
	 * <parent Element> > <child Element>
	 */
	static void relativeCSSUsingParentElement()
	{
		oBrowser.findElement(By.cssSelector("form#frm2 > input")).click();
	}
	/**
	 * Case 10: Identify based on nth Child reference
	 * Syntax:
	 * nth-child(element number)
	 */
	static void relativeCSSUsingnthChildConcept()
	{
		oBrowser.findElement(By.cssSelector("form#frm3 > :nth-child(5)")).sendKeys("DemoUser1");
	}
	/**
	 * Case 11: Identify based on sibling concept
	 * Syntax:
	 * <tagName> + <tagName> + N
	 */
	static void relativeCSSUsingnthSiblingConcept()
	{
		oBrowser.findElement(By.cssSelector("form#frm3 > input + input + input")).sendKeys("DemoUser1");
	}
	/**
	 * Case 12: Identify based on tagname with attribute name
	 * Syntax:
	 * <tagName>[attributename]
	 */
	static void relativeCSSUsingTagNameWithAttributeNameAlone()
	{
		List<WebElement> olinks=oBrowser.findElements(By.cssSelector("a[href]"));
		System.out.println("# of Links :"+olinks.size());
	}
	static void relativeCSSUsingTagNameWithAttributeNameAlone2()
	{
		List<WebElement> olinks=oBrowser.findElements(By.cssSelector("a[href]"));
		for(int i=0;i<olinks.size();i++)
		{
			WebElement link=olinks.get(i);
			String linktext=link.getText();
			if(linktext.endsWith("Tool"))
			{
				link.click();
				break;
			}
		}
		oBrowser.navigate().back();
	}
	//org.openqa.selenium.StaleElementReferenceException:
	static void relativeCSSUsingTagNameWithAttributeNameAlone3()
	{
		List<WebElement> olinks=oBrowser.findElements(By.cssSelector("a[href]"));
		for(int i=0;i<olinks.size();i++)
		{
			WebElement link=olinks.get(i);
			String linktext=link.getText();
			if(linktext.endsWith("Tool"))
			{
				link.click();
			}
		}
		
	}
	/**
	 * Case 13: Partial Matching of Attribute Value
	 * Syntax:
	 * ^=  starts-with
	 * $=  ends-with
	 * *=  contains
	 * <tagName>[attribute name ^= 'partial content']
	 * <tagName>[attribute name $= 'partial content']
	 * <tagName>[attribute name *= 'partial content']
	 */
     static void relativeCSSUsingPartialMtchingOfAttributeValue()
     {
    //	 oBrowser.findElement(By.cssSelector("input[id *= 'submit1']")).click();
    	 oBrowser.findElement(By.cssSelector("input[id ^= 'btn1']")).click();
     }
	
	
	
	

}
