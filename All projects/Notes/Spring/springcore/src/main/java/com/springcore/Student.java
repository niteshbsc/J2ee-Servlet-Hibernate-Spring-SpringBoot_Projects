package com.springcore;

public class Student {
	private int sid;
	private String sname;
	private String sAddress;
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		System.out.println("id yeah");
		this.sid = sid;
	}
	public String getSname() {
		
		return sname;
	}
	public void setSname(String sname) {
		System.out.println("name yeah");
		this.sname = sname;
	}
	public String getsAddress() {
		return sAddress;
	}
	public void setsAddress(String sAddress) {
		this.sAddress = sAddress;
	}
	public Student(int sid, String sname, String sAddress) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.sAddress = sAddress;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", sAddress=" + sAddress + "]";
	}
	
	
}
