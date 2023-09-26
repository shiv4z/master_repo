package in.shiv.client;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import in.shiv.binding.Book;
import reactor.core.Disposable;

@Service
public class RestClient {

	public void invokeBook() {
		String aplUri = "http://localhost:8080/books";

		WebClient webClient = WebClient.create();
		String response = webClient.get()
				.uri(aplUri)
				.retrieve()
				.bodyToMono(String.class)
				.block();

		System.out.println(response);
	}

	public void getInvokeNew() {
		String apiUrl = "http://localhost:8080/books";

		WebClient webClient = WebClient.create();
		Book[] block = webClient.get()
				.uri(apiUrl)
				.retrieve()
				.bodyToMono(Book[].class)
				.block();
		for (Book q : block) {
			System.out.println(q);
		}
	}
	
	public void handlePostReq() {
		String apiUrl = "http://localhost:8080/book";
		
		Book book = new Book();
		book.setBookName("AWS");
		book.setBookPrice(350.0);
		
		WebClient webClient = WebClient.create();
		String block = webClient.post()
			.uri(apiUrl)
			.bodyValue(book)
			.retrieve()
			.bodyToMono(String.class)
			.block();
		System.out.println(block);
	}
	
	public void getAsyCall() {
		String apiUrl = "http://localhost:8080/books";
		WebClient webClient = WebClient.create();
		 webClient.get()
		         .uri(apiUrl)
		         .retrieve()
		         .bodyToMono(Book[].class)
		         .subscribe(RestClient::handleResponse);
		System.out.println("Asynchronous communication...");
	}
	
	public static void handleResponse(Book[] book) {
		for(Book b: book) {
			System.out.println(b);
		}
		
	}
}
