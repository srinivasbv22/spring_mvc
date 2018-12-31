package com.mindtree.dao;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.mindtree.entity.Employee;




public class connection {

	public SessionFactory getConnection()
	{
		System.out.println("hi inside session");
		return (SessionFactory) new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Employee.class).buildSessionFactory();
	}
}
