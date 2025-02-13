package com.Spring.MainProject.Model.Repos;

import com.Spring.MainProject.Model.Entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface  EmployeeRepo extends JpaRepository<Employee,Integer> {
}
