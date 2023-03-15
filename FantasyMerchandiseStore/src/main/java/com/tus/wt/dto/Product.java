package com.tus.wt.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="products")
public class Product {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String brand;
	private String description;
	private String image;
	private double online;
	private double rrp;
	private String title;
	private String type;
	
	public Product() {
	}
	public Product(Long id, String brand, String description, String image, double online, double rrp, String title,
			String type) {
		super();
		this.id = id;
		this.brand = brand;
		this.description = description;
		this.image = image;
		this.online = online;
		this.rrp = rrp;
		this.title = title;
		this.type = type;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public double getOnline() {
		return online;
	}
	public void setOnline(double online) {
		this.online = online;
	}
	public double getRrp() {
		return rrp;
	}
	public void setRrp(double rrp) {
		this.rrp = rrp;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	
}
