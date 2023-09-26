package in.shiv.entity;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="BANK_ACCOUNTS")
@Data
public class Account {
	
	@Column(name="BRANCH_NAME")
	private String branchName;
	
	@Column(name="MIN_BALANACE")
	private Double minBal;
	
	@EmbeddedId
	private AccountPk accId;
	
	

}
