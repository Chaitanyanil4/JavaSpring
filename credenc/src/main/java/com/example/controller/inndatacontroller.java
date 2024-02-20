package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.inndata;
import com.example.service.inndataservice;

@RestController

public class inndatacontroller {
	@Autowired
	inndataservice inndataservice ;
	
    @GetMapping("/all")
    public ResponseEntity<List<inndata>> findAll() {
    	List<inndata> l=inndataservice.getall();
        return ResponseEntity.ok(l);
    }
    @PostMapping("/insert")
    public inndata insert(@RequestBody inndata inndata) {
		return inndataservice.insertinndata(inndata);
    }
    @GetMapping("/getbyid/{id}")
    public inndata getbyid(@PathVariable int id) {
		return inndataservice.getbyid(id);
    	
    }
    @PutMapping("/updatebyid/{id}")
    public inndata updatebyid(@PathVariable int id,@RequestBody inndata inndata) {
    return	inndataservice.updatebyid(id, inndata);
    	
    }
}
