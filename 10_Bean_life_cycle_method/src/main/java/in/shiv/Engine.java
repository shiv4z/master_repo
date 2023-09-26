package in.shiv;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

@Component
public class Engine {
	public Engine() {
		System.out.println("Engine :: Constructor");
	}
	
	
	@PostConstruct
	public void init() {
		System.out.println("Engine started..");
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("Engine stoped..");
	}
	

}
