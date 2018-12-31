package com.mindtree.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.mindtree.entity.Employee;
import com.mindtree.service.EmployeeService;
import com.mindtree.service.EmployeeServiceImpl;

	@Controller
	public class control {
		@RequestMapping("/calladd")
		public ModelAndView callEmployeeDetails() {
			//System.out.println("hiiiiiiiiiiiiiiii");
			Employee emp=new Employee();
			return new ModelAndView("EmployeeForm","command",emp);
		}
		
		@RequestMapping(value="/add", method=RequestMethod.POST)
		public ModelAndView addEmployee(@ModelAttribute("employee") Employee employee)
		{
			System.out.println(employee);
			EmployeeService obj1=new EmployeeServiceImpl();
			obj1.addEmployee(employee);
			return new ModelAndView("redirect:/");
			
		}
		
		@RequestMapping("/calldisplay")
		public ModelAndView callEmployeeDisplay()
		{
			Employee employee=new Employee();
			return new ModelAndView("DisplayPage", "command", employee);
		}
		
		@RequestMapping(value="/display", method=RequestMethod.GET)
		public ModelAndView displayEmployeeDetails(@ModelAttribute("employee") Employee employee)
		{
			System.out.println(employee);
			EmployeeService obj2= new EmployeeServiceImpl();
			List<Employee> emplist= new ArrayList<Employee>();
			emplist=obj2.displayAllEmployees(employee);
			System.out.println(emplist);
			return new ModelAndView("formDisplay","list",emplist);
			
		}
		
		@RequestMapping("/callupdate")
	    public ModelAndView updateEmployee()
	    {
			Employee emp=new Employee();
			return new ModelAndView("update","command",emp);
	    }
		
		@RequestMapping(value="/update", method=RequestMethod.GET)
		public ModelAndView updateEmployee(@ModelAttribute("employee") Employee employee)
		{
			System.out.println(employee);
			EmployeeService obj2= new EmployeeServiceImpl();
			obj2.updateEmployee(employee);
			return new ModelAndView("redirect:/");
		}

		@RequestMapping("/calldelete")
		public ModelAndView deleteEmployee()
		{
			Employee emp=new Employee();
			return new ModelAndView("Delete","command",emp);
		}
		@RequestMapping(value="/delete", method=RequestMethod.GET)
		public ModelAndView deleteEmployee(@ModelAttribute("employee") Employee employee)
		{
			System.out.println(employee);
			EmployeeService obj2= new EmployeeServiceImpl();
			obj2.deleteEmployee(employee.getEid());//Employee(employee);
			return new ModelAndView("redirect:/");
		}
		
		@RequestMapping("/callby")
		public ModelAndView displayEmployeeById()
		{
			Employee emp=new Employee();
			return new ModelAndView("DisplaybyId","command",emp);
		}
		@RequestMapping(value="/displayby", method=RequestMethod.GET)
		public ModelAndView displaybyidEmployee(@ModelAttribute("employee") Employee employee)
		{
			System.out.println(employee);
			EmployeeService obj2= new EmployeeServiceImpl();
			Employee e=obj2.displayByIdEmployee(employee.getEid());
			return new ModelAndView("formDisplayById","emp",e);
		}
		
	}

