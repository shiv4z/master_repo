package in.shiv.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;


//@FeignClient(url ="http:://localhost:8081/welcome")
@FeignClient(name = "WELCOME-API")
public interface WelcomeApiClient {
	
	@GetMapping("/welcome")
	public String invokeWelcomeApi();

}
