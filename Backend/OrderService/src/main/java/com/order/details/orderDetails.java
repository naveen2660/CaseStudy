package com.order.details;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
@Document(collection = "orders")
public class orderDetails{
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getFullname() {
		return fullname;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	public String getNameoncard() {
		return nameoncard;
	}
	public void setNameoncard(String nameoncard) {
		this.nameoncard = nameoncard;
	}
	public String getCreditcardnumber() {
		return creditcardnumber;
	}
	public void setCreditcardnumber(String creditcardnumber) {
		this.creditcardnumber = creditcardnumber;
	}
	public String getExpmonth() {
		return expmonth;
	}
	public void setExpmonth(String expmonth) {
		this.expmonth = expmonth;
	}
	public String getExpyear() {
		return expyear;
	}
	public void setExpyear(String expyear) {
		this.expyear = expyear;
	}
	public String getCvv() {
		return cvv;
	}
	public void setCvv(String cvv) {
		this.cvv = cvv;
	}
	
	public orderDetails(String id,String fullname, String email, String address, String city, String state, String zip,
			String nameoncard, String creditcardnumber, String expmonth, String expyear, String cvv) {
		super();
		this.id = id;
		this.fullname = fullname;
		this.email = email;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.nameoncard = nameoncard;
		this.creditcardnumber = creditcardnumber;
		this.expmonth = expmonth;
		this.expyear = expyear;
		this.cvv = cvv;
	}
	
	public orderDetails() {
		super();
	}
	
	
	@Id
	private String id;
	private String fullname;
	private String email;
    private String address;
    private String city;
    private String state;
    private String zip;
    private String nameoncard;
    private String creditcardnumber;
    private String expmonth;
    private String expyear;
    private String cvv;
}
    
