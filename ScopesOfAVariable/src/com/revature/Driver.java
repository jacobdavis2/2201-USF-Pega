package com.revature;

public class Driver {
	
	/* Variable scopes in Java:
	 * 1. Class scope (static methods and variables)
	 * 2. Instance scope (non-static methods and variables)
	 * 3. Method scope (any variable declared inside of a method)
	 * 4. Block scope (any variable declared within {} that doesnt fall into another scope)
	 */

	public static void main(String[] args) {
		
		/*staticHelper();
		staticHelper();
		staticHelper();*/
		
		Animal a = new Animal();
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
	}
	
	public static void staticHelper() {
		
		// This variable belongs to the METHOD scope
		// It only exists so long as the method is executing
		int methodInt = 0;
		++methodInt;
		
		System.out.println(methodInt);
	}
}

class Animal {
	
	// Because its static, it belongs to the CLASS scope
	static int count = 0;
	
	// Non-static variables belong to the INSTANCE scope
	String species;
}
