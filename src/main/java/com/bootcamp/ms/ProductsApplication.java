package com.bootcamp.ms;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.core.ReactiveMongoTemplate;

import com.bootcamp.ms.models.documents.Products;
import com.bootcamp.ms.models.services.ProductsService;

import reactor.core.publisher.Flux;

@SpringBootApplication
public class ProductsApplication  {

	@Autowired
	private ProductsService service;
	
	@Autowired
	private ReactiveMongoTemplate mongoTemplate;
	
	private static final Logger log = LoggerFactory.getLogger(ProductsApplication.class);
	
	public static void main(String[] args) {
		SpringApplication.run(ProductsApplication.class, args);
	}
	
	

	/*@Override
	public void run(String... args) throws Exception {
		mongoTemplate.dropCollection("productos").subscribe();
		
		
				Flux.just(new Productos("Jose Da", "","", ""),
						new Productos("Jose Da", "","", ""),
						new Productos("Jose Da", "","", ""),
						new Productos("Jose Da", "","", ""),
						new Productos("Jose Da", "","", ""),
						new Productos("Jose Da", "","", ""),
						new Productos("Jose Da", "","", ""),
						new Productos("Jose Da", "","", ""),
						new Productos("Jose Da", "","", "")
						)
				.flatMap(clientes -> {
					clientes.setCreateAt(new Date());
					return service.save(clientes);
					})
		
		.subscribe(clientes -> log.info("Insert: " + clientes.getId() + " " + clientes.getNombres()));
		
	}*/

}
