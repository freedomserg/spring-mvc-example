package com.goit.projects.springMvcExample.model.dao;

import com.goit.projects.springMvcExample.model.entity.Employee;

import java.util.List;

public interface EmployeeDAO {

    void saveEmployee(Employee newEmployee);

    void removeEmployeeById(int id);

    List<Employee> loadBySurname(String surname);

    Employee loadById(int id);

    List<Employee> findAll();
}
