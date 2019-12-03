package com.book;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="images")

public class Images {
	@Id
	String Book_Id;
	String image;
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getBook_Id() {
		return Book_Id;
	}
	public void setBook_Id(String book_Id) {
		Book_Id = book_Id;
	}

}
