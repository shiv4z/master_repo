package in.shiv.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import in.shiv.UserCreation;


@Configuration
public class AppConfig {
	public AppConfig() {
		System.out.println("AppConfig :: Constructor");
	}
	
	@Bean
	public void instantiate() {
		UserCreation userCreation = new UserCreation();
		String createUser = userCreation.createUser();
		System.out.println(createUser);
	}
}
