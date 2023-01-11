package com.tus.jpa.dto;


import java.util.List;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.tus.jpa.dto.Module;

@Entity @Table(name="modules")
public class Module
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
    private Long id;

	@Column(name = "module_name")
    private String moduleName;

	@Column(name = "credits")
    private int credits;

	@JsonIgnore
    @ManyToMany(mappedBy = "modules")
    private List<Course> courses;
    
	public Module()
    {
    }

    public Module(String moduleName, int credits)
    {
        this.moduleName = moduleName;
        this.credits = credits;
    }

    public Long getId()
    {
        return id;
    }

    public void setId(Long id)
    {
        this.id = id;
    }

    public String getModuleName()
    {
        return moduleName;
    }

    public void setModuleName(String moduleName)
    {
        this.moduleName = moduleName;
    }

    public int getCredits()
    {
        return credits;
    }

    public void setCredits(int credits)
    {
        this.credits = credits;
    }

    public List<Course> getCourses() {
		return courses;
	}

	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}

}
