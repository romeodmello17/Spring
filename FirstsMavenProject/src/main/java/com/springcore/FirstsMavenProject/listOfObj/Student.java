package com.springcore.FirstsMavenProject.listOfObj;

import java.util.List;

public class Student {
	private String studName;
	private List<Subject> subjects;

	public String getStudName() {
		return studName;
	}

	public void setStudName(String studName) {
		this.studName = studName;
	}

	public List<Subject> getSubjects() {
		return subjects;
	}

	public void setSubjects(List<Subject> subjects) {
		this.subjects = subjects;
	}

	public Student() {
	}

	@Override
	public String toString() {
		return "Student [studName=" + studName + ", subjects=" + subjects + "]";
	}

}
