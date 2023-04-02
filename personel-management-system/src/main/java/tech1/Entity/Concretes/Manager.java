package tech1.Entity.Concretes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;
@Data
@Entity
@Table(name="managers")
@AllArgsConstructor
@NoArgsConstructor
public class Manager {
    @Id
    @Column(name="id")
    private int id;

    @Column(name="first_name")
    private String firstName;

    @Column(name="last_name")
    private String lastName;

    @ManyToOne()
    @JoinColumn(name="region_id")
    private Region region;

    @OneToMany(mappedBy = "manager")
    private List<Employee> employees;
}
