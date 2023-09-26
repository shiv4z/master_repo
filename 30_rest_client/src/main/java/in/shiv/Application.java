package in.shiv;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.shiv.client.RestClient;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		
		RestClient restClient = context.getBean(RestClient.class);
		//restClient.callGetUrl();
		
		restClient.getAllBooks();
	}

}
