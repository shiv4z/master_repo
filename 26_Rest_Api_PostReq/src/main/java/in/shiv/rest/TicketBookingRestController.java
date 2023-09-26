package in.shiv.rest;


import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.shiv.binding.Passenger;
import in.shiv.binding.TicketData;

@RestController
public class TicketBookingRestController {

	@PostMapping("/ticket")
	public ResponseEntity<TicketData> bookTrainTicket(@RequestBody Passenger passenger) {
		System.out.println(passenger);
		TicketData ticketDataObj = new TicketData();
		ticketDataObj.setId(1021);
        ticketDataObj.setBerthNo(20);
        ticketDataObj.setDate(new Date());
        
        return new ResponseEntity<>(ticketDataObj, HttpStatus.CREATED);
	}

}
