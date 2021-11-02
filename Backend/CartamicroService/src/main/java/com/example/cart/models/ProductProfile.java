package com.example.cart.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection="productProfile")
public class ProductProfile {
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@Id
	private String id;
	private String type;
	private String name;
	private String category;
	private String price;
	private String description;
	public ProductProfile(String id, String type, String name, String category, String price, String description) {
		super();
		this.id = id;
		this.type = type;
		this.name = name;
		this.category = category;
		this.price = price;
		this.description = description;
	}
    public ProductProfile() {
		super();
	}

   
}
