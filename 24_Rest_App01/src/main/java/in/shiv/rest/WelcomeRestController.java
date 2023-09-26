package in.shiv.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeRestController {

	@GetMapping("/welcome")
	public String welcome() {
		String respPayload = "Welcome to IT Industry..";
		return respPayload;
	}

	@GetMapping("/greet")
	public ResponseEntity<String> greet() {
		String respPayload = "Welcome to the Software Development..";
		return new ResponseEntity<>(respPayload, HttpStatus.OK);
	}

	@GetMapping("/wish")
	public ResponseEntity<String> queryParama(@RequestParam("name") String name) {
		String response = "Hello " + name + " Good Morning..";
		return new ResponseEntity<>(response, HttpStatus.OK);
	}

	@GetMapping("/course")
	public ResponseEntity<String> course(@RequestParam("cname") String cname, @RequestParam("tname") String tname) {
		String response = cname + " By " + tname + " and Fee is 10000";
		return new ResponseEntity<String>(response, HttpStatus.OK);
	}
}
