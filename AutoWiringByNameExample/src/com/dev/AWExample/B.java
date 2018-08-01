package com.dev.AWExample;

public class B {
	private int var;
	public B() {
		System.out.println("b is created");
	}
	public void setVar(int var){
		this.var=var;
	}
	public void print(){
		System.out.println("The var is: "+var);
		System.out.println("hello b");
	}
}