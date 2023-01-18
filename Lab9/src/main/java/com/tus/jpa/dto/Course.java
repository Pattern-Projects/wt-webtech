package com.tus.jpa.dto;

import java.util.List;

import javax.persistence.*;

@Entity @Table(name="courses")
public class Course
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
    private Long id;

	@Column(name = "course_name")
    private String courseName;
	
	@Column(name = "department")
    private String department;

    @OneToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "course_modules",
			joinColumns = @JoinColumn(name = "course_id"),
			inverseJoinColumns = @JoinColumn(name = "module_id"))
    private List<Module> modules;

    public Course()
    {
    }

    public Course(String courseName, String department)
    {
        this.courseName = courseName;
        this.department = department;
    }

    public Long getId()
    {
        return id;
    }

    public void setId(Long id)
    {
        this.id = id;
    }

    public String getCourseName()
    {
        return courseName;
    }

    public void setCourseName(String courseName)
    {
        this.courseName = courseName;
    }

    public String getDepartment()
    {
        return department;
    }

    public void setDepartment(String department)
    {
        this.department = department;
    }

    public List<Module> getModules()
    {
        return modules;
    }

    public void setModules(List<Module> modules)
    {
        this.modules = modules;
    }
}
