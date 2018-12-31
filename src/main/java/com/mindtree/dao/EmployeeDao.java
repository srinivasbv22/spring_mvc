package com.mindtree.dao;

import java.util.List;

import com.mindtree.entity.Employee;


public interface EmployeeDao {
	
	public void addEmployee(Employee emp);
	public List<Employee> displayAllEmployees(Employee emp);
	public void updateEmployee(Employee emp);
	public void deleteEmployee(int id);
	public Employee displayByIdEmployee(int id);

}
