package com.sgtesting.testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ExecutionOrder {
	@BeforeClass
	public void beforeClassMethod()
	{
		System.out.println("It is @BeforeClass Annotation Method");
		
	}
	@Test
	public void method1()
	{
		System.out.println("It is testng testcase method1 !!!");
	}
	
	@Test
	public void method2()
	{
		System.out.println("It is testng testcase method2 !!!");
	}
	@AfterClass
	public void afterClassMethod()
	{
		System.out.println("It is @AfterClass Annotation Method");
	}

}
