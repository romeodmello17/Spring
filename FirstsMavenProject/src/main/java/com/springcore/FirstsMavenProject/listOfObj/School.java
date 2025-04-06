package com.springcore.FirstsMavenProject.listOfObj;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class School {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("listofobj.xml");
		Student student =  (Student) context.getBean("stud");
		System.out.println(student);
	}
}
