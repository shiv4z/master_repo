package com.shiv;

public class BillCollector {
	public String payBill(Double amount) {
		CreditCardPay creditCardPay=new CreditCardPay();
		Integer status = creditCardPay.pay(amount);
		if(status>0) {
			return "payment successfull";
		}else {
			return "Payment failed";
		}
		
	}

}
