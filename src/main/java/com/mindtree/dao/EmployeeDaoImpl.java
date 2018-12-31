package com.mindtree.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.mindtree.entity.Employee;


public class EmployeeDaoImpl implements EmployeeDao {

	@Override
	public void addEmployee(Employee emp) {
		// TODO Auto-generated method stub
		connection c= new connection();
		SessionFactory factory=c.getConnection();
		Session session=factory.openSession();
		try
		{
			System.out.println("adding employee details");
			session.beginTransaction();
			System.out.println("trans");
			System.out.println(emp);
			session.save(emp);
			System.out.println("save");
			session.getTransaction().commit();
			System.out.println("saved");
		}
		finally {
			session.close();
		}
		
	}

	@Override
	public List<Employee> displayAllEmployees(Employee emp) {
		// TODO Auto-generated method stub
		Session session=null;
		List<Employee> emplist=new ArrayList<Employee>();
		connection c=new connection();
		SessionFactory factory=c.getConnection();
		Session session1=factory.openSession();
		session1.beginTransaction();
		System.out.println("displayquery");
		emplist=session1.createQuery("from Employee").list();
		System.out.println(emplist);
		System.out.println("displayed");
		session1.getTransaction().commit();
		session1.close();
		return emplist;
	}
	

	@Override
	public void updateEmployee(Employee emp) {
		// TODO Auto-generated method stub
		connection c=new connection();
		SessionFactory factory=c.getConnection();
		Session session=factory.openSession();
		session.beginTransaction();
		session.saveOrUpdate(emp);
		session.getTransaction().commit();
		session.close();
		System.out.println("Update successfully");
		
	}

	@Override
	public void deleteEmployee(int id) {
		// TODO Auto-generated method stub
		connection c=new connection();
		SessionFactory factory= c.getConnection();
		Session session=factory.openSession();
		session.beginTransaction();
		Employee emp=session.load(Employee.class, id);
		session.delete(emp);
		session.getTransaction().commit();
		session.close();
		System.out.println("deleted successfully");
		
	}

	@Override
	public Employee displayByIdEmployee(int id) {
		// TODO Auto-generated method stub
		connection c=new connection();
		SessionFactory factory= c.getConnection();
		Session session=factory.openSession();
		session.beginTransaction();
		Employee emp=session.load(Employee.class, id);
		System.out.println(emp);
		session.getTransaction().commit();
		session.close();
		return emp;
	}
	
	/*public void addEmployee(Employee emp) {
		connection c= new connection();
		SessionFactory factory=c.getConnection();
		Session session=factory.openSession();
		try
		{
			System.out.println("adding employee details");
			session.beginTransaction();
			session.save(emp);
			session.getTransaction().commit();
			System.out.println("saved");
		}
		finally {
			session.close();
		}
	}
	

	public List<Employee> displayAllEmployees() {
		
		Session session=null;
		List<Employee> emplist=new ArrayList<Employee>();
		connection c=new connection();
		SessionFactory factory=c.getConnection();
		Session session1=factory.openSession();
		session1.beginTransaction();
		emplist=session1.createQuery("from Employee").list();
		session1.getTransaction().commit();
		session1.close();
		return emplist;
	}

	public void updateEmployee(Employee emp) {
		// TODO Auto-generated method stub
		connection c=new connection();
		SessionFactory factory=c.getConnection();
		Session session=factory.openSession();
		session.beginTransaction();
		session.saveOrUpdate(emp);
		session.getTransaction().commit();
		session.close();
		System.out.println("deleted successfully");

	}

	public void deleteEmployee(int id) {
		// TODO Auto-generated method stub
		connection c=new connection();
		SessionFactory factory= c.getConnection();
		Session session=factory.openSession();
		session.beginTransaction();
		Employee emp=session.load(Employee.class, id);
		session.delete(emp);
		session.getTransaction().commit();
		session.close();
		System.out.println("deleted successfully");

	}

	public Employee displayByIdEmployee(int id) {
		// TODO Auto-generated method stub
		connection c=new connection();
		SessionFactory factory= c.getConnection();
		Session session=factory.openSession();
		session.beginTransaction();
		Employee emp=session.load(Employee.class, id);
		System.out.println(emp);
		session.getTransaction().commit();
		session.close();
		return emp;
	}
*/
}
