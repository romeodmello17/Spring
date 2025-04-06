package com.springcore.FirstsMavenProject.constructorInjection;

import java.util.List;

public class Emp {
	private int eid;
	private String ename;
	private List<Client> clients;

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}
	
	public Emp(int eid, String ename , List<Client> clients) {
		this.eid = eid;
		this.ename = ename;
		this.clients = clients;
	}

	public Emp() {
	}


	public List<Client> getClients() {
		return clients;
	}

	public void setClients(List<Client> clients) {
		this.clients = clients;
	}

	@Override
	public String toString() {
		return "Emp [eid=" + eid + ", ename=" + ename + ", clients=" + clients + "]";
	}
}
