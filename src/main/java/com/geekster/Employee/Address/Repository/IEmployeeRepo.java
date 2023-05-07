package com.geekster.Employee.Address.Repository;

import com.geekster.Employee.Address.model.Employee;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IEmployeeRepo extends CrudRepository<Employee,Long> {
    @Modifying
    @Query(value = "update employee set last_name= :lname where id= :id ",nativeQuery = true)
    public void updateemployee(Long id,String lname);

//    @Query(value = "select * from employee",nativeQuery = true)
//    List<Employee> getallemployee();
}
