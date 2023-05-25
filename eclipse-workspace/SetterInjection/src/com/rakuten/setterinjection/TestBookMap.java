package com.rakuten.setterinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class TestBookMap {
	public static void main (String[] args) {
		 ApplicationContext context = new ClassPathXmlApplicationContext("DetailsContext.xml");
		 BookMap lib = (BookMap) context.getBean("mapbookbean");
		 lib.displaybook();
}
}
