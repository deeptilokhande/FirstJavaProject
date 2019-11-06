package com.deepti.serialization;

import java.io.Serializable;

public class Address implements Serializable{
	
	@Override
	public String toString() {
		return String.format("Address [adressline1=%s, city=%s, zipcode=%s]", adressline1, city, zipcode);
	}


	private String adressline1;
	private String city;
	private String zipcode;
	
	
	public Address(String adressline1, String city, String zipcode) {
		super();
		this.adressline1 = adressline1;
		this.city = city;
		this.zipcode = zipcode;
	}


	public String getAdressline1() {
		return adressline1;
	}


	public void setAdressline1(String adressline1) {
		this.adressline1 = adressline1;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public String getZipcode() {
		return zipcode;
	}


	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	
	
	
	

}
