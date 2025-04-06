package com.springcore.auto.annotation;

import org.springframework.beans.factory.annotation.Autowired;

public class Emp {
	@Autowired
	private Address address;

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		System.out.println("i am a Setter");
		this.address = address;
	}

	public Emp(Address address) {
		System.out.println("i am a Constructor");
		this.address = address;
	}

	public Emp() {
	}

	@Override
	public String toString() {
		return "Emp [address=" + address + "]";
	}
	
}
