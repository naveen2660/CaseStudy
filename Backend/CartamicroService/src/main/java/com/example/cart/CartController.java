package com.example.cart;


import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.cart.models.ProductProfile;

@RestController
@RequestMapping("/cart")
public class CartController {
	@Autowired
	 RestTemplate restTemplate;
	 private productRepo productRepository;
	 
	 @RequestMapping(value = "/list")
    public List<ProductProfile> getAll(){
        return Arrays.asList(restTemplate.getForObject("http://product1/product1/all",ProductProfile[].class));
    }

	    @RequestMapping(value = "/all")
	    public  String addCoupon(@RequestBody ProductProfile pf){
	        return  restTemplate.postForObject("http://local/product/all",pf,String.class);
	    }

}
