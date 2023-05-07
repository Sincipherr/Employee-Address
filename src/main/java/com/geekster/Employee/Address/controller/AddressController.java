package com.geekster.Employee.Address.controller;

import com.geekster.Employee.Address.model.Address;
import com.geekster.Employee.Address.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class AddressController {
    @Autowired
    AddressService as;

    @GetMapping(value = "/getall")
    public List<Address> alladdress(){
        return as.getall();
    }

    @GetMapping(value = "/getbyid/{id}")
    public Optional<Address> getbyid(@PathVariable Long id){
        return as.getbyid(id);
    }

    @PostMapping(value = "/postadd")
    public void addaddress(@RequestBody Address address){
        as.addaddress(address);
    }

    @PutMapping(value = "/updateadd/{id}/{city}")
    public void updateaddbyid(@PathVariable Long id,@PathVariable String city){
        as.updateaddbyid(id,city);
    }

    @DeleteMapping(value = "/deleteadd/{id}")
    public void deleteaddbyid(@PathVariable Long id){
        as.deleteaddbyid(id);
    }
}
