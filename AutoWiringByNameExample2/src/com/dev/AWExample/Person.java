package com.dev.AWExample;

public class Person {
	public String name;
	public int age;
	public String gender;
	public Address address;
	//Now, autowire byName and ByType both work on setter method
	public void setName(String name)
	{
		this.name=name;
	}
	public void setAge(int age)
	{
		this.age=age;
	}
	public void setGender(String gender)
	{
		this.gender=gender;
	}
	public void setAddress(Address address)
	{
		this.address=address;
	}
	public String getName()
	{
		return name;
	}
	public int getAge()
	{
		return age;
	}
	public Address getAddress()
	{
		return address;
	}
	public void displayInfo()
	{
		System.out.println("The name: "+name);
		System.out.println("The age: "+age);
		System.out.println("The gender: "+gender);
		System.out.println("The address: "+address);
	}
}
