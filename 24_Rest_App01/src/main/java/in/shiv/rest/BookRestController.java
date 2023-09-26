package in.shiv.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookRestController {

	@GetMapping("/book/{bname}")
	public ResponseEntity<String> getBookPrice(@PathVariable("bname") String bname){
		String response =bname+" is availbale for 300$.. "; 
		return new ResponseEntity<>(response, HttpStatus.OK);
	}
	
	@GetMapping("/book/bname/{bname}/aname/{aname}")
	public ResponseEntity<String> checkAvailibility(@PathVariable("bname")String bname, @PathVariable("aname")String aname){
		String response= bname+" by "+aname+" is not availbale..";
		return new ResponseEntity<>(response, HttpStatus.OK);
		
	}

}
