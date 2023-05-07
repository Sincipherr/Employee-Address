package com.geekster.Employee.Address.controller;

import com.geekster.Employee.Address.model.Address;
import com.geekster.Employee.Address.model.Employee;
import com.geekster.Employee.Address.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class EmployeeContoller {
    @Autowired
    EmployeeService es;

    @GetMapping(value = "/all/{id}")
    public Optional<Employee> employeebyid(@PathVariable Long id){
        return es.getallemployee(id);
    }
    @GetMapping(value = "/allemployee")
    public List<Employee> allemployee(){
        return es.allemployee();
    }
    @PostMapping(value = "/post")
    public  void addemployee(@RequestBody Employee employee){
        es.addemployee(employee);
    }

    @PutMapping(value = "/update/{id}/{lname}")
    public void updatebyid(@PathVariable Long id,@PathVariable String lname){
        es.updatebyid(id,lname);
    }

    @DeleteMapping(value = "/delete/{id}")
    public void deletebyid(@PathVariable Long id){
        es.deletebyid(id);
    }
}
