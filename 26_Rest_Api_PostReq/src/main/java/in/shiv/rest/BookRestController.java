package in.shiv.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.shiv.binding.Book;

@RestController
public class BookRestController {
	
	@PostMapping(value="/book", 
			consumes = {"application/json", "application/xml"}
	)
	public ResponseEntity<String> saveBookData(@RequestBody Book book){
		System.out.println(book);
		//logic to store data into db
		String response="Data save into successfully...";
		return new ResponseEntity<>(response, HttpStatus.CREATED);
		
	}

}
