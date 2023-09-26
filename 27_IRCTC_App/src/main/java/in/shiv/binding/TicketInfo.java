package in.shiv.binding;

import java.util.Date;

import lombok.Data;

@Data
public class TicketInfo {
	private Integer id;
	private Integer tNumber;
	private String status;
	private Date bookDate;
	

}
