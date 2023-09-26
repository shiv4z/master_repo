package com.field;

public class BillCollector {
	private IPayment payment;


	public void collectBill(Double amount) {
		String pay = payment.pay();
		System.out.println(pay +""+amount);
	}
}
