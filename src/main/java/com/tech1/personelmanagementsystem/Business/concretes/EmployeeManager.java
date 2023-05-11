package com.tech1.personelmanagementsystem.Business.concretes;
import com.tech1.personelmanagementsystem.Business.abstracts.EmployeeService;
import com.tech1.personelmanagementsystem.Core.Utilities.Logger.abstracts.LoggerService;
import com.tech1.personelmanagementsystem.Core.Utilities.Results.DataResult;
import com.tech1.personelmanagementsystem.Core.Utilities.Results.Result;
import com.tech1.personelmanagementsystem.Core.Utilities.Results.SuccessDataResult;
import com.tech1.personelmanagementsystem.DataAccess.abstracts.EmployeeDao;
import com.tech1.personelmanagementsystem.Entities.concretes.Employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeManager implements EmployeeService {

    private EmployeeDao employeeDao;
   // private final LoggerService loggerService;
    @Autowired
    public EmployeeManager(EmployeeDao employeeDao/*, LoggerService _loggerService*/){
        this.employeeDao = employeeDao;
       // this.loggerService = _loggerService;
    }
    @Override
    public DataResult<List<Employee>> getAll() {
        //loggerService.logToSystemInfo("All Items covered");
        return new SuccessDataResult<List<Employee>>(this.employeeDao.findAll(),true,"All Employees Listed!");

    }

    @Override
    public DataResult<List<Employee>> getAllSorted() {
        return null;
    }

    @Override
    public DataResult<Employee> getById(int id) {
        return new SuccessDataResult<Employee>(this.employeeDao.getReferenceById(id),true,"All Employees Listed!");
    }

    @Override
    public Result Add(Employee employee) {
        String message = "Employee Added: "+ employee.getEmployee_id();
        //this.loggerService.logToSystemInfo(message);
        this.employeeDao.save(employee);
        return new Result(true);
    }

}
