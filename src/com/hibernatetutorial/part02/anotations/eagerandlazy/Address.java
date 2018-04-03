package com.hibernatetutorial.part02.anotations.eagerandlazy;

import javax.persistence.Embeddable;

@Embeddable	// This entity class invoke by another entity classes and used as a row and embedded it.
public class Address {
	private String region;
	private String city;
	private String district;
	private String street;

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	@Override
	public String toString() {
		return "Address [region=" + region + ", city=" + city + ", district=" + district + ", street=" + street + "]";
	}
}
