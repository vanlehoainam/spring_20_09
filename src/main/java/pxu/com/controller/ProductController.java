package pxu.com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import pxu.com.entity.Producttype;
import pxu.com.service.ProducttypeService;

@Controller
@RequestMapping("/product")
public class ProductController {

	@Autowired
	private ProducttypeService producttypeService;

	@GetMapping("/listproduct")
	public String listproduct(Model model) {
		List<Producttype> products = producttypeService.fimAll();
		model.addAttribute("products", products);
		return "listproduct";
	}

}
