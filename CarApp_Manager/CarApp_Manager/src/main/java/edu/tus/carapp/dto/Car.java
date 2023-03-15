package edu.tus.carapp.dto;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
@Table(name="cars")

public class Car {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private Long id;

	private String make;
	private String model;
	private int year;
	@Size(min=3) //the name has a minimum size of 3 (validation)
	private String color;
	private double litre;
	private int mileage;
	private int price;
	private String image;
	private String cond;
	private String seller;
	
	public Car() {
}
	public Car(Long id, String make, String model, int year, String color, double litre, int mileage, int price, String image, String cond, String seller) {
}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public double getLitre() {
		return litre;
	}
	public void setLitre(double litre) {
		this.litre = litre;
	}
	public int getMileage() {
		return mileage;
	}
	public void setMileage(int mileage) {
		this.mileage = mileage;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getCond() {
		return cond;
	}
	public void setCond(String cond) {
		this.cond = cond;
	}
	public String getSeller() {
		return seller;
	}
	public void setSeller(String seller) {
		this.seller = seller;
	}
	@Override
	public String toString() {
		return "Car [id=" + id + ", make=" + make + ", model=" + model + ", year=" + year + ", color=" + color
				+ ", litre=" + litre + ", mileage=" + mileage + ", price=" + price + ", image=" + image + ", cond="
				+ cond + ", seller=" + seller + "]";
	}
	}
