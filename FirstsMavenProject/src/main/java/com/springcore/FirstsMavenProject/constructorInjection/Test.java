package com.springcore.FirstsMavenProject.constructorInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("constructorIn.xml");
		Emp emp = (Emp)context.getBean("emp");
		System.out.println(emp);
		
	}
}
