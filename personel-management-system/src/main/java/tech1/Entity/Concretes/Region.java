package tech1.Entity.Concretes;

import javax.persistence.*;
import java.util.List;

//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.NoArgsConstructor;

//@Data
@Entity
@Table(name = "regions")
//@AllArgsConstructor
//@NoArgsConstructor

public class Region {

    @Id
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    @OneToMany(mappedBy = "region")
    private List<Employee> employees;

    @OneToMany(mappedBy = "region")
    private List<Manager> managers;


}
