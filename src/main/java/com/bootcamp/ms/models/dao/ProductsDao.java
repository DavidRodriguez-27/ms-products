package com.bootcamp.ms.models.dao;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import com.bootcamp.ms.models.documents.Products;

public interface ProductsDao extends ReactiveMongoRepository<Products, String>{

}
