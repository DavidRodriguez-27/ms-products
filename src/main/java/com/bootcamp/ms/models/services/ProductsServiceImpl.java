package com.bootcamp.ms.models.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bootcamp.ms.models.dao.ProductsDao;
import com.bootcamp.ms.models.documents.Products;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class ProductsServiceImpl implements ProductsService{

	@Autowired
	private ProductsDao dao;
	
	@Override
	public Flux<Products> findAll() {
		return dao.findAll();
	}

	@Override
	public Mono<Products> findById(String id) {
		return dao.findById(id);
	}

	@Override
	public Mono<Products> save(Products Products) {
		return dao.save(Products);
	}

	@Override
	public Mono<Void> delete(Products Products) {
		return dao.delete(Products);
	}


	
}
