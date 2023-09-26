package in.shiv.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="USER_TBL")
@Data
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="USER_ID")
	private Integer userId;
	
	@Column(name="USER_NAME")
	private String userName;
	
	@Column(name="USER_EMAIL")
	private String email;

	@Column(name="USER_IMAGE")
	@Lob
	private byte[] userImage;
	

}
