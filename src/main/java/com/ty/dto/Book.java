package com.ty.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table
public class Book {

	@Id
	private int id;
	private String name;
	private int price;
	
	@OneToOne
	private Biography bio;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Biography getBio() {
		return bio;
	}

	public void setBio(Biography bio) {
		this.bio = bio;
	}
	
	
}
