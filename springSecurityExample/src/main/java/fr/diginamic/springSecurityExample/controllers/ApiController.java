/**
 * 
 */
package fr.diginamic.springSecurityExample.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.diginamic.springSecurityExample.models.Product;
import fr.diginamic.springSecurityExample.services.StoreService;

/**
 * @author StephanieMC
 *
 */
@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*")
public class ApiController {
	@Autowired
	StoreService storeService;

	@GetMapping("products")
	public List<Product> getAllProducts() {
		System.out.println("___________GET api/products");
		return storeService.getAllProducts();
	}

}
