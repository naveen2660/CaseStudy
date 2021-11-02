package com.example.cart;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.cart.models.ProductProfile;

public interface productRepo extends  MongoRepository<ProductProfile, String> {

	List<ProductProfile> findAllById(String id);
	//ProductProfile findProductById(String Id);	
}
