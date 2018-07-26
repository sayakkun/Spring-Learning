package com.dev.InheritingBeanExample;

public class Person {
	private String name;
	private int age;
	private String gender;
	private long phoneNumber;
	Person(String name, int age, String gender,long phoneNumber) {
		this.name = name;
		this.age = age;
		this.gender=gender;
		this.phoneNumber = phoneNumber;
	}
	public void displayInfo() {
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
		System.out.println("Gender: "+gender);
		System.out.println("PhoneNumber: "+phoneNumber);
	}
}
