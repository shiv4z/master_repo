package com.shiv;

public class Test {
	public static void main(String[] args) {
		BillCollector billCollector=new BillCollector();
		String payBill = billCollector.payBill((double) 120);
		System.out.println(payBill);
	}

}
