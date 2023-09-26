package in.shiv.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GreetController {
	@GetMapping("/greet")
	public String greet(Model model) {
		model.addAttribute("msg", "Good Night...!!");
		return "greet";
	}

}
