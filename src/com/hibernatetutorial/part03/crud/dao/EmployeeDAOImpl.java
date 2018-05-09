package com.muditasoft.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.muditasoft.model.Employee;

public class EmployeeDAOImpl implements EmployeeDAO {
	private SessionFactory factory;
	private Session session;

	public EmployeeDAOImpl(SessionFactory factory) {
		this.factory = factory;
	}

	@Override
	public void insert(Employee employee) {
		session = factory.openSession();
		Transaction transaction = session.getTransaction();
		transaction.begin();

		session.save(employee);

		transaction.commit();
		session.close();
	}

	@Override
	public Employee getById(int id) {
		session = factory.openSession();
		Transaction transaction = session.getTransaction();
		transaction.begin();

		Employee employee = session.get(Employee.class, id); // get by id

		transaction.commit();
		session.close();
		return employee;
	}

	@Override
	public List<Employee> getAll() {
		session = factory.openSession();
		Transaction transaction = session.getTransaction();
		transaction.begin();
		
		List<Employee> employeeList = session.createQuery("FROM Employee", Employee.class).list();
		
		transaction.commit();
		return employeeList;
	}

	@Override
	public void update(int id) {
		session = factory.openSession();
		Transaction transaction = session.getTransaction();
		transaction.begin();

		Employee employee = session.get(Employee.class, id);
		session.saveOrUpdate(employee);

		transaction.commit();
		session.close();
	}

	@Override
	public void delete(int id) {
		session = factory.openSession();
		Transaction transaction = session.getTransaction();
		transaction.begin();

		Employee employee = session.get(Employee.class, id);
		if (employee != null)
			session.delete(employee);
		else
			System.err.println("Selected employee is not exist with this id=" + id);

		transaction.commit();
		session.close();
	}

}
