package com.tus.wt.dto;

import java.util.List;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity @Table(name="wines")
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


	@Override
	public String toString() {
		return "Wine [id=" + id + ", year=" + year + ", name=" + name + ", grapes=" + grapes + ", country=" + country
				+ ", region=" + region + ", description=" + description + ", picture=" + picture + "]";
	}

    
    

}
