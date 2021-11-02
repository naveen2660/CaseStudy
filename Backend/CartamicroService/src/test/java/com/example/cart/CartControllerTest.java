package com.example.cart;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.cart.models.ProductProfile;


@RunWith(SpringRunner.class)
@SpringBootTest
class CartControllerTest {
	
	
	@Autowired
	CartController cartController;
	@Mock
	productRepo RepoProduct;
	@MockBean
	CartRepo cartRepo;
	@BeforeEach
	void setup()
	{
		MockitoAnnotations.initMocks(this);
	}
//	@BeforeEach
//	void setup1()
//	{
//		MockitoAnnotations.initMocks(this);
//	}
	@Test
	void testGetAll() {
//		
//			List<ProductProfile> testUsers=new ArrayList<ProductProfile>();
//			testUsers.add(new ProductProfile());
//			when(cartController.getAll()).thenReturn(testUsers);
//			List<ProductProfile> result = cartController.getAll();
//			Assertions.assertNotNull(result);
//		when(RepoProduct.findAll()).thenReturn(Stream.of("123","electronics","bluetooth","electronics","1200","nice").collect(Collectors.toList()));
	when(cartRepo.findAll()).thenReturn((List<CartProfile>) Stream.of(new CartProfile("123","5")).collect(Collectors.toList()));
	assertEquals(cartController, cartController.getAll());
		
//			List<CartProfile> users = new ArrayList();
//			users.add(new CartProfile());
//			given(cartRepo.findAll()).willReturn(users);
//			List<CartProfile> expected = listUserService.listAllUsers();
//			assertEquals(expected, users);
//			verify(userRepository).findAll();
			}
		}
	


