package in.shiv;

import java.util.List;

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
		User u1=new User(101, "Vinay", 31, "Male", "India");
		User u2=new User(102, "Shiv", 27, "Male", "India");
		User u3=new User(103, "John", 25, "Male", "USA");
		User u4=new User(104, "Ruby", 35, "Female", "Canada");
		
		repository.saveAll(Arrays.asList(u1,u2,u3,u4));
		System.out.println("Record inserted successfully....");
		*/
		/*
		List<User> list = repository.findAllByLocation("India");
		list.forEach(user->{
			System.out.println(user);
		});
		
		List<User> findAllByAge = repository.findAllByAge(25);
		findAllByAge.forEach(user->{
			System.out.println(user);
		});
		*/
		
		/*
		List<User> list = repository.findAllByLocationAndAge("India", 27);
		list.forEach(user->{
			System.out.println(user);
		});
		*/
		
		/*
		List<User> list = repository.findAllByLocationIn(Arrays.asList("India","USA"));
		list.forEach(user->{
			System.out.println(user);
		});
		*/
		
		/*
		List<User> list = repository.findAllByGender("Female");
		list.forEach(user->{
			System.out.println(user);
		});
		*/
		
		/*
		List<User> list = repository.findAllByLocationAndAgeAndGender("India", 27, "Male");
		list.forEach(user->{
			System.out.println(user);
		});
		*/
		
		/*
		List<User> list = repository.findByLocationOrAge("India", 25);
		list.forEach(user->{
			System.out.println(user);
		});
		
		*/
		/*
		List<User> list = repository.getAllUsers();
		list.forEach(user->{
			System.out.println(user);
		});
		
		*/
		/*
		
		List<User> list = repository.getAllUsersBysql();
		list.forEach(user->{
			System.out.println(user);
		});
		*/
		
		/*
		List<User> list = repository.getAllUsersBySql1("India", 27);
		list.forEach(user->{
			System.out.println(user);
		});
		*/
		
		/*
		List<User> list = repository.getAllUserByHql("Canada", 35);
		list.forEach(user->{
			System.out.println(user);
		});
		*/
		
		List<User> list = repository.getUserNameAndlocation(25);
		list.forEach(user->{
			System.out.println(user);
		});
	}
	

}
