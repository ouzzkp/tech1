package tech1.DataAccess;
import org.springframework.data.jpa.repository.JpaRepository;
import tech1.Entity.Concretes.Employee;

public interface EmployeeDao extends JpaRepository<Employee,Integer>{
}
