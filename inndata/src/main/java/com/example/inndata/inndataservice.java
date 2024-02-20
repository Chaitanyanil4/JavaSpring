package com.example.inndata;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.apache.el.stream.Optional;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.http.ResponseEntity;


import com.example.inndata.openfineclint.Fineclint;

@Service
public class inndataservice {
    @Autowired
    inndatajaprepistory inndatajaprepistory;
    @Autowired
    ModelMapper mapper;
    @Autowired
    Fineclint fineclint;

    public List<companydetails> getAll() {
        List<CompanyEntity> companyEntities = inndatajaprepistory.findAll();
        List<Employee> employees = fineclint.getInndataEmp();
        List<companydetails> companyDetailsList = new ArrayList<>();
        for (CompanyEntity entity : companyEntities) {
            companydetails details = mapper.map(entity, companydetails.class);
            companyDetailsList.add(details);
            details.setEmployees(employees); 
          
        }              
        return companyDetailsList;
    }

//
//    public List<companydetails> alldetailes() {
//        List<CompanyEntity> emp = inndatajaprepistory.findAll();
//        List<Employee> employee = (List<Employee>) fineclint.getinndataemp();
//        List<companydetails> emprespoc = emp.stream()
//                .map(entity -> {
//                    companydetails details = mapper.map(entity, companydetails.class);
//                    details.setCompanydetails(employee.toString());
//                    return details;
//                })
//                .collect(Collectors.toList());
//        return emprespoc;
//    }

}
