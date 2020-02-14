package com.emailConfige.qa.emailSend;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

public class SendEmailJava {
	
	public static void main(String[] args) throws EmailException {
		System.out.println("=============Test Start=============");
		
		sendEmail();

		System.out.println("=============Test End and Email Send Successfully=============");
	}

	public static void sendEmail() throws EmailException {
		
		Email email= new SimpleEmail();
		email.setHostName("smtp.gmail.com");//Set hostname by SMTP(Simple Mail Transfer Protocol) server
		email.setSmtpPort(465);//set smtp port number
		email.setAuthenticator(new DefaultAuthenticator("kbhagwat43@gmail.com", "KishorBhagwat7"));//set authenticator
		email.setSSL(true);
		
		email.setFrom("akashpatil8494@gmail.com");
		email.setSubject("Simple Text Mail");
		email.setMsg("This is mail from kishor Bhagwat about selenium..");
		email.addTo("sachinwankhade.it@gmail.com");
		email.addCc("akashpatil8494@gmail.com");
		email.send();
	}

}
