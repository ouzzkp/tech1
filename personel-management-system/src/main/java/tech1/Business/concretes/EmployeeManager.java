package Business.concretes;

import Business.abstracts.EmployeeService;

import Core.Utilities.Results.DataResult;
import Core.Utilities.Results.Result;
import Entity.Concretes.Employee;

import java.util.List;

public class EmployeeManager implements EmployeeService {
    @Override
    public DataResult<List<Employee>> getAll() {
        return null;
    }

    @Override
    public DataResult<List<Employee>> getAllSorted() {
        return null;
    }

    @Override
    public DataResult<List<Employee>> getAll(int id) {
        return null;
    }

    @Override
    public Result Add(Employee Employee) {
        return null;
    }
}
