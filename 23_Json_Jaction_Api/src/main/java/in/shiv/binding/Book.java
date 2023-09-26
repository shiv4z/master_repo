package in.shiv.binding;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.Data;

@Data
@JsonPropertyOrder({ "bid", "bookName", "name", "price", "author" })
@JsonInclude(value = Include.NON_NULL)
public class Book {
	private Integer bid;

	@JsonProperty(value = "bookName")
	private String name;

	
	private Double price;
	private Author author;

}
