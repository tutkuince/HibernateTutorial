package com.hibernatetutorial.part01.hibernate.dao;

import java.io.Serializable;
import java.util.List;

public interface GenericDAO<T extends Serializable> {
	public void insert(T entity);
	public void update(T entity);
	public List<T> getAll();
	public T getById(int id);
	public void delete(int id);
}
