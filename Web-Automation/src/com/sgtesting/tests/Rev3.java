package com.sgtesting.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Rev3 {
	

	public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
	//enterSalaryForPersonSachinTendulkar();
	   //selectCityNameForSachinTendulkar();
	  // makeTheStatusAsActiveForIndianFreedomFighter();
	   fromRahulDravidFor2ndSecondEnterSalary();
		
		
		
}
	static void launchBrowser()
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
	
	static void navigate()
	{
		try
		{
			oBrowser.get("D:/HTML/WebTableHTML.html");
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void enterSalaryForPersonSachinTendulkar()
	{
		oBrowser.findElement(By.xpath("//td[text()='sachin tendulkar']/following-sibling::td/following-sibling::td/following-sibling::td/following-sibling::td/input")).sendKeys("35000");
	}
	static void selectCityNameForSachinTendulkar()
	{
		WebElement oEle=oBrowser.findElement(By.xpath("//td[text()='Sachin Tendulkar']/following-sibling::td/following-sibling::td/select"));
		Select oSelect=new Select(oEle);
		oSelect.selectByIndex(3);
		oSelect.selectByValue("bangalore");
		
	}
	static void makeTheStatusAsActiveForIndianFreedomFighter()
	{
		oBrowser.findElement(By.xpath("//td[text()='Indian Freedom Fighter']/preceding-sibling::td/preceding-sibling::td/input")).click();
	}
	static void fromRahulDravidFor2ndSecondEnterSalary()
	{
		oBrowser.findElement(By.xpath("//td[text()='Rahul Dravid']/following::tr[1]/following::tr[1]/td[6]/input")).sendKeys("10000");
	}
}