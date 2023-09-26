package in.shiv;

import java.util.Arrays;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;

import in.shiv.entity.User;
import in.shiv.repository.UserRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		UserRepository repository = context.getBean(UserRepository.class);
		/*
		User u5=new User(105, "Raunak" ,25, "Male", "India");
		User u6=new User(106, "Sneha" ,27, "Female", "India");
		User u7=new User(107, "Andrew" ,30, "Male", "Gemany");
		User u8=new User(108, "Snail" ,25, "Male", "USA");
		User u9=new User(109, "Sohn" ,35, "Male", "Australia");
		User u10=new User(110, "Lara" ,25, "Female", "Maxico");
		
		repository.saveAll(Arrays.asList(u5,u6,u7,u8,u9,u10));
		System.out.println("Record successfully inserted...");
		
		*/
		
		/*
		List<User> list = repository.findAll();
		list.forEach(user->{
			System.out.println(user);
		});
		
		*/
		
// sorting 
		/*
//		List<User> list = repository.findAll(Sort.by("location"));
//		List<User> list = repository.findAll(Sort.by("age").descending());
//		List<User> list = repository.findAll(Sort.by("location").ascending());
//		List<User> list = repository.findAll(Sort.by("location", "age").descending());
//		List<User> list = repository.findAll(Sort.by("location", "age","userName").descending());
		List<User> list = repository.findAll(Sort.by("userId").descending());
		list.forEach(user->{
			System.out.println(user);
		});
		*/
		
// pagination
		/*
		Integer pageNumber=1;
		Integer pageSize=2;
		
		PageRequest pageRequest = PageRequest.of(pageNumber, pageSize);
		
		long offset = pageRequest.getOffset();
		System.out.println("Offest Value : "+offset);
		
		Sort sort = pageRequest.getSort();
		 Page<User> list = repository.findAll(pageRequest);
		 int totalPages = list.getTotalPages();
		 System.out.println("Total Number of Pages: "+totalPages);
		 
		 list.forEach(user->{
			 System.out.println(user);
		 });
		*/
		
//QueryByExample i.e. QBE
		
		
		User entity=new User();
		entity.setLocation("USA");
		entity.setGender("Male");
		
		entity.setAge(25);
		
		Example<User> example = Example.of(entity);
		/*
		List<User> list = repository.findAll(example);
		list.forEach(user->{
			System.out.println(user);
		});
		*/
		/*
		Integer pageNumber=0;
		Integer pageSize=4;
		
		PageRequest pageRequest = PageRequest.of(pageNumber, pageSize);
		Page<User> findAll = repository.findAll(example, pageRequest);
		findAll.forEach(user->{
			System.out.println(user);
		});
		*/
		
		List<User> findAll = repository.findAll(example, Sort.by("location"));
		findAll.forEach(user->{
			System.out.println(user);
		});
	}

}
