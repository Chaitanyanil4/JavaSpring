package com.example.inndata;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface inndatajaprepistory extends JpaRepository<CompanyEntity,Integer> {

}
