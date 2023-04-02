package tech1.Entity.Concretes;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import java.awt.*;
import java.util.Date;
@Data
@Entity
@Table(name="employees")
@AllArgsConstructor
@NoArgsConstructor
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name="first_name")
    private String firstName;

    @Column(name="last_name")
    private String lastName;

    @Column(name="email_address")
    private String emailAddress;

    @Column(name="salary")
    private float salary;

    @Column(name="job_title")
    private String jobTitle;

    @Column(name="product_name")
    private String productName;

    @Column(name="address")
    private String address;

    @Column(name="birth_date")  // cameCase PascalCase sneak_case kebap-case
    private Date birthDate;

    @Column(name="hire_date")
    private Date hireDate;

    @Column(name="mobile_phone")
    private int mobilePhone;

    @ManyToOne()
    @JoinColumn(name="region_id")
    private Region region;

    @ManyToOne()
    @JoinColumn(name="department_id")
    private Department department;

    @ManyToOne()
    @JoinColumn(name="manager_id")
    private Manager manager;

}
