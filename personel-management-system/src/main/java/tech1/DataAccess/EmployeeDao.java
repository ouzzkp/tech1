package tech1.DataAccess;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import tech1.Entity.Concretes.Employee;

import java.util.List;

public interface EmployeeDao extends JpaRepository<Employee,Integer>{
    Employee getByEmployeeId(int id);
    List<Employee> getAll();
    Employee getByEmployeeName(String name);
    //@Query("From Employee where managerId=:managerId ")
    List<Employee> getByManagerId(int managerId);
    //@Query("From Employee where region_id=:regionId")
    List<Employee> getByRegionId(int regionId);
    List<Employee> getByDepartmentId(int id);
    List<Employee> getByDepartmentName(String name);
    List<Employee> getByRegionName(String name);





}
