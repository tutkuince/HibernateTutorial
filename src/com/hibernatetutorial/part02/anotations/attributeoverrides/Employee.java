package com.hibernatetutorial.part02.anotations.attributeoverrides;

import java.io.Serializable;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;

import com.hibernatetutorial.part02.anotations.embeddable.Address;

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
	@AttributeOverrides({ @AttributeOverride(name = "region", column = @Column(name = "address_region")),
		@AttributeOverride(name = "region", column = @Column(name = "homeAddress_region")),
		@AttributeOverride(name = "city", column = @Column(name = "homeAddress_city")),
		@AttributeOverride(name = "district", column = @Column(name = "homeAddress_district")),
		@AttributeOverride(name = "street", column = @Column(name = "homeAddress_street")),
	})
	private Address homeAddress;

	@Embedded
	private Address address;

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

	public void setAddress(Address address) {
		this.homeAddress = address;
	}

	public Address getAddress() {
		return homeAddress;
	}
}
