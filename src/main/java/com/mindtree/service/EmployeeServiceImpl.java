package com.mindtree.service;

import java.util.List;

import com.mindtree.dao.EmployeeDao;
import com.mindtree.dao.EmployeeDaoImpl;
import com.mindtree.entity.Employee;


public class EmployeeServiceImpl implements EmployeeService {

	EmployeeDao obj= new EmployeeDaoImpl();
	public void addEmployee(Employee emp) {
		// TODO Auto-generated method stub
		obj.addEmployee(emp);

	}

	public List<Employee> displayAllEmployees(Employee emp) {
		// TODO Auto-generated method stub
		System.out.println("servicelayer entered");
		return obj.displayAllEmployees(emp);
	}

	public void updateEmployee(Employee emp) {
		// TODO Auto-generated method stub
        obj.updateEmployee(emp);
	}

	public void deleteEmployee(int id) {
		// TODO Auto-generated method stub
		obj.deleteEmployee(id);

	}

	public Employee displayByIdEmployee(int id) {
		// TODO Auto-generated method stub
		return obj.displayByIdEmployee(id);
	}

}
