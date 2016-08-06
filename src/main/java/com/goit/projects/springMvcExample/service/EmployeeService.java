package com.goit.projects.springMvcExample.service;

import com.goit.projects.springMvcExample.model.dao.EmployeeDAO;
import com.goit.projects.springMvcExample.model.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public class EmployeeService {

    private EmployeeDAO employeeDAO;

    @Autowired
    public void setEmployeeDAO(EmployeeDAO employeeDAO) {
        this.employeeDAO = employeeDAO;
    }

    @Transactional
    public List<Employee> getAllEmployees() {
        return employeeDAO.findAll();
    }

    @Transactional
    public Employee getEmployeeBySurname(String employeeSurname) {
        return employeeDAO.loadBySurname(employeeSurname).get(0);
    }
}
