package com.SaiJava.HibernateHql;

public class Student {
	private int sid;
	private String sname;
	private String smarks;
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", smarks=" + smarks + "]";
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getSmarks() {
		return smarks;
	}
	
	public void setSmarks(int nextInt) {
		// TODO Auto-generated method stub
		
	} 

}
