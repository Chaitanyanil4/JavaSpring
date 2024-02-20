package com.example.inndata.openfineclint;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.inndata.Employee;

@FeignClient(value = "item-service", url = "http://localhost:8081")
public interface Fineclint {
    
    @GetMapping("/empfindall")
    public List<Employee> getInndataEmp();
}
