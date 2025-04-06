package com.springcore.FirstsMavenProject.Collections;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Emp {
	private int empId;
	private List<String> phones;
	private Set<String> addresses;
	private Map<String, String> courses;

	@Override
	public String toString() {
		return "Emp [empId=" + empId + ", phones=" + phones + ", addresses=" + addresses + ", courses=" + courses + "]";
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public List<String> getPhones() {
		return phones;
	}

	public void setPhones(List<String> phones) {
		this.phones = phones;
	}

	public Set<String> getAddresses() {
		return addresses;
	}

	public void setAddresses(Set<String> addresses) {
		this.addresses = addresses;
	}

	public Map<String, String> getCourses() {
		return courses;
	}

	public void setCourses(Map<String, String> courses) {
		this.courses = courses;
	}

	public Emp(int empId, List<String> phones, Set<String> addresses, Map<String, String> courses) {
		this.empId = empId;
		this.phones = phones;
		this.addresses = addresses;
		this.courses = courses;
	}

	public Emp() {
	}

}
