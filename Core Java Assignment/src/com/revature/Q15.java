package com.revature;

public class Q15 {

	public void Interfaces() {
		
		Q15_Interface q15 = new Q15_Impl();
		
		Result(q15);
	}
	
	public void Result(Q15_Interface q15) {
		System.out.println(q15.addition(5, 10));
	}
}
