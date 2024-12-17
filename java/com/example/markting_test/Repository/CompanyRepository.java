package com.example.markting_test.Repository;


import com.example.markting_test.Model.Company;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface CompanyRepository extends JpaRepository<Company, Integer> {

    Company  findCompanyById(Integer id);


}
