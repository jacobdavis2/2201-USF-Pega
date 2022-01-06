package com.revature;

import java.time.LocalDate;

import javax.print.attribute.standard.DateTimeAtCompleted;

public class Q14 {

	public static void SwitchCases(int option) {
		
		int aNumber = 144;
		
		switch (option) {
		case 1:
			System.out.println("The square root of " + aNumber + " is " + Math.sqrt(aNumber));
			break;
			
		case 2:
			System.out.println("Today's date is " + LocalDate.now());
			break;
			
		case 3:
			String whole = "I am learning Core Java";
			
			// Parts becomes ["I", "am", "learning", "Core", "Java"]
			String[] parts = whole.split(" ");
			
			// Enhanced for-loop for iterating through the array of Strings
			for (String s : parts)
				System.out.println(s);
			
			// The above and below are functionally identical
			/*for (int i = 0; i < parts.length; ++i) {
				System.out.println(parts[i]);
			}*/
			break;
		}
	}
}
