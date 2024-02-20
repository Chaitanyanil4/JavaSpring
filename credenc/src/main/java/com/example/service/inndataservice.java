package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examle.jparepository.jparepository;
import com.example.entity.inndata;

import jakarta.persistence.EntityNotFoundException;

@Service
public class inndataservice {
	@Autowired
	jparepository jparepository;
	
	public List<inndata>getall(){
		return jparepository.findAll();
		
	}
	public inndata insertinndata(inndata inndata) {
		return jparepository.save(inndata);
	}
    public inndata getbyid(int id) {
	 try {
         return jparepository.findById(id).orElseThrow(()->new EntityNotFoundException("entitynot found "));
     } catch (EntityNotFoundException e) {
        throw new EntityNotFoundException("Entity with ID " + id + " not found");
     }
    }
    
    public inndata updatebyid(int id,inndata inndata) {
   inndata s=  jparepository.findById(id).orElseThrow(()->new EntityNotFoundException("Id not found"));
     s.setName(inndata.getName());
     s.setAddress(inndata.getAddress());
     s.setRole(inndata.getRole());
     s.setSalary(inndata.getSalary());
     jparepository.save(s);
     return s;
    	
    }

}
