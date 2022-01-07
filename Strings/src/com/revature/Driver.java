package com.revature;

import java.util.Arrays;

public class Driver {

	public static void main(String[] args) {
		String name = "Jacob",
				location = "Missouri",
				vocation = "Instructor";
		
		// startsWith checks if the start of a String matches the input String
		System.out.println(name.startsWith("Ja")); // This would return true
		
		// indexOf of String would identify where in the operating String the substring could be found
		System.out.println(location.indexOf("sou")); // The returned index would be 3. Returns -1 if no match found
		System.out.println(location.indexOf('s'));
		
		String allLower = vocation.toLowerCase();
		String allUpper = vocation.toUpperCase();
		System.out.println(allLower + ", " + allUpper);
		
		// Trim removes leading and trailing whitespace. See below example
		String input = "   training   instructor    ";
		System.out.println(input + " becomes " + input.trim());
		
		String newStateName = location.replace('s', 'p');
		System.out.println(newStateName);
		
		// Split creates an array of Strings using an input and a delimiter
		// The delimiter becomes the breaking point of the input string
		String sentence = "This is my multi-word sentence";
		String[] words = sentence.split(" ");
		System.out.println(Arrays.toString(words));
		
		// Note on the String Pool: if you create string literals (ie just words/sentences in quotes)
		// the string is cached in the String Pool and reused if the program uses the same word/sentence
		// Instantiating a new string with 'new' bypasses this process
		String anotherSentence = "This is my multi-word sentence";
		// The below string is not a string literal and will not be stored in the String Pool
		String aThirdSentence = new String("This is my multi-word sentence");
	}

}
