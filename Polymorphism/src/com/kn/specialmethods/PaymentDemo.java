package com.kn.specialmethods;

public class PaymentDemo {

	public static void main(String[] args) {
		
//		Upi u= new Upi();
//		u.bill();
//		u.offers();
//		u.pay();
//		
//		Wallet w= new Wallet();
//		w.bill();
//		w.offers();
//		w.pay();
//		
//		Card c = new Card();
//		c.bill();
//		c.offers();
//		c.pay();
		
			Payment p;
			p=new Upi();
			p.bill();
			p.offers();
			p.pay();
			
			p=new Wallet();
			p.bill();
			p.offers();
			p.pay();
			
			
			p=new Card();
			p.bill();
			p.offers();
			p.pay();
	}

}
