package com.hibernatetutorial.part01.hibernate.test;

import org.hibernate.Session;

import com.hibernatetutorial.part01.hibernate.dao.EmployeeDAOImpl;
import com.hibernatetutorial.part01.hibernate.model.Employee;
import com.hibernatetutorial.util.SessionUtil;

public class TestEmployee {
	public static void main(String[] args) {
		Employee employee = new Employee(1, "Tutku", "Ince");
		Employee employee2 = new Employee(2, "Emin", "Koklu");
//		
//		SessionFactory factory = new Configuration().configure("/META-INF/hibernate.cfg.xml").buildSessionFactory();
//		Session session = factory.openSession();
//		session.beginTransaction();
//		
//		session.save(employee);
//		session.getTransaction().commit();
//		session.close();
		
		Session session = SessionUtil.getSession();
		EmployeeDAOImpl employeeDAO = new EmployeeDAOImpl(session);
		
		employeeDAO.insert(employee);
		employeeDAO.insert(employee2);
		
		employeeDAO.getAll().forEach((s) -> System.out.println("ID: " + s.getId() + "\nName: " + s.getName() + "\nSurname: " + s.getSurname()));
	}
}
