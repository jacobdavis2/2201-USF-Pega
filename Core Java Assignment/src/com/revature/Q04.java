package com.revature;

public class Q04 {

	// The recursive solution to the factorial problem
	public static int factorial(int n) {
		if (n == 0)
			return 1;
		
		return n * factorial(n - 1);
	}
	
	public static void ShowFactorial(int n) {
		System.out.println(n + "! = " + factorial(n));
	}
}
