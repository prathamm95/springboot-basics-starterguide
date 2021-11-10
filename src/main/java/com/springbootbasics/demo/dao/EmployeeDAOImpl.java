package com.springbootbasics.demo.dao;

import com.springbootbasics.demo.entity.Employee;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO {

    List<Employee> employees = new ArrayList<>();

    @Override
    public int addEmployee(Employee emp) {
        employees.add(emp);
        return 1;
    }

    @Override
    public List<Employee> getAllEmployees() {
        return employees;
    }

    @Override
    public Employee getEmployee(int id) {
        for (Employee emp : employees) {
            if (emp.getEmpID() == id)
                return emp;
        }
        return null;
    }

    @Override
    public int deleteEmployee(int id) {

        Employee empToDelete = null;

        for (Employee emp : employees) {
            if (emp.getEmpID() == id)
                empToDelete = emp;
        }

        if (empToDelete != null) {
            employees.remove(empToDelete);
            return 1;
        } else {
            return 0;
        }

    }
}
