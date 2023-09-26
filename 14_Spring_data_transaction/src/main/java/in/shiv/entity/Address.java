package in.shiv.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="ADDRESS_TBL")
@Data
public class Address {
	
	@Id
	@Column(name="ADDRESS_ID")
	private Integer addressId;

	@Column(name="EMP_ID")
	private Integer empId;
	
	@Column(name="STATE")
	private String state;
	
	@Column(name="CITY")
	private String city;
	

}
