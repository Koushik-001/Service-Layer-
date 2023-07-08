package com.example.demo3.Rest;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo3.Entity.Employee;
import com.example.demo3.Service.Serviceint;

@RestController
@RequestMapping("/Employee")
public class RestControl {
    /*private Serviceimpl emp1;
        public RestControl(Serviceimpl empl){
        emp1 = empl;
    }
@GetMapping("/all")
public List<Employee> findall(){
    return emp1.findall();
}
@GetMapping("/id")
Employee findbyId(int id){
    return emp1.findbyid(4);
}
@GetMapping("/delete")
public void delete(int id){
    emp1.delete(2);
}*/
private Serviceint emp1;
public RestControl(Serviceint empd1){
emp1=empd1;
}
@GetMapping("/all")
List<Employee> findall(){
    return emp1.findall();
}
@GetMapping("/id")
Employee findbyid(Integer Id){
    int id1=4;
    return emp1.findbyid(id1);
}
@GetMapping("/delete")
public void delete(Integer Id){
    int id2=3;
    emp1.delete(id2);
}
@GetMapping("/save")
Employee save(Employee emps){
Employee es1 = emp1.save(emps);
return es1;
}
}
