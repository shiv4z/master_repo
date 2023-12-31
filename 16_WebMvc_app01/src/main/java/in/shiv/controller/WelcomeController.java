package in.shiv.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WelcomeController {
	
	@GetMapping("/welcome")
	public ModelAndView getWelcomeMessage() {
		ModelAndView mav = new ModelAndView();
		mav.addObject("msg", "Welcome to the first web MVC project..!!");
		mav.setViewName("index");
		return mav;
	}

}
