package com.goit.projects.springMvcExample.web;

import com.goit.projects.springMvcExample.model.entity.Employee;
import com.goit.projects.springMvcExample.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Map;

@Controller
@ResponseBody
public class EmployeeController {

    private EmployeeService employeeService;

    @Autowired
    public void setEmployeeService(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    /*@RequestMapping(value = "/employees", method = RequestMethod.GET)
    public String employees(Map<String, Object> model) {
        model.put("employees", employeeService.getAllEmployees());
        return "employees";
    }*/

    @RequestMapping(value = "/employee", method = RequestMethod.GET)
    public List<Employee> employees(Map<String, Object> model) {
        return employeeService.getAllEmployees();
    }

    /*@RequestMapping(value = "/employee", method = RequestMethod.GET)
    public ModelAndView employee(@RequestParam("employeeSurname") String employeeSurname) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("employee", employeeService.getEmployeeBySurname(employeeSurname));
        modelAndView.setViewName("employee");
        return modelAndView;
    }*/

    @RequestMapping(value = "/employee/{employeeSurname}", method = RequestMethod.GET)
    public Employee employee(@PathVariable String employeeSurname) {
        return employeeService.getEmployeeBySurname(employeeSurname);
    }
}


