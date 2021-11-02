package com.order.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.order.details.orderDetails;



public interface orderRepo extends  MongoRepository<orderDetails, String> {

}