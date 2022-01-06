package com.revature;

public class Q13 {

	public static void PrintTriangle(int size) {
		
		int characterIteration = 0;
		
		// Iterate through each row
		for (int row = 0; row < size; ++row) {
			
			// Add the right number of characters
			for (int column = 0; column < row + 1; ++column) {
				System.out.print( (characterIteration % 2) + " ");
				++characterIteration;
			}
			
			// Make sure to add a newline at the end of each row
			System.out.println();
		}
	}
}
