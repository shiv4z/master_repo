package in.shiv.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="EMP_TBL")
@Data
public class Employee {
	
	@Id
	@Column(name="EMP_ID")
	private Integer empId;
	
	@Column(name="EMP_NAME")
	private String empName;
	
	@Column(name="EMP_SALARY")
	private Double empSalary;
	

}
