package package1;

import org.springframework.stereotype.Component;

@Component
public class User {
	public User() {
		//Some User Logic
		System.out.println("User :: Constructor");
	}

}
