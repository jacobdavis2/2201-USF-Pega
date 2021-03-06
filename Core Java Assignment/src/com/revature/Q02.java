package com.revature;

public class Q02 {

	// Here is the recursive solution to the Fibonacci sequence problem
	// "recursive" just means it is a method that calls itself
	public static int fibonacci(int n) {
		// fib(n) = fib(n-1) + fib(n-2)
		
		// Handle our base cases
		if (n == 0)
			return 0;
		else if (n == 1)
			return 1;
		
		// Since there are no base cases, perform the recursion
		return fibonacci(n-1) + fibonacci(n-2);
	}
	
	public static void FibsTo25() {
		
		for (int i = 0; i <= 25; ++i) {
			System.out.println("fib(" + i +") = " + fibonacci(i));
		}
	}
}
