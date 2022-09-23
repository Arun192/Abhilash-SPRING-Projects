package in.arun;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.arun.config.ProductConfig;
import in.arun.service.ProductService;

public class App {

	public static void main(String[] args) throws Exception {
		
		ConfigurableApplicationContext context= new AnnotationConfigApplicationContext(ProductConfig.class);
		context.registerShutdownHook();
		ProductService productService = context.getBean("productService",ProductService.class);
		productService.saveProductInfo();
		context.close();
	}
}
