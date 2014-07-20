package com.gmx.spring.test;

public class Person {
	private int id;
	private String name;
	private int taxId;
	private Address address;
	
	public void setAddress(Address address) {
		this.address = address;
	}

	public int getTaxId() {
		return taxId;
	}

	public void setTaxId(int taxId) {
		this.taxId = taxId;
	}

	public Person() {
		
	}
	
	public Person(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public static Person getInstance(int id, String name) {
		System.out.println("Factory constructor");
		return new Person(id, name);
	}

	public void speak() {
		System.out.println("I'm a person !");
	}
	
	public void onCreate() {
		System.out.println("Person Created:" + this);
	}
	
	public void onDestroy() {
		System.out.println("Person destroyed");
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", taxId=" + taxId
				+ ", address=" + address + "]";
	}

	
	
}