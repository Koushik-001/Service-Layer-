package com.example.demo3.Dao;

import java.util.List;

import com.example.demo3.Entity.Employee;

public interface EmployeeDao {
List<Employee> findall();
Employee save(Employee emps);
Employee findbyId(Integer Id);
void delete(Integer Id); 
}
