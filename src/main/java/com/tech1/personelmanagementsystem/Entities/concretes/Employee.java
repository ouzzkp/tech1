package com.tech1.personelmanagementsystem.Entities.concretes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

import java.awt.*;
import java.util.Date;
@Entity
@Data
@Table(name="employees")
@AllArgsConstructor
@NoArgsConstructor
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    private int employee_id;
    @ManyToOne()
    @JoinColumn(name="region_id")
    private Region region_id;

    @ManyToOne()
    @JoinColumn(name="manager_id")
    private Manager manager_id;
    @ManyToOne()
    @JoinColumn(name="department_id")
    private Department department_id;
    @Column(name="first_name")
    private String firstName;

    @Column(name="last_name")
    private String lastName;

    @Column(name="email_address")
    private String emailAddress;
    @Column(name="job_title")
    private String jobTitle;

    @Column(name="salary")
    private float salary;

    @Column(name="mobile_phone")
    private String mobilePhone;

    @Column(name="address")
    private String address;

    @Column(name="birth_date")
    private Date birthDate;

    @Column(name="hire_date")
    private Date hireDate;






}
