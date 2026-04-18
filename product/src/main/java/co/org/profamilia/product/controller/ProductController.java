package co.org.profamilia.product.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.org.profamilia.product.entity.Product;
import co.org.profamilia.product.service.IProductService;

@RestController
@RequestMapping("/products")
public class ProductController {

	private static final Logger log = LoggerFactory.getLogger(ProductController.class);

	@Autowired
	private IProductService productService; 
	
	@GetMapping("/{id}")
	public Product getProductById(@PathVariable Long id) {
		log.info("Received request to get product with id: {}", id);
		Product product = productService.getProductById(id);
		if (product != null) {
			log.info("Product found: {}", product.getName());
		} else {
			log.warn("Product with id {} not found", id);
		}
		return product;
	}
}
