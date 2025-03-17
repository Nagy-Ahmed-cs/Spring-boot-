package com.Spring.MainProject.Controller;

import com.Spring.MainProject.Model.Entity.Employee;
import com.Spring.MainProject.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
    @Autowired
    private EmployeeService employee;
    @GetMapping("/get-name")
    public String getName(){
        System.out.println("Test git and git hub ");
        return employee.getName();
    }
    @GetMapping("/get-by-id")
    public String getId(){
        return employee.Check();
    }
    @GetMapping("/check")
    public Employee getObject(){
        return employee.getObject();
    }

}
