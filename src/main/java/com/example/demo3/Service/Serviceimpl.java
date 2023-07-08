package com.example.demo3.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo3.Dao.EmployeeDao;
import com.example.demo3.Entity.Employee;

import jakarta.transaction.Transactional;
@Service
public class Serviceimpl implements Serviceint {
private EmployeeDao empdao1;
public Serviceimpl(EmployeeDao empd1){
    empdao1=empd1;
}
@Override
@Transactional
public List<Employee> findall() {
return empdao1.findall();    
}

@Override
@Transactional
public Employee findbyid(Integer Id) {
return empdao1.findbyId(Id);    
}

@Override
@Transactional
public void delete(Integer Id) {
 empdao1.delete(Id);    
}
    @Override
@Transactional
public Employee save(Employee emps) {
    Employee empd = new Employee("John", "Mathew", "jm@gmail.com");
return empdao1.save(empd);    
}
    
}
