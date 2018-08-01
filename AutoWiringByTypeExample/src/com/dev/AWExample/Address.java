package com.dev.AWExample;

public class Address {
	public String addressLine1;
	public String city;
	public int postCode;
	public String state;
	public void setAddressLine1(String addressLine1)
	{
			this.addressLine1=addressLine1;
	}
	public void setCity(String city)
	{
		this.city=city;
	}
	public void setPostCode(int postCode)
	{
		this.postCode=postCode;
	}
	public void setState(String state)
	{
		this.state=state;
	}
	public String getAddressLine()
	{
			return addressLine1;
	}
	public String getCity()
	{
			return city;
	}
	public int getPostCode()
	{
		return postCode;
	}
	public String getState()
	{
			return state;
	}
	public String toString()
	{
			return addressLine1+", "+city+", "+state+":-"+postCode;
	}
}