package com.rakuten.setterinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCompany {
	public static void main (String[] args) {
		 ApplicationContext context = new ClassPathXmlApplicationContext("CompanyContext.xml");
		 CompanyMap com = (CompanyMap) context.getBean("mapbookbean");
		 com.display();
	}
}
