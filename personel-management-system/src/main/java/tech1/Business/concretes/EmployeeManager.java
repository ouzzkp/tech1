package tech1.Business.concretes;

import tech1.Business.abstracts.EmployeeService;

import Core.Utilities.Results.DataResult;
import Core.Utilities.Results.Result;
import tech1.Entity.Concretes.Employee;

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
