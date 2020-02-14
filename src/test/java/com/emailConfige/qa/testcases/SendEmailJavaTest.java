package com.emailConfige.qa.testcases;

import org.apache.commons.mail.EmailException;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.emailConfige.qa.emailSend.SendEmailJava;

public class SendEmailJavaTest {

	@BeforeMethod
	public void setup() {
			System.out.println("======Starting the Test=====");
			
	}
	
	@Test
	public void testcase1() {
		int a= 90;
		int b=100;
		
		Assert.assertEquals(a, b);
		
		System.out.println("===========Test Done======================");
				
	}
	
	
	@AfterMethod
	public void tearDown(ITestResult result) throws EmailException {
			
		//if and only the TestCase status is failed then email will send automatically.
		if(result.getStatus() == ITestResult.FAILURE) {
			
			SendEmailJava.sendEmail();
			
			System.out.println("=============Test failed and Email send========");
		}
			
	}
	
}
