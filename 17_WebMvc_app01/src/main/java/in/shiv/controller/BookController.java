package in.shiv.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import in.shiv.binding.Book;

@Controller
public class BookController {

	@GetMapping("/book")
	@ResponseBody
	public Book book() {
		Book bookObj = new Book();
		bookObj.setBookId(100);
		bookObj.setBookName("English");
		bookObj.setBookPrice(400.0);
		return bookObj;
	}

	@GetMapping("data")
	public String bookData(Model model) {
		Book b1 = new Book(101, "HC Verma", 500.0);
		model.addAttribute("book", b1);
		return "book";
	}

	@GetMapping("bookList")
	public String bookListData(Model model) {
		Book b1 = new Book(101, "HC Verma", 500.0);
		Book b2 = new Book(102, "RD Sharma", 400.0);
		Book b3 = new Book(103, "Nitin", 800.0);
		List<Book> list = Arrays.asList(b1, b2, b3);
		model.addAttribute("bookList", list);
		return "home";
	}

}
