package in.shiv.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import in.shiv.client.WelcomeApiClient;

@RestController
public class GreetRestController {
	
	@Autowired
	private WelcomeApiClient welcomeApi;
	
	
	@GetMapping("/greet")
	public String greetMessage() {
		String msg = "Good Morning !";
		return msg+", "+welcomeApi.welcomeMessage();
	}

}
