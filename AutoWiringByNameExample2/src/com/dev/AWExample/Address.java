package com.dev.AWExample;
public class Address {
	public String addressLine;
	public String city;
	public int postCode;
	public String state;
	public void setaddressLine(String addressLine)
	{
			this.addressLine=addressLine;
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
			return addressLine;
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
			return addressLine+", "+city+", "+state+":-"+postCode;
	}
}

