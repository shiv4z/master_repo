package com.field;

import java.lang.reflect.Field;

public class Test {
	public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, SecurityException, InstantiationException, IllegalAccessException {
		Class<?> clz = Class.forName("com.field.BillCollector");
		Field field = clz.getDeclaredField("payment");
		field.setAccessible(true);
		
		Object obj = clz.newInstance();	
		field.set(obj, new DebitCardPayment());
		
		BillCollector bc = (BillCollector)obj;
		bc.collectBill(500.2);
		
	}

}
