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

import com.example.demo.User.UserProfile;
import com.example.demo.repo.UserRepo;

class Controller1Test {
	
	@InjectMocks
	Controller1 controller;
	@Mock
	UserRepo userRepo;
	@BeforeEach
	void setup()
	{
		MockitoAnnotations.initMocks(this);
	}
	@Test
	void testGetAllProfiles() {
		List<UserProfile> testUsers=new ArrayList<UserProfile>();
		testUsers.add(new UserProfile());
		when(controller.getAllProfiles()).thenReturn(testUsers);
		List<UserProfile> result = controller.getAllProfiles();
		Assertions.assertNotNull(result);
	}
	@Test
     public void addNewCustomerProfile() {
    	 UserProfile obj=new UserProfile("123","naveen","hello@gmail.com","13214513","15-06-2000","male","lll","1324","nice");
    	 when(userRepo.save(obj)).thenReturn(obj);
    	 assertEquals(obj, controller.addNewCustomerProfile(obj));
     }
}
