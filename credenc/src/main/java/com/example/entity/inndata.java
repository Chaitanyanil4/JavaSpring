package com.example.entity;

import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
public class inndata {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private	int id;
	private	String name;
	private String address;
	private double salary;
	private String role;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public inndata(int id, String name, String address, double salary, String role) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.salary = salary;
		this.role = role;
	}
	public inndata() {
		super();
	}
	

}
