package in.shiv.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FirstController {
	
	@GetMapping("/")
	public ModelAndView home() {
		ModelAndView mav = new ModelAndView();
		
		mav.addObject("msg", "Welcome to Developments ..!!");
		mav.setViewName("index");
		return mav;
	}

}
