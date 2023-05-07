package com.geekster.Employee.Address.Repository;

import com.geekster.Employee.Address.model.Address;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IAddressRepo extends CrudRepository<Address,Long> {
    @Query(value = "select * from address",nativeQuery = true)
    public List<Address> getall();

    @Modifying
    @Query(value = "update address set city= :city where address_id= :id ",nativeQuery = true)
    public void updateaddress(Long id,String city);
}
