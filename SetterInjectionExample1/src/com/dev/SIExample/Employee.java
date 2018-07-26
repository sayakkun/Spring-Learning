package com.dev.SIExample;

public class Employee extends Person{
	//a default constructor definition is there
	//that default constructor defintion also has a call to the super()
	private String empCode;
	private String companyName;
	public void setEmpCode(String empCode){
		this.empCode=empCode;
	}
	public void setCompanyName(String companyName)
	{
		this.companyName=companyName;
	}
	public void displayInfo()
	{
		super.displayInfo();
		System.out.println("Employee Code: "+empCode);
		System.out.println("Company Name: "+companyName);
	}
}
