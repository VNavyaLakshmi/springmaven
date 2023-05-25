package com.rakuten.setterinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAlpha {
	public static void main (String[] args) {
		 ApplicationContext context = new ClassPathXmlApplicationContext("Autowire.xml");
  Alpha a=context.getBean("alpha", Alpha.class);
		 a.displayDetails();
}

}
