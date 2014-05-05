package com.netapp.ocum;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationContextLoadingExample {
	
	public static void main (String []a) {
		
		ApplicationContext appContext = new ClassPathXmlApplicationContext("spring/applicationContext.xml");
	}

}
