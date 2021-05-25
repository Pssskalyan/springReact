package com.pavan.frontend.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Id;

@Entity
@Table(name="studentInfo")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long regno;
	private String firstName;
	private String lastName;
	private String Dept;
	private String email;
	
	public User( ) {
		//default constructor
	}
	public long getRegno() {
		return regno;
	}
	public void setRegno(long regno) {
		this.regno = regno;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getDept() {
		return Dept;
	}
	public void setDept(String dept) {
		Dept = dept;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public User(String firstName, String lastName, String dept, String email) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		Dept = dept;
		this.email = email;
	}
	
	
	

}
