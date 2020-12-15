package com.model;

//This class is used for user login credentials
public class Login {

	private String email;
	private String pass;
	public Login(String email, String pass) {
		super();
		this.email = email;
		this.pass = pass;
	}
	public Login() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
}
