package com.coforge.training.crud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.coforge.training.crud.model.Product;
import com.coforge.training.crud.service.ProductService;

@Controller
@RequestMapping("/product")
public class ProductController {
	
	@Autowired
	private ProductService productService;

	@GetMapping("/productform") // Method Level Mapping
	public String showFormForAdd(Model theModel) {
		Product theProduct = new Product();
		theModel.addAttribute("product", theProduct);
		return "product-form"; // Returns view and Customer Object
	}
	
	@PostMapping("/saveProduct")
	public String saveProduct(@ModelAttribute("product") Product theProduct) {
		
		productService.saveProduct(theProduct);
		
		return "redirect:/product/list";
	}
	
	@GetMapping("/list") // @GetMapping - method level , default GET method
	public String listCustomers(ModelMap theModel) {
		List<Product> theProducts = productService.getProducts();
		theModel.addAttribute("products", theProducts);
		return "show-form"; // customers attributes is added to view & returned
	}
	
	@GetMapping("/updateForm")
	public String showFormForUpdate(@RequestParam("productId") int theId, ModelMap theModel) {
		Product theProduct = productService.getProduct(theId);
		theModel.addAttribute("product", theProduct);
		return "update-form";
	}
	
	@GetMapping("/delete")
	public String deleteCustomer(@RequestParam("productId") int theId) {
	productService.deleteProduct(theId);
	return "redirect:/product/list";
	}
}
