package injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("Spring-Bean.xml");
		BillCollector bc = context.getBean("billCollector", BillCollector.class);
		bc.payBill(1000.0);
	}

}
