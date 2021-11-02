package com.example.demo.controller;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoSettings;

import com.example.demo.controller.repo.productRepo;
import com.example.demo.user.ProductProfile;


class ProductTest {
	@InjectMocks
	Controller1 controller;
	
	@Mock
	productRepo repoProduct;
	
	@BeforeEach
	void setup()
	{
		MockitoAnnotations.initMocks(this);
	}
	@Test
	void testGetAllProducts() {
		List<ProductProfile> testUsers=new ArrayList<ProductProfile>();
		testUsers.add(new ProductProfile());
		when(controller.getAllProducts()).thenReturn(testUsers);
		List<ProductProfile> result = controller.getAllProducts();
		Assertions.assertNotNull(result);
	}

}
