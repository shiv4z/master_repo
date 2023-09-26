package in.shiv.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import in.shiv.binding.Book;

@Controller
public class BookController {
	
	@GetMapping("/")
	public String openForm(Model model) {
		Book bookObj = new Book();
		model.addAttribute("book", bookObj);
		return "index";
	}
	
	@PostMapping("/book")
	public String saveFormData(@Valid Book book, BindingResult br,Model model) {
		if(br.hasErrors()) {
			return "index";
		}
		System.out.println(book);
		model.addAttribute("msg", "Data has been save successfully....");
		return "success";
	}

}
