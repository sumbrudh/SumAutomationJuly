package com.sgtesting.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rev2 {
public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		//absoluteXpath();
		//relativeXPathUsingTagNameAlone();
		//relativeXPathUsingTagNameAndIndex();
		//relativeXPathUsingTagNameWithAttributeNameValue();
		//relativeXPathUsingTagNameWithMultipleAttributeNameValues();
		relativeXPathUsingAttributeNameValueCombination();
	 }
	public static void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver", "D:\\ExampleAutomation\\Automation\\Web-Automation\\Library\\drivers\\chromedriver.exe");
		    oBrowser=new ChromeDriver();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void navigate()
	{
		try
		{
			oBrowser.get("D:/sample.html");
		     Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
   public static void absoluteXpath()
	{
		try
		{
			oBrowser.findElement(By.xpath("html/body/div/form/input")).sendKeys("Demouser1");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
   static void relativeXPathUsingTagNameAlone()
   {
	   try
	   {
		   oBrowser.findElement(By.xpath("//input")).sendKeys("Demouser1");
	   }catch(Exception e)
		{
			e.printStackTrace();
		}
	}
   static void relativeXPathUsingTagNameAndIndex()
   {
	   try
	   {
		   oBrowser.findElement(By.xpath("//input[2]")).sendKeys("Demouser2");
	   }catch(Exception e)
		{
			e.printStackTrace();
		}
   }
   static void relativeXPathUsingTagNameWithAttributeNameValue()
	{
		try
		{
			oBrowser.findElement(By.xpath("//input[@value='Submit']")).click();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
   static void relativeXPathUsingTagNameWithMultipleAttributeNameValues()
	{
		try
		{
			oBrowser.findElement(By.xpath("//input[@value='Submit'][@class='submit1btn1']")).click();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
   static void relativeXPathUsingAttributeNameValueCombination()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@value='Submit']")).click();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
   
	
	
	

}
