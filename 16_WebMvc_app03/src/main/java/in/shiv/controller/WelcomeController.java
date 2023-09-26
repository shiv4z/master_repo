package in.shiv.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WelcomeController {

	@GetMapping("/welcome")
	public ModelAndView welcome() {
		ModelAndView mav = new ModelAndView();
		mav.addObject("msg", "Welcome to SpringBoot and Microservices..");
		mav.setViewName("welcome");
		return mav;
	}
	
	
	@GetMapping("/")
	public ModelAndView index() {
		ModelAndView mav = new ModelAndView();
		mav.addObject("msg", "Welcome to IT Industry..");
		mav.setViewName("index");
		return mav;
	}

}
