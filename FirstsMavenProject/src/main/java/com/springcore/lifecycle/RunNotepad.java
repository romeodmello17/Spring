package com.springcore.lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RunNotepad {

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("notepad.xml");
		NotePad notePad = (NotePad) context.getBean("n1");
		System.out.println(notePad);
		context.registerShutdownHook();
	}

}
