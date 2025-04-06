package com.springcore.FirstsMavenProject.Collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Run {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("collections.xml");
		Emp emp = (Emp) context.getBean("emp1");
		System.out.println(emp);
		System.out.println("");
		System.out.println("Employee Id: "+emp.getEmpId());
		System.out.println("Employee Phones: "+emp.getPhones());
		System.out.println("Employee Addresses: "+emp.getAddresses());
		System.out.println("Employee Courses: "+emp.getCourses());
	}
}
