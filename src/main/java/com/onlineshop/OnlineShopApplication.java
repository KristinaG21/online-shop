package com.onlineshop;

import com.onlineshop.Item.Products;
import com.onlineshop.ProductRepository.ProductRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class OnlineShopApplication {

	public static void main(String[] args) {
		SpringApplication.run(OnlineShopApplication.class, args);
	}

	private static final Logger log = LoggerFactory.getLogger(OnlineShopApplication.class);


	@Bean
	public CommandLineRunner runner(ProductRepository repository) {
		return (args) -> {
			repository.save(new Products("SIM", 35.00,"www.sim.com"));
			repository.save(new Products("Apple Phone", 1200.00,"www.apple.com"));
			repository.save(new Products("Apple Watch", 450.00,"www.apple.com"));


			repository.findAll().forEach(products -> {
				log.info("Products: {}", products);
			});
		};
	}

}


