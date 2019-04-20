package com.servlet;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

public class Student implements Serializable {

	private static final long serialVersionUID = 1644243914032084288L;
	
	private long id;
	private String name;
	private String gender;
	private Address address;
	private Set subjects = new HashSet(0);
	private String mobile;
	
	public Student(long id, String name, String gender, String mobile) {
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.mobile = mobile;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Set getSubjects() {
		return subjects;
	}

	public void setSubjects(Set subjects) {
		this.subjects = subjects;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	
	

}
