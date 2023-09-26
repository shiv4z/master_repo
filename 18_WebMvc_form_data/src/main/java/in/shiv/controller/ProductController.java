package in.shiv.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import in.shiv.binding.Product;

@Controller
public class ProductController {
	
	@GetMapping("/")
	public String openProductForm(Model model) {
		Product product = new Product();
		model.addAttribute("product", product);
		return "product";
	}

	@PostMapping("/product")
	public String getFormData(Product product, Model model) {
		System.out.println(product);
		model.addAttribute("msg", "Form data has been captured successfully....");
		return "success";
		
	}
}
