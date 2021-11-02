package com.example.demo.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.User.UserProfile;
import com.example.demo.repo.UserRepo;

import java.util.List;
@RestController
@RequestMapping("/profile1")
public class Controller1 {
	 @Autowired
	    private UserRepo profileRepository;

	    @GetMapping(value = "/list")
	    public List<UserProfile> getAllProfiles(){
	        return profileRepository.findAll();
	    }
	    @PostMapping(value = "/add")
	    public UserProfile addNewCustomerProfile(@RequestBody UserProfile up){
	        return profileRepository.save(up);
	    }
	    @DeleteMapping(value = "/delete/{profileID}")
	    public void deleteProfile(@PathVariable String profileID) {
	        System.out.println("Delete method called");
	        profileRepository.deleteById(profileID);
	    }
//	    @PutMapping(value="/update/{id}")
//	    public UserProfile updateProfile(@PathVariable UserProfile id) {
//	    	return profileRepository.save(id);
//	    }
	    @PutMapping(value = "/update/{profileID}")
	    public String updateUser(@RequestBody UserProfile userProfile, @PathVariable String profileID){
	        profileRepository.save(userProfile);
	        return "user is Updated Succesfully";
	    }
}
