package tech1.Business.abstracts;

import Core.Utilities.Results.DataResult;
import Core.Utilities.Results.Result;
import tech1.Entity.Concretes.Employee;

import java.util.List;

public interface EmployeeService {
    DataResult<List<Employee>> getAll();
    DataResult<List<Employee>> getAllSorted();
    DataResult<List<Employee>> getAll(int id);
    Result Add(Employee Employee);


}
