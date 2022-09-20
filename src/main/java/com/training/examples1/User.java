package com.training.examples1;

import com.training.examples.Employee;//ctrl+shift+o

public class User extends Employee {

	static Integer id = 0; //when class loading 
	
	Integer id1=1;
	
	public static void main(String[] args) {
		Employee emp = new Employee();
		// try to access the default access modifier
	}
	
	public void test() {
		String name = this.address;
	}

}
