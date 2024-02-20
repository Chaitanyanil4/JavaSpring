package com.example.inndataRolls;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class rolesservice {
	@Autowired
	rolesrapistory rolesrapistory;
	
	 public List<Roles>getall(){
		 return rolesrapistory.findAll();
	 }

}
