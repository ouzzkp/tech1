package tech1.Entity.Concretes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
@Data
@Entity
@Table(name="directors")
@AllArgsConstructor
@NoArgsConstructor
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
