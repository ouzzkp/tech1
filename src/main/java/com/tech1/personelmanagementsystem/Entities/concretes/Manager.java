package com.tech1.personelmanagementsystem.Entities.concretes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import jakarta.persistence.*;
import java.util.List;
@Data
@Entity
@Table(name="managers")
@AllArgsConstructor
@NoArgsConstructor
public class Manager {
    @Id
    @Column(name="id")
    private int manager_id;

    @Column(name="first_name")
    private String firstName;

    @Column(name="last_name")
    private String lastName;

    @ManyToOne()
    @JoinColumn(name="region_id")
    private Region region_id;

    @OneToMany(mappedBy = "manager_id")
    private List<Employee> employees;
}
