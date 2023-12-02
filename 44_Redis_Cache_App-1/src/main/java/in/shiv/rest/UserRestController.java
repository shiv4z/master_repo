package in.shiv.rest;

import java.util.List;

import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import in.shiv.binding.User;

@RestController
public class UserRestController {

	private HashOperations<String, Object, User> haspOps;

	public UserRestController(RedisTemplate<String, User> redisTemplate) {
		haspOps = redisTemplate.opsForHash();

	}

	@PostMapping("/store")
	public ResponseEntity<String> store(@RequestBody User user) {
		haspOps.put("USERS", user.getUid(), user);
		return new ResponseEntity<>("Saved successfully", HttpStatus.CREATED);
	}

	@GetMapping("/user/{uid}")
	public ResponseEntity<User> getUser(@PathVariable Integer uid) {
		User user = (User) haspOps.get("USERS", uid);
		return new ResponseEntity<User>(user, HttpStatus.OK);
	}

	@GetMapping("/users")
	public ResponseEntity<List<User>> fetchAll() {
		 List<User> values = haspOps.values("USERS");
		return new ResponseEntity<List<User>>(values, HttpStatus.OK);
	}
	
	@DeleteMapping("/user/{uid}")
	public ResponseEntity<String> deleteUser(@PathVariable Integer uid){
		haspOps.delete("USERS", uid);
		return new ResponseEntity<String>("User deleted successfully", HttpStatus.OK);
	}

}
