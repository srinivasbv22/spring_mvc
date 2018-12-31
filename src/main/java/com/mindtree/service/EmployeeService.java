package com.mindtree.service;

import java.util.List;

import com.mindtree.entity.Employee;



public interface EmployeeService {
	public void addEmployee(Employee emp);
	public List<Employee> displayAllEmployees(Employee emp);
	public void updateEmployee(Employee emp);
	public void deleteEmployee(int id);
	public Employee displayByIdEmployee(int id);

}
