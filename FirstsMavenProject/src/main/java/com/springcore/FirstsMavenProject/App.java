package com.springcore.FirstsMavenProject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		Object bean = context.getBean("student1");
		Student student2 = (Student) context.getBean("student2");
		Student student3 = (Student) context.getBean("student3");
		System.out.println(bean);
		System.out.println("Student2 Info : " + student2);
		System.out.println("Student3 Info : " + student3);
	}
}
