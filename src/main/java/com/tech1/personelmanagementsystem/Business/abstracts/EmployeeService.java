package com.tech1.personelmanagementsystem.Business.abstracts;




import com.tech1.personelmanagementsystem.Core.Utilities.Results.DataResult;
import com.tech1.personelmanagementsystem.Core.Utilities.Results.Result;
import com.tech1.personelmanagementsystem.Entities.concretes.Employee;

import java.util.List;

public interface EmployeeService {

    DataResult<List<Employee>> getAll();
    DataResult<List<Employee>> getAllSorted();
    DataResult<Employee> getById(int id);
    Result Add(Employee Employee);


}
