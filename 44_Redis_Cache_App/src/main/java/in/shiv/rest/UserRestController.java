package in.shiv.rest;

import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserRestController {

	private RedisTemplate<String, String> redisTemplate;
	private HashOperations<String, String, String> hashOps;

	public UserRestController(RedisTemplate<String, String> redisTemplate) {
		this.redisTemplate = redisTemplate;
		hashOps = redisTemplate.opsForHash();
	}
	
	@PostMapping("/store")
	public ResponseEntity<String> storeData() {
		hashOps.put("USER", "11", "Shiv Prasad");
		return new ResponseEntity<>("SuccessFully Stored", HttpStatus.CREATED);
	}

	@GetMapping("/data/{key}")
	public String getData(@PathVariable String key){
		String data= (String) hashOps.get("USER", key);
		return data;
	}
}
