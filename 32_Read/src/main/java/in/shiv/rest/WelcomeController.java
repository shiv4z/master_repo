package in.shiv.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
	
	@Value("${shiv.message.welcome}")
	private String welcome;
	
	@Value("${shiv.message.greet}")
	private String greet;
	
	@Value("${shiv.message.wish}")
	private String wish;
	
	
	@GetMapping("/welcome")
	public ResponseEntity<String> getWelcomeMsg(){
		return new ResponseEntity<>(welcome, HttpStatus.OK);
	}
	
	@GetMapping("/greet")
	public ResponseEntity<String> getGreetMsg(){
		//String msg = "Namaste India.";
        return new ResponseEntity<>(greet, HttpStatus.OK);
	}
	
	@GetMapping("/wish")
	public ResponseEntity<String> getWishMsg(){
		//String msg = "Good night";
		return new ResponseEntity<>(wish, HttpStatus.OK);
	}

}
