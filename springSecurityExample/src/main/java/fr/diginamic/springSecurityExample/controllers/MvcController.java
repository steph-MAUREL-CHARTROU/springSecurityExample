/**
 * 
 */
package fr.diginamic.springSecurityExample.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import fr.diginamic.springSecurityExample.models.Product;
import fr.diginamic.springSecurityExample.services.StoreService;

/**
 * @author StephanieMC
 *
 */
@Controller
public class MvcController {
	@Autowired
	StoreService storeService;

	@GetMapping("/products")
	public String getProducts(Model model) {
		model.addAttribute("products", storeService.getAllProducts());
		return "products"; // templates/products.html
	}

	@PostMapping("/products")
	public String create(Model model, Product newProduct) {
		storeService.addProduct(newProduct);
		model.addAttribute("products", storeService.getAllProducts());
		return "products";
	}

}
