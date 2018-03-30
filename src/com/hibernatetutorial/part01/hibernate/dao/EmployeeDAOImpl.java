package com.hibernatetutorial.part01.hibernate.dao;

import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;

import com.hibernatetutorial.part01.hibernate.model.Employee;
import com.hibernatetutorial.util.SessionUtil;

public class EmployeeDAOImpl implements GenericDAO<Employee>{
	private Session session;
	
	public EmployeeDAOImpl(Session session) {
		this.session = session;
	}
	
	@Override
	public void insert(Employee entity) {
		session = SessionUtil.getSession();
		session.beginTransaction();
		session.save(entity);
		session.getTransaction().commit();
		session.close();
	}

	@Override
	public void update(Employee entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Employee> getAll() {
		session = SessionUtil.getSession();
		TypedQuery<Employee> query = session.createQuery("select emps from Employee emps", Employee.class);
		return query.getResultList();
	}

	@Override
	public Employee getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}
	
}
