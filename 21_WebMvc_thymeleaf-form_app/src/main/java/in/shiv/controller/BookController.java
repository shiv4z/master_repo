package in.shiv.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import in.shiv.binding.Book;

@Controller
public class BookController {
	
	@GetMapping("/")
	public String openBookForm(Model model) {
		Book bookObj = new Book();
		model.addAttribute("book", bookObj);
		return "index";
	}
	
	@PostMapping("/book")
	public String saveBookDetails(Book book, Model model) {
		System.out.println(book);
		model.addAttribute("msg", "Book Details has been saved successfully..");
		return "success";
	}

}
