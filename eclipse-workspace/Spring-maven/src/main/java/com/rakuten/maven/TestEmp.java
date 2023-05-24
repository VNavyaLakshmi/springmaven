package com.rakuten.maven;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class TestEmp {
	public static void main (String[] args) {
		 ApplicationContext context = new ClassPathXmlApplicationContext("EmployeeContext.xml");
		 Employee com = (Employee) context.getBean("empbean");
		 com.displayname();
	}
}
