package com.hibernatetutorial.part02.anotations.joincolumn;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.JoinTable;

@Entity
public class Employee implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	private int id;
	private String name;
	private String surname;

	@Embedded
	@ElementCollection // It creates child details table
	@JoinTable(name = "employee_addresses") // change child table's table name
	@JoinColumns({
		@JoinColumn(name="employee_id")	// change column name
	})
	private Set<Address> addressList = new HashSet<>();

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

	public Set<Address> getAddressList() {
		return addressList;
	}

	public void setAddressList(Set<Address> addressList) {
		this.addressList = addressList;
	}

}
