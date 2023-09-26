package in.shiv;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.shiv.entity.Product;
import in.shiv.repository.ProductRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		ProductRepository repository = context.getBean(ProductRepository.class);
		
		Product p1= new Product();
		p1.setProductName("Monitor");
		p1.setProductPrice(8000);
		
		repository.save(p1);
		
	}

}
