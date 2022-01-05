package com.revature;

public class Q06 {

	public static boolean isEven(int i) {
		
		int divided = i/2;
		
		return (divided*2) == i;
	}
	
	public static void testIsEven() {
		int even = 12, odd = 11;
		
		System.out.println(even + " is even? " + isEven(even));
		System.out.println(odd + " is even? " + isEven(odd));
	}
}
