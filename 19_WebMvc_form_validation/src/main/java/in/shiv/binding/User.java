package in.shiv.binding;

import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class User {
	
	@NotEmpty(message = "User name is required")
	@Size(min = 3 , max = 10, message = "User name should between 3 to 10 charcters")
	private String userName;
	
	@NotEmpty(message = "Password is required")
	private String password;
	
	@NotEmpty(message = "Email is required")
	@Email(message = "Provide valid email-id")
	private String email;
	
	@NotEmpty(message = "Contact is required")
	@Size(min = 10, message = "Conact number should be greater than 9 digits")
	private String contact;
	
	@NotNull(message = "Age is required")
	@Min( message = "Age should be greater than 21", value = 21)
	@Max(value = 100 , message = "Age should not be greater than 100")
	private Integer age;
	

}
