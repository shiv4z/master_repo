package in.shiv.rest;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import in.shiv.binding.PassengerInfo;
import in.shiv.binding.TicketInfo;

@RestController
public class TicketRestController {
	
	@GetMapping("/ticket")
	public ResponseEntity<TicketInfo> getTicketDetails(@RequestParam("id")Integer id){
		TicketInfo ticket=new TicketInfo();
		ticket.setId(id);
		ticket.setTNumber(13145);
		ticket.setBookDate(new Date());
		ticket.setStatus("CONFIRMED");
		
		return new ResponseEntity<>(ticket, HttpStatus.CREATED);
	}
	
	@PostMapping("/book")
	public ResponseEntity<TicketInfo> bookTicket(@RequestBody PassengerInfo request){
		System.out.println(request);
		//traing ticket booking logic
		TicketInfo ticket=new TicketInfo();
		ticket.setId(10210);
		ticket.setTNumber(13145);
		ticket.setBookDate(new Date());
		ticket.setStatus("CONFIRMED");
		
		return new ResponseEntity<>(ticket, HttpStatus.CREATED);
	}
	
	@PutMapping("book")
	public ResponseEntity<String> updateDetails(@RequestBody PassengerInfo request){
		System.out.println(request);
		//logic to update passenger data
		String response="Passenger Details has been updated successfully..";
		return new ResponseEntity<>(response, HttpStatus.OK);
	}
	
	@DeleteMapping("book/{id}")
	public ResponseEntity<String> deleteTicket(@PathVariable("id")Integer id){
		//logic to delete record from db
		return new ResponseEntity<>("Ticket Deleted successfully..", HttpStatus.OK);
		
		
	}

}
