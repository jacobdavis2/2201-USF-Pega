package com.revature;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.regex.Pattern;
/**
 * AddingMachine
 */
public class Calculator
{
    public static void main( String[] args )
    {
    	Scanner userInput = new Scanner(System.in).useDelimiter( "\\s" );
    	
    	while (true) {
	    	try {
	            System.out.println( "Enter the operation" );
	            //System.out.println( "Enter the first number:" );
	            double x = userInput.nextDouble();
	            //System.out.println( "Enter the operation symbol:" );
	            String symbol = userInput.next();
	            //System.out.println( "Enter the second number:" );
	            double y = userInput.nextDouble();
	            double result = calculate( x, y, symbol );
	    	}
	    	// Catch blocks only run if an exception of the expected type is thrown
	    	catch (InputMismatchException e) {
	    		System.out.println("Thats not the correct input! Numbers only!");
	    		//e.printStackTrace();
	    	} 
	    	// Catching Exception will catch an exception of any type
	    	// Sort like the default clause of a switch statement (applies if no other clause applies)
	    	catch (Exception e) {
	    		System.out.println("We didnt expect this exception! " + e.getMessage());
	    	}
	    	// Finally blocks always run, regardless of whether an exception was thrown or
	    	// if that exception was caught
	    	finally {
	    		// We need to get the next line at the end every time to consume the newline (\n) character
	    		// at the end of all input strings
	    		userInput.nextLine();
	    	}
    	}
    }
    
    // In methods that can throw exceptions of any kind, we can either handle those exceptions
    // or mark our method as possibly throwing them with the 'throws' keyword
    public static double calculate( double x, double y, String symbol ) throws Exception
    {
        double result;
        switch( symbol )
        {
            case "+":
                result = x + y;
                break;
            case "-":
                result =  x - y;
                break;
            case "*":
                result = x * y;
                break;
            case "/":
                result = x / y;
                break;
            case "%":
                result = x % y;
                break;
            default:
            	// We can throw any kind of exception using the 'throw' keyword
                throw new Exception("This symbol isn't supported in our calculator");
        }
        
        System.out.println( "Your result is: " + result );
        return result;
    }
}