package com.Spring.MainProject.Service;

import com.Spring.MainProject.Model.Entity.Employee;
import com.Spring.MainProject.Model.Repos.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepo employee;
    public String getName(){
        Employee employee=new Employee();
        employee.setEmployeeName("Nagy Ahmed ");
        return employee.getEmployeeName();
    }

    // let it now
    public Employee getById(){
        Optional<Employee>emp=employee.findById(0);
        return emp.orElse(new Employee());
    }
    public String Check(){
       if(employee.findById(10)!=null){
           return "Found this object ";
       }
       else {
           return "not found ";
       }
    }
    public Employee getObject(){
        Optional <Employee>emp=employee.findById(10);
        return emp.orElse(null);
    }

}
