package com.tus.wt.dto;

import java.util.List;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity @Table(name="wine")
public class Wine
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
    private Long id;
	
	private int year;
	
	@Size(min=3)
	private String name;
	private String grapes;
	private String country;
	private String region;
	
	@Lob
	private String description;
	private String picture;
	
    public Wine()
    {
    }


    public Wine(Long id, int year, @Size(min = 3) String name, String grapes, String country, String region,
			String description, String picture) {
		super();
		this.id = id;
		this.year = year;
		this.name = name;
		this.grapes = grapes;
		this.country = country;
		this.region = region;
		this.description = description;
		this.picture = picture;
	}


	public Long getId()
    {
        return id;
    }

    public void setId(Long id)
    {
        this.id = id;
    }

    

	public int getYear() {
		return year;
	}


	public void setYear(int year) {
		this.year = year;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getGrapes() {
		return grapes;
	}


	public void setGrapes(String grapes) {
		this.grapes = grapes;
	}


	public String getCountry() {
		return country;
	}


	public void setCountry(String country) {
		this.country = country;
	}


	public String getRegion() {
		return region;
	}


	public void setRegion(String region) {
		this.region = region;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public String getPicture() {
		return picture;
	}


	public void setPicture(String picture) {
		this.picture = picture;
	}


	@Override
	public String toString() {
		return "Wine [id=" + id + ", year=" + year + ", name=" + name + ", grapes=" + grapes + ", country=" + country
				+ ", region=" + region + ", description=" + description + ", picture=" + picture + "]";
	}

    
    

}
