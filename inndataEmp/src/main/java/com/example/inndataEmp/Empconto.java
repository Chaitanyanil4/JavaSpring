package com.example.inndataEmp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Empconto {
	@Autowired
	empservice empservice;
	@GetMapping("/empfindall")
List<Employee>empfindall(){
	return empservice.getall();
}
}
