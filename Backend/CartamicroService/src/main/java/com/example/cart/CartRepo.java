package com.example.cart;

import org.springframework.data.mongodb.repository.MongoRepository;



public interface CartRepo extends  MongoRepository<CartProfile, String> {
	CartProfile findProductById(String Id);	


}
