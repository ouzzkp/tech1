package com.tech1.personelmanagementsystem.Entities.abstracts;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeWithNames { //
    private int id;
    private String firstName;
    private String lastName;
    private String regionName;
    private String departmentName;
    private String managerName;

}
