package com.tka;

public class MainApp {
	public static void main(String[] args) {
		
	
		Payment p = new Gpay();
		p.makePayments();
		
		p = new Phonepay();
		p.makePayments();
		
		p= new Upipayment();
			p.makePayments();	
				
				
	}
	}