package com.muditasoft.test;

import java.util.List;

import org.hibernate.SessionFactory;

import com.muditasoft.dao.EmployeeDAO;
import com.muditasoft.dao.EmployeeDAOImpl;
import com.muditasoft.model.Employee;
import com.muditasoft.util.SessionFactoryUtil;

public class EmployeeTest {
	static SessionFactory factory = SessionFactoryUtil.getSessionFactory();

	public static void main(String[] args) {
//		Employee employee1 = new Employee("Tutku", "Ince");
//		Employee employee2 = new Employee("Emin", "Koklu");
//		Employee employee3 = new Employee("Musa", "Atlihan");
//
//		insert(employee1);
//		insert(employee2);
//		insert(employee3);
		
		Employee selectedEmployee = getById(1);
		System.out.println(selectedEmployee);
		
		//delete(3);
		
		System.out.println(employeeList());
	}

	public static void insert(Employee employee) {
		EmployeeDAO employeeDAO = new EmployeeDAOImpl(factory);
		employeeDAO.insert(employee);
	}
	
	public static Employee getById(int id) {
		EmployeeDAO employeeDAO = new EmployeeDAOImpl(factory);
		return employeeDAO.getById(id);
	}
	
	public static void delete(int id) {
		EmployeeDAO employeeDAO = new EmployeeDAOImpl(factory);
		employeeDAO.delete(id);
	}
	
	public static List<Employee> employeeList(){
		EmployeeDAO employeeDAO = new EmployeeDAOImpl(factory);
		return employeeDAO.getAll();
	}
}
