package com.dev.InheritingBeanExample;

public class Employee extends Person{
	private String employeeCode;
	private String companyName;
	public Employee(String name,int age,String gender,long phoneNumber,String employeeCode,String companyName)
	{
		super(name,age,gender,phoneNumber);
		this.employeeCode=employeeCode;
		this.companyName=companyName;
	}
	public void displayInfo()
	{
		super.displayInfo();
		System.out.println("EmployeeCode: "+employeeCode);
		System.out.println("CompanyName: "+companyName);
	}
	

}
