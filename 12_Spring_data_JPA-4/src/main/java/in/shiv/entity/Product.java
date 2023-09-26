package in.shiv.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.Data;

@Entity
@Table(name="PRODUCT_MASTER")
@Data
public class Product {
	
	@Id
	@Column(name="PRODUCT_ID")
	@GeneratedValue
	private int productId;
	
	@Column(name="PRODUCT_NAME")
	private String productName;
	
	@Column(name="PRODUCT_PRICE")
	private double productPrice;
	
	
	@CreationTimestamp
	@Column(name="CREATED_DATE", updatable=false)
	private LocalDateTime createdDate;
	
	@UpdateTimestamp
	@Column(name="UPDATED_DATE", insertable = false)
	private LocalDateTime updatedDate;
	

}
