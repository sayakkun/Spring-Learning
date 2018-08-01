package com.dev.AWExample;

public class A {
	private B b;
	private int var;
	public A() {
		System.out.println("a is created");
	}

	public B getB() {
		return b;
	}

	public void setB(B b) {
		this.b = b;
	}
	public void setVar(int var){
		this.var=var;
	}
	public void print() {
		System.out.println("hello a");
		System.out.println("Var is: "+var);
	}

	public void display() {
		print();
		b.print();
	}
}