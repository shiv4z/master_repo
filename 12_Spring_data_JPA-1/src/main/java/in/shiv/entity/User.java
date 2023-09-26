package in.shiv.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="USER_INFO")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

	@Id
	private Integer userId;
	private String userName;
	private Integer userAge;
	private String location;
	
}
