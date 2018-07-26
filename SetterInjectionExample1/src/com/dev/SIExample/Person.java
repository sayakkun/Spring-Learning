package com.dev.SIExample;

public class Person {
	private String name;
	private int age;
	private String gender;
	private long phoneNumber;
	private String address;

	// even if we don't define a constructor, a default constructor is added
	// if we define a constructor (whether it is no arg, copy constructor or
	// parametric constructor), that default definition no longer usable
	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age){
		this.age=age;
	}
	public void setGender(String gender){
		this.gender=gender;
	}
	public void setPhoneNumber(long phoneNumber){
		this.phoneNumber=phoneNumber;
	}
	public void setAddress(String address){
		this.address=address;
	}
	public void displayInfo() {
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		System.out.println("Gender: " + gender);
		System.out.println("PhoneNumber: " + phoneNumber);
		System.out.println("Address: "+address);
	}

}
