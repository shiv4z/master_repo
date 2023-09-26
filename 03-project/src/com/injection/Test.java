package com.injection;

public class Test {
	public static void main(String[] args) {
		
		BillCollector billCollector = new BillCollector();
		//BillCollector billCollector = new BillCollector(new CreditCardPayment());//construcor injection
		//billCollector.setiPayment(new DebitCardPayment());//setter injection
		
		CreditCardPayment ccc = new CreditCardPayment();
		billCollector.setiPayment(ccc);//field injection
		
		
		
		billCollector.payBill(1000.0);
	}

}
