package com.geekster.Employee.Address.service;

import com.geekster.Employee.Address.Repository.IAddressRepo;
import com.geekster.Employee.Address.model.Address;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AddressService {
    @Autowired
    IAddressRepo ar;

    public void addaddress(Address address) {
        ar.save(address);
    }

    public List<Address> getall() {
        return ar.getall();
    }

    public Optional<Address> getbyid(Long id) {
        return ar.findById(id);
    }

    @Transactional
    public void updateaddbyid(Long id, String city) {
        ar.updateaddress(id,city);
    }

    @Transactional
    public void deleteaddbyid(Long id) {
        ar.deleteById(id);
    }
}
