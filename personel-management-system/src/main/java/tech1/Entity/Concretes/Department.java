package Entity.Concretes;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="departments")
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
