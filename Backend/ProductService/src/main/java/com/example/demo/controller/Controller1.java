

package com.example.demo.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.controller.repo.productRepo;
import com.example.demo.user.ProductProfile;

import java.util.List;
@RestController
@RequestMapping("/product1")
public class Controller1 {
	 @Autowired
	    private productRepo productRepository;
	 	@CrossOrigin(origins="http://localhost:4200")
	    @GetMapping(value = "/all")
	    public List<ProductProfile> getAllProducts(){
	        return productRepository.findAll();
	    }
	    @PostMapping(value = "/adding")
	    public ProductProfile addNewCustomerProfile(@RequestBody ProductProfile up){
	        return productRepository.save(up);
	    }
	    @DeleteMapping(value = "/delete/{productID}")
	    public void deleteProduct(@PathVariable String productID) {
	        System.out.println("Delete method called");
	        productRepository.deleteById(productID);
	    }
	    @PutMapping(value = "/update/{productID}")
	    public String updateUser(@RequestBody ProductProfile productProfile, @PathVariable String productID){
	        productRepository.save(productProfile);
	        return "user is Updated Succesfully";
	    }
}