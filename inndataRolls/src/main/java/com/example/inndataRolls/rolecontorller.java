package com.example.inndataRolls;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class rolecontorller {
	@Autowired
	rolesservice rolesservice;
	@GetMapping("/rolefindeall")
	List<Roles> rolefindeall(){
		return rolesservice.getall();	
	}

}
