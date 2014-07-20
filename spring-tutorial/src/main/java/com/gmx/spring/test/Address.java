package com.gmx.spring.test;

public class Address {
	private String street;
	private String postcode;
	
	public Address(String street, String postcode) {
		this.street = street;
		this.postcode = postcode;
	}
	
	public void onInit() {
		System.out.println("Address inited:" + this);
	}


	@Override
	public String toString() {
		return "Address [street=" + street + ", postcode=" + postcode + "]";
	}
	
	

}
