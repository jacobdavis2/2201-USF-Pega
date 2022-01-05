package com.revature;

import java.util.ArrayList;

public class Q09 {

	public static boolean isPrime(int candidate) {
		
		if (candidate == 0 || candidate == 1)
			return false;
		
		for (int i = 2; i < candidate; ++i) {
			if (candidate % i == 0)
				return false;
		}
		
		return true;
	}
	
	public static void testForPrimesTo100() {
		
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		for (int i = 0; i <= 100; ++i) {
			numbers.add(i);
			if (isPrime(i))
				System.out.println(i);
		}
	}
}
