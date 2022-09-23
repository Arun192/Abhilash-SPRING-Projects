package in.arun.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import in.arun.dto.Product;
import in.arun.repository.ProductRepo;

@Service
public class ProductService {

	@Autowired
	ProductRepo productRepo;

	//@Transactional(rollbackFor = Exception.class)
	//@Transactional(noRollbackFor = RuntimeException.class)
	@Transactional(propagation = Propagation.REQUIRED)
	public void saveProductInfo() throws Exception {
		// create product

		for (int i = 1; i <= 10; i++) {
			Product product = new Product();

			product.setId(i);
			product.setName("Test Product " + i);

			productRepo.saveProduct(product);

			if (i == 7) {
				throw new RuntimeException("Some Error Occurs");
			}
		}
	}
}
