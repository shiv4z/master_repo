package in.shiv.client;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class RestClient {
	
	public void getAllBooks() {
		String url = "http://localhost:8080/books";
		RestTemplate rs = new RestTemplate();
		 ResponseEntity<String> forEntity = rs.getForEntity(url, String.class);
		System.out.println(forEntity);
	}

}
