package co.org.profamilia.product.service.impl;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import co.org.profamilia.product.entity.Product;
import co.org.profamilia.product.repository.ProductRepository;
import co.org.profamilia.product.service.IProductService;

@Service
public class ProductService implements IProductService {

	private final ProductRepository productRepository;

	@Value("${tax.rate}")
	private Double taxRate;

	public ProductService(ProductRepository productRepository) {
		this.productRepository = productRepository;
	}

	@Override
	public Product getProductById(Long id) {
		Product product = productRepository.findById(id).orElseThrow();
		product.setTax(product.getPrice() * taxRate);
		return product;
	}

}
