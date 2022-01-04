package com.revature;

public class Q03 {

	public static String Reverse(String str) {
		
		char[] charArray = str.toCharArray();
		char[] subArray = new char[charArray.length];
		
		for (int i = charArray.length - 1; i >= 0; --i) {
			subArray[charArray.length - 1 - i] = charArray[i];
		}
		
		// Alternative writing of the algorithm 
		/*
		for (int i = 0; i < charArray.length; ++i) {
			subArray[i] = charArray[charArray.length - i - 1];
		}*/
		
		return new String(subArray);
	}
	
	
	public static String testString = "My Test String";
	public static void TestReverse() {
		System.out.println(Reverse(testString));
	}
}
