package com.example.demo.user;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
@Document(collection = "products")
public class ProductProfile {
	public ProductProfile(String id, String title, String image, String category, String price, String description,
			String rating) {
		super();
		this.id = id;
		this.title = title;
		this.image = image;
		this.category = category;
		this.price = price;
		this.description = description;
		this.rating = rating;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
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
	public String getRating() {
		return rating;
	}
	public void setRating(String rating) {
		this.rating = rating;
	}
	
	public ProductProfile() {
		super();
	}
	@Id
	private String id;
	private String title;
    private String image;
    private String category;
    private String price;
    private String description;
    private String rating;
    
}

