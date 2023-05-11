package com.tech1.personelmanagementsystem.Entities.concretes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import jakarta.persistence.*;
@Data
@Entity
@Table(name="departments")
@AllArgsConstructor
@NoArgsConstructor
public class Department {
    @Id
    @Column(name="id")
    private int id;

    @Column(name="name")
    private String name;

    @OneToMany(mappedBy = "department_id")
    private List<Employee> employees;

    @OneToMany(mappedBy = "department_id")
    private List<Director> directors;
}
