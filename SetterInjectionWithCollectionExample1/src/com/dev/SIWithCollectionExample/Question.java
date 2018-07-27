package com.dev.SIWithCollectionExample;

import java.util.Iterator;
import java.util.List;

public class Question {
	private int id;
	private String name;
	private List<String> options;

	// setter method name does not matter
	// since, bean property name will be the field name
	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setOptions(List<String> options) {
		this.options = options;
	}

	public void displayInfo() {
		System.out.println(id + " " + name);
		System.out.println("Options are:");
		Iterator<String> itr = options.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
