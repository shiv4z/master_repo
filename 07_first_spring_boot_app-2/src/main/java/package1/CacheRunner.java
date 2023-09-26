package package1;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class CacheRunner implements ApplicationRunner{

	@Override
	public void run(ApplicationArguments args) throws Exception {
		// write some logic to store data into cache
		System.out.println("Cache Runner :: Application Runner");
		
	}

}
