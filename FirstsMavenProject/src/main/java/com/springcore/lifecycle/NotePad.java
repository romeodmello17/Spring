package com.springcore.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class NotePad {
	private String display;

	public String getDisplay() {
		return display;
	}

	public void setDisplay(String display) {
		this.display = display;
	}

	public NotePad() {
	}

	@Override
	public String toString() {
		return "NotePad [display=" + display + "]";
	}
	
	@PostConstruct
	public void start() {
		System.out.println("NotePad is Starting....");
	}
	@PreDestroy
	public void end() {
		System.out.println("NotePad is Shutting....");
	}
}
