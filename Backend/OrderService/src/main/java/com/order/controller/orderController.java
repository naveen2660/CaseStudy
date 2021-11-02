package com.order.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.order.details.orderDetails;
import com.order.repo.orderRepo;

@RestController
@RequestMapping("/order")
public class orderController {
	 @Autowired
	    private orderRepo orderRepository;

	 
	 
	    @GetMapping(value = "/list")
	    
	    public List<orderDetails> getAlldetails()
	    {
	        return orderRepository.findAll();
	    }
	    
	    
	    @PostMapping(value = "/add")
	    @CrossOrigin(origins="http://localhost:4200")
	    public orderDetails addNewOrder(@RequestBody orderDetails up)
	    {
	        return orderRepository.save(up);
	    }
	    
	    
	    @DeleteMapping(value = "/delete/{orderId}")
	    public String  deleteOrder(@PathVariable String orderId) 
	    {
	        System.out.println("Delete method called");
	        orderRepository.deleteById(orderId);
	        return "orderdeleted";
	    }
	    
	    
	    
	    
	    @PutMapping(value="/update/{orderId}")
	    public orderDetails updateOrder(@RequestBody orderDetails Updated) 
	    {
	    return orderRepository.save(Updated);
        }
	  
}