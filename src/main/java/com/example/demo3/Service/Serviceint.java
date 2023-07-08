package com.example.demo3.Service;

import java.util.List;

import com.example.demo3.Entity.Employee;

public interface Serviceint {
    public List<Employee> findall();
Employee findbyid(Integer Id);
public void delete(Integer Id);
Employee save(Employee emps);
}
