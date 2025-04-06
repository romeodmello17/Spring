package com.springcore.lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Run {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("monitor.xml");
		Monitor m1 = (Monitor) context.getBean("m1");
		System.out.println(m1);
		//registering Shutdown Hook : method in AbstractApplicationContext abstract class
		context.registerShutdownHook();
	}
}
