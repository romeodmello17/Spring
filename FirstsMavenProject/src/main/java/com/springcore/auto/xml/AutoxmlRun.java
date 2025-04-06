package com.springcore.auto.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutoxmlRun {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("autoxml.xml");
		Emp emp1 = context.getBean("emp1",Emp.class);
		System.out.println(emp1);
	}
}
