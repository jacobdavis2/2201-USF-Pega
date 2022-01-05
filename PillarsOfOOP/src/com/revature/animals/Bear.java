package com.revature.animals;

/* Access Modifiers
 * 
 * private - Can be accessed by the class only.
 * 'default' - Also called package-private. Can be accessed by the class or any class in the same package.
 * protected - Can be accessed by the class or its children.
 * public - Can be accessed by anyone.
 */
public class Bear extends Animal implements NaturalFunctions {

	public void eat() {
		
	}
	
	public void sleep() {
		species = "accessing species!";
	}
	
	private String denAddress;
	private String favoriteFishingSpot;
	
	// Standard Getter formulation. Note that code for things logging and security can also run here
	public String getDenAddress() {
		return denAddress;
	}
	
	// We can also set private variables with Setters. 
	public void setDenAddress(String denAddress) {
		this.denAddress = denAddress;
	}
}
