package com.example.demo3.Dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo3.Entity.Employee;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;
@Repository
public class Employeeimpl implements EmployeeDao {
  private EntityManager em1;
  @Autowired 
  public Employeeimpl(EntityManager eman1){
     em1=eman1;
   }
/*
    @Override
    public List<Employee> save() {
     TypedQuery<Employee> q1 = em1.createQuery("from Employee",Employee.class);
     List<Employee> empl = q1.getResultList();   
     return empl;
    }

    public Employee save(int studentid) {
      Employee themp = em1.find(Employee.class,studentid);
      return themp;
    }*/
  @Override
  @Transactional
  public List<Employee> findall() {
  TypedQuery<Employee> q1 = em1.createQuery("from Employee",Employee.class);
     List<Employee> empl = q1.getResultList();   
     return empl;
  }
  @Override
 @Transactional
  public Employee findbyId(Integer Id) {
  Employee emp1 = em1.find(Employee.class,Id);
  return emp1;
  }
  @Override
  @Transactional
  public void delete(Integer Id) {
    Employee emp1 = em1.find(Employee.class,Id);
    em1.remove(emp1);
  }
  @Override
  public Employee save(Employee emps) {
   Employee es1 = em1.merge(emps);
   return es1;
    }
  }
  
  
  
    
   
