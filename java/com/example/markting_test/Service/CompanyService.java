package com.example.markting_test.Service;

import com.example.markting_test.DTOs.CompanyDTO;
import com.example.markting_test.Model.Company;
import com.example.markting_test.Repository.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.*;

import java.util.ArrayList;
import java.util.List;

@Service
public class CompanyService {

    @Autowired
    private CompanyRepository companyRepository;

    public Company createCompany(Company company) {
        return companyRepository.save(company);
    }


    public List<Company> getAllCompanies() {
        return companyRepository.findAll();
    }


    public CompanyDTO getCompanyById(Integer Company_id) {

       Company com = companyRepository.findCompanyById(Company_id);
       if (com == null) {
           throw new RuntimeException("Company not found");
       }

        CompanyDTO companyDTO = new CompanyDTO(com.getCompany_name(), com.getCompany_email(), com.getCompany_phone(), com.getCompany_CR());

        return companyDTO;
    }


    public Company updateCompany(Company updatedCompany) {

        Company existingCompany = companyRepository.findCompanyById(updatedCompany.getId());
        if (existingCompany == null) {
            throw new RuntimeException("Company not found with id: ");
        }

        existingCompany.setCompany_name(updatedCompany.getCompany_name());
        existingCompany.setCompany_email(updatedCompany.getCompany_email());
        existingCompany.setCompany_phone(updatedCompany.getCompany_phone());
        existingCompany.setCompany_CR(updatedCompany.getCompany_CR());

        return companyRepository.save(existingCompany);
    }


    public void deleteCompany(Integer Company_id) {
        Company company = companyRepository.findCompanyById(Company_id);
        companyRepository.delete(company);
    }


    public List<CompanyDTO> getCompaniesDTos() {
        List<Company> companies = companyRepository.findAll();

        List<CompanyDTO> companiesDTos = new ArrayList<>();

        for (Company com : companies) {
            CompanyDTO companyDTO = new CompanyDTO(com.getCompany_name(), com.getCompany_email(), com.getCompany_phone(), com.getCompany_CR());
            companiesDTos.add(companyDTO);
        }

        return companiesDTos;
    }
}
