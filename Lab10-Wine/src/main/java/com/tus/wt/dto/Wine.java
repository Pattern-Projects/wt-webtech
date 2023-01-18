package com.tus.wt.dto;

import java.util.List;

import javax.persistence.*;

@Entity @Table(name="wines")
public class Wine
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
    private Long id;

	@Column(name = "wine_name")
    private String wineName;
	
    public Wine()
    {
    }

    public Wine(String wineName)
    {
        this.wineName = wineName;
    }

    public Long getId()
    {
        return id;
    }

    public void setId(Long id)
    {
        this.id = id;
    }

	public String getWineName() {
		return wineName;
	}

	public void setWineName(String wineName) {
		this.wineName = wineName;
	}
    
    

}
