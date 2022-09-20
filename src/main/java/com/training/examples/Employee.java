package com.training.examples;

public class Employee {
	private Integer id;
	private String name;
	protected String address;
	
	public Employee() {
		super();
	}
	
	//parameterized constructor
	public Employee(Integer id) {
		super();
		this.id = id;
	}
	
	
	public void example() {
		this.getAddress();
		super.hashCode();
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

}
