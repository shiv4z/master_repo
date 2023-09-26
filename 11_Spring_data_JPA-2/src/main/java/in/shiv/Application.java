package in.shiv;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.shiv.entity.Player;
import in.shiv.repo.PlayerRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		PlayerRepository bean = context.getBean(PlayerRepository.class);
		Player player=new Player();
		player.setPlayerId(102);
		player.setPlayerName("Sachin");
		player.setPlayerAge(48);
		player.setLocation("Maharashtra");
		
		bean.save(player);
		
		System.out.println("Record successfully inserted..");
		
	}

}
