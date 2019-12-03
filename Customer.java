package com.book;

import java.sql.Date;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="customer_details")
public class Customer {
	@Id
	int order_id;
	int quantity;
	String customer_name,address,phone,book_id;
	String order_date;
	public Customer()
	{
		
	}
	public int getOrder_id() {
		return order_id;
	}
	
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getCustomer_name() {
		return customer_name;
	}
	public void setCustomer_name(String customer_name) {
		this.customer_name = customer_name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getBook_id() {
		return book_id;
	}
	public void setBook_id(String book_id) {
		this.book_id = book_id;
	}
	public String getOrder_date() {
		return order_date;
	}
	public void setOrder_date() {
		   DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");  
		   LocalDateTime now = LocalDateTime.now();  
		   order_date=dtf.format(now);  
	}
   public void setOrder_id()
   {
	   order_id=(int) (Math.random()*100);
   }
 
}
