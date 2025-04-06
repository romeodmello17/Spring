package com.springcore.FirstsMavenProject.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext Context = new ClassPathXmlApplicationContext("ref.xml");
		A a = (A) Context.getBean("aref");
		System.out.println(a);
		System.out.println(a.getOb().getY());
	}

}
