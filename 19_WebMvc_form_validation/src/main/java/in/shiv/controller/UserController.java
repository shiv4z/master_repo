package in.shiv.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import in.shiv.binding.User;

@Controller
public class UserController {
	
	@GetMapping("/")
	public String openIndexForm(Model model) {
		User userObj = new User();
		model.addAttribute("user", userObj);
		return "index";
	}
	
	@PostMapping("/user")
	public String handleSubmitRequest(@Valid User user,BindingResult br,Model model) {
		if(br.hasErrors()) {
			return "index";
		}
		System.out.println(user);
		model.addAttribute("msg", "Details has been printed on console successfully...");
		return "success";
	}

}
