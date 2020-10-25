package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SearchingFacade {
    @Autowired
    private CompanyDao companyDao;
    @Autowired
    private EmployeeDao employeeDao;

    private static final Logger LOGGER = LoggerFactory.getLogger(SearchingFacade.class);

    public List<Company> searchCompaniesName(String fragment) throws SearchException {
        LOGGER.info("The search for the company name with the letters: " + fragment + "has started");
        List<Company> resultCompanies = companyDao.retrieveCompanyWithFirstThreeLetters(fragment);
        if (resultCompanies.isEmpty()) {
            LOGGER.error(SearchException.EER_NOT_FOUND);
            throw new SearchException(SearchException.EER_NOT_FOUND);
        }
        return resultCompanies;
    }

    public List<Employee> searchEmployeesName(String fragment) throws SearchException {
        LOGGER.info("The search for an employee with a name with the letters: " + fragment + "has started");
        List<Employee> resultEmployees = employeeDao.retrieveEmployeeThisLastname(fragment);
        if (resultEmployees.isEmpty()) {
            LOGGER.error(SearchException.EER_NOT_FOUND);
            throw new SearchException(SearchException.EER_NOT_FOUND);
        }
        return resultEmployees;
    }

}
