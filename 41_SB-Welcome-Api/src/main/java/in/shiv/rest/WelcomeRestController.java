package in.shiv.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeRestController {
	
	@GetMapping("/welcome")
	public String welcomeMessage() {
		String msg = "Welcome to Delhi.";
		return msg;
	}

}
