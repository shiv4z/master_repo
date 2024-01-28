package in.shiv.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table
public class Product {
	@Id
	private Integer id;
	private String name;
	private String description;
	

}
