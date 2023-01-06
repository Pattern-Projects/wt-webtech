package com.tus.webtech;

public class Person {
	private String firstName;
	private String lastName;
	private int age;
	
	public Person() {}

	public Person(String fn, String ln, int a) {
		this.firstName = fn;
		this.lastName = ln;
		this.age = a;
	}
	
	public String getFirstName() {return this.firstName;}
	public String getLastName() {return this.lastName;}
	public int getAge() {return this.age;}
	
	public void setFirstName(String fn) {this.firstName = fn;}
	public void setLastName(String ln) {this.lastName = ln;}
	public void setAge(int a) {this.age = a;}
	
}
