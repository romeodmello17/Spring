package com.springcore.lifecycle;

public class Monitor {
	private String display;

	public String getDisplay() {
		return display;
	}

	public void setDisplay(String display) {
		System.out.println("Hi I Am Setter Method");
		this.display = display;
	}

	public Monitor() {
	}

	@Override
	public String toString() {
		return "Monitor [display=" + display + "]";
	}
	
	public void init() {
		System.out.println("Initializing.....");
	}
	public void destroy() {
		System.out.println("Destroying......");
	}
	
}
