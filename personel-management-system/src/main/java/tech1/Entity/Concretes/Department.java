package tech1.Entity.Concretes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
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

    @OneToMany(mappedBy = "deparment")
    private List<Employee> employees;

    @OneToMany(mappedBy = "department")
    private List<Director> directors;
}
