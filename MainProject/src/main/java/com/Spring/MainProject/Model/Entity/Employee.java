package com.Spring.MainProject.Model.Entity;

import jakarta.persistence.*;
import lombok.*;


@Data

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="Employees")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="employeeId")
    private Integer EmployeeId;
    @Column(name="employeeName")
    private String EmployeeName;
    @Column(name="employeeEmail")
    private String EmployeeEmail;

}
