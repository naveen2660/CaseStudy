package com.example.cart;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
@Document(collection = "Cart1")
public class CartProfile {

@Id
private String id;
private String Total;


public CartProfile() {
	super();
}
    public CartProfile(String id, String total) {
	super();
	this.id = id;
	Total = total;
}
   
	
 public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public String getTotal() {
	return Total;
}
public void setTotal(String total) {
	Total = total;
}
	
}

