package in.shiv.rest;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import in.shiv.binding.Product;

@RestController
public class ProductRestController {

	@GetMapping(value="/product", produces = {"application/xml", "application/json"})
	public ResponseEntity<Product> getProductDetails() {
		Product productObj = new Product();
		productObj.setPid(101);
		productObj.setPname("Monitor");
		productObj.setPrice(2000.00);
		
		return new ResponseEntity<Product>(productObj, HttpStatus.OK);
		
	}
	
	@GetMapping("/products")
	public ResponseEntity<List<Product>> getProductList(){
		Product p1=new Product(102, "CPU", 5000.0);
		Product p2=new Product(103, "UPS", 4000.0);
		Product p3=new Product(104, "Battery", 1800.0);
		List<Product> productList = Arrays.asList(p1, p2, p3);
		return new ResponseEntity<>(productList, HttpStatus.OK);
		
	}

}
