package com.hibernatetutorial.part02.anotations.tablegenerator;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.TableGenerator;

@Entity
public class Employee implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@TableGenerator(name="EMP_GEN")
	@GeneratedValue(generator="EMP_GEN")
	private int id;
	private String name;
	private String surname;

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(String name, String surname) {
		super();
		this.name = name;
		this.surname = surname;
	}

	public Employee(int id, String name, String surname) {
		super();
		this.id = id;
		this.name = name;
		this.surname = surname;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}
}
