package com.dev.SIWithDependentObjectExample;

public class Address {
	private String addressLine1,city,state,country;  
	public void setAddressLine1(String addressLine1){
		this.addressLine1=addressLine1;
	}
	public void setCity(String city){
		this.city=city;
	}
	public void setState(String state){
		this.state=state;
	}
	public void setCountry(String country){
		this.country=country;
	}
	public String toString()
	{
		return addressLine1+", "+city+", "+state+", "+country;
	}
}
