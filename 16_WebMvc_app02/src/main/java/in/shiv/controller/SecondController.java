package in.shiv.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SecondController {
	
	@GetMapping("/wish")
	public ModelAndView wish() {
		ModelAndView mav= new ModelAndView();
		mav.addObject("msg", "Hi! Good Night...!!");
		mav.setViewName("wish");
		return mav;
	}
	
	@GetMapping("/welcome")
	public ModelAndView welcome() {
		ModelAndView mav = new ModelAndView();
		mav.addObject("msg", "Welcome to SpringBoot And MicroServices..!!");
		mav.setViewName("welcome");
		return mav;
	}
	
	@GetMapping("/greet")
	public ModelAndView greet() {
		ModelAndView mav=new ModelAndView();
		mav.addObject("msg", "Thanks for visiting us..!!");
		mav.setViewName("greet");
		return mav;
	}
	
	
	

}
