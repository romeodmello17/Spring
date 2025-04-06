package com.springcore.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Television implements InitializingBean,DisposableBean{
	private String display;

	public String getDisplay() {
		return display;
	}

	public void setDisplay(String display) {
		this.display = display;
	}

	public Television() {
	}

	@Override
	public String toString() {
		return "Television [display=" + display + "]";
	}

	public void afterPropertiesSet() throws Exception {
		System.out.println("Initializing : Turning The TV On....");
	}

	public void destroy() throws Exception {
		System.out.println("Destroying : Turning The TV Off....");
	}
	
	
}
