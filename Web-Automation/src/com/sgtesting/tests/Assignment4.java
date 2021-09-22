package com.sgtesting.tests;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment4 {
	public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		//launchBrowser-->navigate-->login-->createCustomer-->modifyCustomer-->deleteCustomer-->logout -->closeApplication
		launch();
		navigate();
		login();
		minimize();
		createCustomer();
		modifyCustomer();
		
		deleteCustmer();
		 //logOut();
		 //closeApplication();

	}
	static void launch()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver","D:\\\\\\\\ExampleAutomation\\\\\\\\Automation\\\\\\\\Web-Automation\\\\\\\\Library\\\\\\\\drivers\\\\\\\\chromedriver.exe");
			oBrowser=new ChromeDriver();
		}catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	static void navigate()
	  {
		  try
		  {
			  oBrowser.get("http://localhost:82/login.do");
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
			  oBrowser.findElement(By.xpath("//*[@id=\"loginButton\"]/div")).click();
			  
		  }catch(Exception e)
		  {
			  e.printStackTrace();
		  }
	  }
	  static void minimize()
	  {
		  try
		  {
			 
			  oBrowser.findElement(By.xpath("//*[@id=\"gettingStartedShortcutsPanelId\"]/div[1]")).click();
			  
		  }catch(Exception e)
		  {
			  e.printStackTrace();
		  }
	  }
	  static void createCustomer()
		{
			try
			{
				oBrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr/td[3]/a/div[2]")).click();
				Thread.sleep(4000);
				oBrowser.findElement(By.xpath("//*[@id=\'cpTreeBlock\']/div[2]/div[1]/div[2]/div/div[3]")).click();
				Thread.sleep(4000);
				oBrowser.findElement(By.xpath("/html/body/div[14]/div[1]")).click();
				Thread.sleep(4000);
				oBrowser.findElement(By.id("customerLightBox_nameField")).sendKeys("amazon");
				oBrowser.findElement(By.id("customerLightBox_descriptionField")).sendKeys("amazon");
				oBrowser.findElement(By.xpath("//*[@id='customerLightBox_commitBtn']/div/span")).click();
				Thread.sleep(4000);
			}catch(Exception e)
			{
				e.printStackTrace();
						
				
			}
		}
	  
	  static void modifyCustomer()   
		{
			try {
				oBrowser.findElement(By.xpath("//*[@id='cpTreeBlock']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")).click();
				Thread.sleep(4000);
        		//oBrowser.findElement(By.xpath("//*[@id=\'taskListBlock\']/div[2]/div[1]/div[3]/div/div[1]")).clear();
				//oBrowser.findElement(By.xpath("//*[@id=\'taskListBlock\']/div[2]/div[1]/div[3]/div/div[1]")).sendKeys("Telefonica UK Ltd");
				oBrowser.findElement(By.xpath("//*[@id=\'taskListBlock\']/div[2]/div[2]/div[1]/div[3]/div[2]/div/div[1]/textarea")).clear();
				oBrowser.findElement(By.xpath("//*[@id=\'taskListBlock\']/div[2]/div[2]/div[1]/div[3]/div[2]/div/div[1]/textarea")).sendKeys("Telefonica UK Ltd");
				oBrowser.findElement(By.xpath("//*[@id='cpTreeBlock']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[1]/div[2]")).click();
				Thread.sleep(2000);
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	   static void deleteCustmer()
	  {
		  try
		  {
			  oBrowser.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr/td[3]/a")).click();
			  oBrowser.findElement(By.xpath("//*[@id=\"cpTreeBlock\"]/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")).click();
			  Thread.sleep(1000);
			  oBrowser.findElement(By.xpath("//*[@id=\"taskListBlock\"]/div[2]/div[1]/div[4]/div/div")).click();
			  Thread.sleep(1000);
			  oBrowser.findElement(By.xpath("//*[@id=\"taskListBlock\"]/div[2]/div[4]/div/div[3]/div")).click();
			  Thread.sleep(1000);
			  oBrowser.findElement(By.xpath("//*[@id=\"customerPanel_deleteConfirm_submitBtn\"]/div")).click();
			  
			  
		  }catch(Exception e)
		  {
			  e.printStackTrace();
		  }
		  
	  }
	  static void logOut()
	 	{
	 		try
	 		{
	 			oBrowser.findElement(By.id("logoutLink")).click();
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
