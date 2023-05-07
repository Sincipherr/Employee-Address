package com.geekster.Employee.Address.service;

import com.geekster.Employee.Address.Repository.IEmployeeRepo;
import com.geekster.Employee.Address.model.Employee;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {
    @Autowired
    IEmployeeRepo er;
    public void addemployee(Employee employee) {
        er.save(employee);
    }

    public Optional<Employee> getallemployee(Long id) {
        return er.findById(id);
    }
    @Transactional
    public void updatebyid(Long id,String lname) {
        er.updateemployee(id,lname);
    }

    @Transactional
    public void deletebyid(Long id) {
        er.deleteById(id);
    }

    public List<Employee> allemployee() {
        return (List<Employee>) er.findAll();
    }
}
