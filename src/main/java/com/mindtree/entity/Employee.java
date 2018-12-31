package com.mindtree.entity;

import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Employee {

	@Id	
	int eid;
	String name;
	String email;
	String gender;
	int age;
	
	public Employee()
	{
		super();
	}
	
	public Employee(int eid, String name, String email, String gender, int age) {
		super();
		this.eid=eid;
		this.name = name;
		this.email = email;
		this.gender = gender;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGender() {
		return gender;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", name=" + name + ", email=" + email + ", gender=" + gender + ", age=" + age
				+ "]";
	}
	
	
	
}
