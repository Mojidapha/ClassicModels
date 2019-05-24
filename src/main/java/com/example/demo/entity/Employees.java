package com.example.demo.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "employees")

public class Employees implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="employeeNumber")
	private Long employeeNumber;
	@Column(name="lastName")
	private String lastName;
	@Column(name="firstName")
	private String firstName;
	@Column(name="extension")
	private String extension;
	@Column(name="email")
	private String email;
	@Column(name="jobTitle")
	private String jobTitle;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "employees")
	private List<Customers> customers;
	
	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "officeCode")
    private Offices offices;
	
	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "reportsTo")
    private Employees employees;
	
//	@OneToMany(fetch = FetchType.LAZY, mappedBy = "employees")
//	private List<Employees> employees;
	
	public List<Customers> getCustomers() {
		return customers;
	}
	public Employees getEmployees() {
		return employees;
	}
	public void setEmployees(Employees employees) {
		this.employees = employees;
	}
	public void setCustomers(List<Customers> customers) {
		this.customers = customers;
	}
	public Offices getOffices() {
		return offices;
	}
	public void setOffices(Offices offices) {
		this.offices = offices;
	}
	public Long getEmployeeNumber() {
		return employeeNumber;
	}
	public void setEmployeeNumber(Long employeeNumber) {
		this.employeeNumber = employeeNumber;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getExtension() {
		return extension;
	}
	public void setExtension(String extension) {
		this.extension = extension;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getJobTitle() {
		return jobTitle;
	}
	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}
	
	
}
