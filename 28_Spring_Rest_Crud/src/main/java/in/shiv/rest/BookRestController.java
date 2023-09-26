package in.shiv.rest;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.shiv.entity.Book;
import in.shiv.service.BookService;

@RestController
public class BookRestController {
	private BookService bookService;

	public BookRestController(BookService bookService) {
		this.bookService = bookService;
	}

	@PostMapping("/book")
	public ResponseEntity<String> saveBook(@RequestBody Book book) {
		String message = bookService.upsertData(book);
		return new ResponseEntity<>(message, HttpStatus.CREATED);
	}

	@PutMapping("/book")
	public ResponseEntity<String> updateBook(@RequestBody Book book){
		 String message =bookService.upsertData(book);
		 return new ResponseEntity<>(message, HttpStatus.OK);
	}
	
	@GetMapping("/books")
	public ResponseEntity<List<Book>> findAllBooks(){
		List<Book> bookList = bookService.getAllBooks();
		return new ResponseEntity<>(bookList, HttpStatus.OK);
	}

	@DeleteMapping("/book/{bookId}")
	public ResponseEntity<String> deleteBook(@PathVariable("bookId") Integer bookId){
		String message = bookService.deleteBook(bookId);
		return new ResponseEntity<>(message, HttpStatus.OK);
	}
}
