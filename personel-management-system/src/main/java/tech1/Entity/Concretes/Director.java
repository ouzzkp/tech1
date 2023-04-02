package tech1.Entity.Concretes;

import javax.persistence.*;
@Entity
@Table(name="directors")
public class Director {
    @Id
    @Column(name="id")
    private int id;

    @Column(name="first_name")
    private String firstName;

    @Column(name="last_name")
    private String lastName;

    @ManyToOne()
    @JoinColumn(name="department_id")
    private Department department;

}
