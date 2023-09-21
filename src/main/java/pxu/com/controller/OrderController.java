package pxu.com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import pxu.com.entity.Orderr;
import pxu.com.entity.Product;
import pxu.com.service.OrderrService;

@Controller
@RequestMapping("/order")
public class OrderController {

	@Autowired
	private OrderrService orderrService;


	@GetMapping("/listorder")
	public String listproduct(Model model) {
		List<Orderr> orderrs = orderrService.fimAll();
		model.addAttribute("orderrs", orderrs);
		return "listorder";
	}

}
