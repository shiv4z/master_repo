package in.shiv.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import in.shiv.client.WelcomeApiClient;

@RestController
public class GreetRestController {
	@Autowired
	private Environment env;
	@Autowired
	private WelcomeApiClient welcomeApi;
	
	@GetMapping("/greet")
	public String greetMessage() {
		String port = env.getProperty("server.port");
		
		String msg = "Good Morning ! ";
		String welcomeMsg = welcomeApi.invokeWelcomeApi();
		return msg + welcomeMsg+" Port Number :: "+port;
	}
	

}
