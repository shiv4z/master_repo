package in.shiv.binding;

import java.io.Serializable;

import lombok.Data;

@Data
public class User implements Serializable{
	
	private Integer uid;
	private String name;
	private Integer age;
	

}
