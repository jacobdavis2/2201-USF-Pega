package com.revature;

public class Driver {
	
	/* Variable scopes in Java:
	 * 1. Class scope (static methods and variables)
	 * 2. Instance scope (non-static methods and variables)
	 * 3. Method scope (any variable declared inside of a method)
	 * 4. Block scope (any variable declared within {} that doesnt fall into another scope)
	 */

	public static void main(String[] args) {
		
		// Var args example
		// Var args can take 0 or more arguments and turns them into an array of the given type
		showVarArgs();
		
		/*staticHelper();
		staticHelper();
		staticHelper();*/
		
		Animal a = new Animal();
		// We are accessing a static field via an instance here, 
		// to show that the field is shared between a and b
		// Best practice, however, is to use the static call, ie Animal.count++;
		a.count++;
		a.species = "giraffe";
		
		Animal b = new Animal();
		b.count++;
		b.species = "tiger";
		
		System.out.println("Animal a: " + a.count + ", " + a.species);
		System.out.println("Animal b: " + b.count + ", " + b.species);
		
		if (a.species == "giraffe") {
			
			// Here, message belongs to BLOCK scope, and will expire after the closing curly brace of the if-block
			String message = "Wow its a giraffe!";
			System.out.println(message);
		}
		
		// Can 'suggest' to the Garbage Collector to do a run on the memory you have reserved
		// Sort of like calling the Garbage Collector
		System.gc();
	}
	
	public static void staticHelper() {
		
		// This variable belongs to the METHOD scope
		// It only exists so long as the method is executing
		int methodInt = 0;
		++methodInt;
		
		System.out.println(methodInt);
	}
	
	// If we have multiple params with var args, the var args parameter must be the final parameter
	public static void showVarArgs(/*String s2, */String... strings) {
		for (String s : strings)
			System.out.println(s);
	}
}

class Animal {
	
	// Because its static, it belongs to the CLASS scope
	static int count = 0;
	
	// Non-static variables belong to the INSTANCE scope
	String species;
	
	// This methods runs on an object any time it is released from memory
	// "dying breath"
	@Override
	public void finalize() {
		System.out.println("Do one last thing...");
	}
}
