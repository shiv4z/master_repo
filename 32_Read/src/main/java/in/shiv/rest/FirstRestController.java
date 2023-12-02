package in.shiv.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import in.shiv.config.AppProperty;

@RestController
public class FirstRestController {
	
	@Autowired
	private AppProperty property;
	
	@GetMapping("/welcomeNew")
	public ResponseEntity<String> getWelcomeMsg(){
		String welcome = property.getMessage().get("welcome");
		return new ResponseEntity<>(welcome, HttpStatus.OK);
	}
	
	@GetMapping("/greetNew")
	public ResponseEntity<String> getGreetMsg(){
		String greet = property.getMessage().get("greet");
        return new ResponseEntity<>(greet, HttpStatus.OK);
	}
	
	@GetMapping("/wishNew")
	public ResponseEntity<String> getWishMsg(){
		String wish = property.getMessage().get("wish");
		return new ResponseEntity<>(wish, HttpStatus.OK);
	}


}
