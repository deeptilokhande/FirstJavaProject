package com.deepti.serialization;

import java.io.Serializable;

public class Employee implements Serializable{
	
	private int empid;
	private String empname;
	Address address;
	
	
	public Employee(int empid, String empname, Address address) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.address = address;
	}


	public int getEmpid() {
		return empid;
	}


	public void setEmpid(int empid) {
		this.empid = empid;
	}


	public String getEmpname() {
		return empname;
	}


	public void setEmpname(String empname) {
		this.empname = empname;
	}


	@Override
	public String toString() {
		return String.format("Employee [empid=%s, empname=%s, address=%s]", empid, empname, address);
	}


	public Address getAddress() {
		return address;
	}


	public void setAddress(Address address) {
		this.address = address;
	}
	
	

}
