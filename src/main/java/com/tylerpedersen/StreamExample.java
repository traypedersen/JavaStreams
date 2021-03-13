package com.tylerpedersen;

import java.util.ArrayList;
import java.util.List;

public class StreamExample {

	
	public static void main(String[] args) {
		
		Person p1 = new Person("Jon", "Doe");
		Person p2 = new Person("Jane", "Doe");
		Person p3 = new Person("Jim", "Doe");
		Person p4 = new Person("Nacy", "Doe");
		
		List<Person> persons = new ArrayList<>();
		persons.add(p1);
		persons.add(p2);
		persons.add(p3);
		persons.add(p4);

		persons
			.stream()
			.filter( p -> p.getFirstName().startsWith("J") ) 
			.forEach(System.out::println);
		
	}
}

