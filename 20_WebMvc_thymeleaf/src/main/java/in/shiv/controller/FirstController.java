package in.shiv.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FirstController {
	
	@GetMapping("/")
	public String welcomeMessage(Model model) {
		model.addAttribute("msg", "Welcome to First Thymeleaf Project");
		return "index";
	}

}
