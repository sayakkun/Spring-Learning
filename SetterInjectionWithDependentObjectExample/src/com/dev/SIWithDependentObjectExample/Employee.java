package com.dev.SIWithDependentObjectExample;
public class Employee{
	private String empId;
	private String name;
	private Address address;
	/*Let's check if setter method name's is changed slightly, it will work or not*/
	public void setId(String empId){
		this.empId=empId;
	}
	public void setName(String name){
		this.name=name;
	}
	public void setAddress(Address address){
		this.address=address;
	}
	public void displayEmpInfo(){
		System.out.println("Employee details");
		System.out.println("Id: "+empId);
		System.out.println("Name: "+name);
		System.out.println("Address: "+address);
		//we have to override toString function
	}
}
