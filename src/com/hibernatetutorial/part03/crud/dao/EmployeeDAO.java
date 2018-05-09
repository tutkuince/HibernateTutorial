package com.muditasoft.dao;

import java.util.List;

import com.muditasoft.model.Employee;

public interface EmployeeDAO {
	void insert(Employee employee);
	Employee getById(int id);
	List<Employee> getAll();
	void update(int id);
	void delete(int id);
}
