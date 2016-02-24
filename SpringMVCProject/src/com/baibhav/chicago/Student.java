package com.baibhav.chicago;

import java.util.ArrayList;

public class Student {
	private String username;
	private String address;
	private Long dateOfBirth;
	private int socialSecurity;
	private ArrayList<String> studentInfo;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Long getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Long dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public int getSocialSecurity() {
		return socialSecurity;
	}
	public void setSocialSecurity(int socialSecurity) {
		this.socialSecurity = socialSecurity;
	}
	public ArrayList<String> getStudentInfo() {
		return studentInfo;
	}
	public void setStudentInfo(ArrayList<String> studentInfo) {
		this.studentInfo = studentInfo;
	}
	
	
	

}
