package com.springbootbasics.demo.dao;

import com.springbootbasics.demo.entity.Employee;

import java.util.List;

public interface EmployeeDAO {

    int addEmployee(Employee emp);

    List<Employee> getAllEmployees();

    Employee getEmployee(int id);

    int deleteEmployee(int id);

}
