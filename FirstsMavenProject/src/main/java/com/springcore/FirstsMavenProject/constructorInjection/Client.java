package com.springcore.FirstsMavenProject.constructorInjection;

public class Client {
	private String cname;
	private long contact;

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public long getContact() {
		return contact;
	}

	public void setContact(long contact) {
		this.contact = contact;
	}

	public Client(String cname, long contact) {
		this.cname = cname;
		this.contact = contact;
	}

	public Client() {
	}

	@Override
	public String toString() {
		return "Client [cname=" + cname + ", contact=" + contact + "]";
	}

}
