package in.shiv.binding;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import lombok.Data;

@Data
public class Book {
	
	@NotEmpty(message = "Book Name is required")
	private String bookName;
	
	@NotEmpty(message = "Author Name is required")
	private String authorName;
	
	@NotNull(message = "Book Price is required")
	private Double bookPrice;
	

}
