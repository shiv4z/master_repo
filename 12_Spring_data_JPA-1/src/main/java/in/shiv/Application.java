package in.shiv;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.shiv.entity.User;
import in.shiv.repository.UserRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		UserRepository repository = context.getBean(UserRepository.class);
		/*
		 * User user=new User(); user.setUserId(101); user.setUserName("Vinay");
		 * user.setUserAge(30); user.setLocation("India"); repository.save(user);
		 * System.out.println("Record inserted successfully..");
		 */

		/*
		User u2 = new User(102, "Shiv", 26, "India");
		User u3 = new User(103, "John", 36, "USA");
		User u4 = new User(104, "Ruby", 26, "Canada");

		repository.saveAll(Arrays.asList(u2, u3, u4));
		System.out.println("Record inserted successfully...");
		
		*/
		
		/*
		Iterable<User> findAll = repository.findAll();
		findAll.forEach(user->{
			System.out.println(user);
		});
		*/
		
		Iterable<User> findAllById = repository.findAllById(Arrays.asList(102,103,104));
		findAllById.forEach(user->{
			System.out.println(user);
		});
	}

}
