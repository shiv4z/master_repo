package in.shiv;

import java.util.Arrays;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.shiv.entity.Player;
import in.shiv.repository.PlayerRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		PlayerRepository repository = context.getBean(PlayerRepository.class);
		
		
		  Player p1 = new Player(101, "Sachin", 46, "Mumbai"); 
		  //repository.save(p1);
		//  System.out.println("Record inserted successfully..");
		 
		
		/*
		Player p2 = new Player(102, "Dhoni", 46, "Ranchi");
		Player p3 = new Player(103, "Dravin", 46, "Pune");
		Player p4 = new Player(104, "Yuvraj", 46, "Delhi");
		
		    repository.saveAll(Arrays.asList(p2,p3,p4));
		System.out.println("Record inserted successfully...");
		
		
		/*
		Optional<Player> findById = repository.findById(101);
		if(findById.isPresent()) {
			System.out.println(findById.get());
		}
		*/
		
		/*
		Iterable<Player> findAll = repository.findAll();
		findAll.forEach(player->{
			System.out.println(player);
		});
		*/
		
		/*
		   Iterable<Player> findAllById = repository.findAllById(Arrays.asList(102,107,104));
		   findAllById.forEach(player->{
			   System.out.println(player);
		   });
		   
		  */
		
		/*
		long count = repository.count();
		System.out.println("Total record in database: "+count);
		
		boolean existsById = repository.existsById(101);
		System.out.println("Is record present in table-> "+existsById);
		
		*/
		/*
		repository.delete(p1);
		System.out.println("Record deleted successfully..");
		
		*/
		
		/*
		repository.deleteAll(Arrays.asList(p2,p3));
		System.out.println("Record deleted successfully..");
		
		*/
		
		repository.deleteAllById(Arrays.asList(102,103));
		System.out.println("Record deleted successfully...");	
		
		
	}

}
