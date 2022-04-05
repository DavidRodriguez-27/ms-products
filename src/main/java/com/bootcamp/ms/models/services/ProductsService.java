package com.bootcamp.ms.models.services;

import com.bootcamp.ms.models.documents.Products;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface ProductsService {
	
	public Flux<Products> findAll();
	
	public Mono<Products> findById(String id);
	
	public Mono<Products> save(Products Clientes);
	
	public Mono<Void> delete(Products Clientes);

}
