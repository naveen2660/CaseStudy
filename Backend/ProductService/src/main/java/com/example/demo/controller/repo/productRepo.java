package com.example.demo.controller.repo;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.demo.user.ProductProfile;
public interface productRepo extends  MongoRepository<ProductProfile, String> {
	//ProductProfile findProductById(String Id);	
}
