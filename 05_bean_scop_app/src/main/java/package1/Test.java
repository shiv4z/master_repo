package package1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		 ApplicationContext context=new ClassPathXmlApplicationContext("Spring-Bean.xml");
		 Car car = context.getBean("car", Car.class);
		 System.out.println("car->"+car.hashCode());
		 
		 Car car1 = context.getBean("car", Car.class);
		 System.out.println("car1->"+car1.hashCode());
		 
		 Motor motor = context.getBean("motor", Motor.class);
		 System.out.println(motor.hashCode());
		 
		 Motor motor1 = context.getBean("motor", Motor.class);
		 System.out.println(motor1.hashCode());
	}
	
	

}
