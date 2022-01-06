package com.revature;

public class Q15_Impl implements Q15_Interface {

	@Override
	public double addition(double a, double b) {
		return a + b;
	}

	@Override
	public double subtraction(double a, double b) {
		return a - b;
	}

	@Override
	public double multiplication(double a, double b) {
		return a * b;
	}

	@Override
	public double division(double a, double b) {
		return a / b;
	}
	
	public void WowMyMethod() {
		System.out.println("Wow!");
	}
}
