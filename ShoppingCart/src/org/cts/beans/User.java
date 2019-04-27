package org.cts.beans;

public class User {
	private int id;
	private String uname;
	private String pwd;
	private String utype;
	public User()
	{
		
	}
	public User(int id, String uname, String pwd, String utype) {
		super();
		this.id = id;
		this.uname = uname;
		this.pwd = pwd;
		this.utype = utype;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getUtype() {
		return utype;
	}
	public void setUtype(String utype) {
		this.utype = utype;
	}
	
}
