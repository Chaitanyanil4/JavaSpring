package com.example.inndataEmp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class empservice {
	@Autowired
	emprepistoriy emprepistoriy;
	
	public List <Employee> getall(){
		return emprepistoriy.findAll();
	}
	
	
	

}
