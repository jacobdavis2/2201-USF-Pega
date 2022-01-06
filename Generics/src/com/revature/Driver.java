package com.revature;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Driver {

	public static void main(String[] args) {
		
		// ArrayList is a generic collection
		// Generic classes require the target object type to be specified within < >
		ArrayList<Object> list = new ArrayList<Object>();
		Object o = new Object(), p = new Object();
		
		list.add(o);
		list.add(p);
		list.get(0);
		
		ArrayList<Employee> empList = new ArrayList<Employee>();
		
		// If we want to store primitives, we have to use a Wrapper Class. The below code wont work
		//ArrayList<int> intList = new ArrayList<int>();
		
		// Wrapper classes are classes that represent primitive data, but as a reference type
		ArrayList<Integer> intList = new ArrayList<Integer>();
		
		
		// Sets are used to guarantee unique data 
		HashSet<Integer> set = new HashSet<Integer>();
		set.add(3);
		set.remove(3);
		// Cannot use get; Set doesnt have indexes
		// set.get(3);
		
		
		// Deques are used to process lists of data in order, one at a time
		ArrayDeque<Integer> deque = new ArrayDeque<Integer>();
		// Push means add to the end of the queue
		deque.push(3);
		// Pop eans take from the top of the queue
		int val = deque.pop();
		
		
		// Maps are used when we need key-value behavior, eg want to associate a string with an object reference
		HashMap<String, Employee> myMap = new HashMap<String, Employee>();
		// To insert into a map, use put() with your key and value
		myMap.put("jacob", new Employee());
		// To retrieve, use get()
		Employee myObject = myMap.get("jacob");
		
		// In order to traverse an entire map, you can traverse the map's list of keys
		Set<String> keys = myMap.keySet();
		for (String key : keys) {
			Employee e = myMap.get(key);
		}
		
		// An alternative way of navigating any collection
		Iterator<String> it = keys.iterator();
		while (it.hasNext()) {
			String key = it.next();
			// Process the current key
		}
		
		MyArrayList<Employee> myArrayList = new MyArrayList<Employee>();
		myArrayList.add(new Employee());
	}
}

class Employee {
	
	public void myMethod() {
		
	}
}
