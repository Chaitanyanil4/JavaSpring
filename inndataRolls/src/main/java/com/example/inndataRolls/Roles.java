package com.example.inndataRolls;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Roles {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	String Role;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getRole() {
		return Role;
	}
	public void setRole(String role) {
		Role = role;
	}
	@Override
	public String toString() {
		return "Roles [id=" + id + ", Role=" + Role + "]";
	}
	


}
