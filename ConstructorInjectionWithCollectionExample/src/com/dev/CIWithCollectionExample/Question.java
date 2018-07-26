package com.dev.CIWithCollectionExample;

import java.util.Iterator;
import java.util.List;
public class Question {
	private int id;
	private String name;
	private List<String> options;

	public Question() {
	}
	public Question(int id, String name, List<String> answers) {
		this.id = id;
		this.name = name;
		this.options = answers;
	}
	public void displayInfo(){  
		System.out.println(id+":"+name); 
		System.out.println("Options are:");  
		Iterator<String> itr=options.iterator();  
		while(itr.hasNext()){  
			System.out.println(itr.next());  
		}  
	}
}
