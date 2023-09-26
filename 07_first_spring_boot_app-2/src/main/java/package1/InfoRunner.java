package package1;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


@Component
public class InfoRunner implements CommandLineRunner{

	@Override
	public void run(String... args) throws Exception {
		// Some logic to send application health 
		System.out.println("Info Runner :: Command Line Runner");
		
	}

}
