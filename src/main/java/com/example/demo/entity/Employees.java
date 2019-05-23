package com.example.demo.entity;

import java.util.List;

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

public class Employees {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer employeeNumber;
	private String lastName;
	private String firstName;
	private String extension;
	private String email;
	private String officeCode;
	private Integer reportsTo;
	private String jobTitle;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "employees")
	private List<Customers> customers;
	
	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "officeCode")
    private Offices offices;
	
	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "reportsTo")
    private Employees employees;
	
	/*@OneToMany(fetch = FetchType.LAZY, mappedBy = "employees")
	private List<Employees> employees;*/
	
	public Integer getEmployeeNumber() {
		return employeeNumber;
	}
	public void setEmployeeNumber(Integer employeeNumber) {
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
	public String getOfficeCode() {
		return officeCode;
	}
	public void setOfficeCode(String officeCode) {
		this.officeCode = officeCode;
	}
	public Integer getReportsTo() {
		return reportsTo;
	}
	public void setReportsTo(Integer reportsTo) {
		this.reportsTo = reportsTo;
	}
	public String getJobTitle() {
		return jobTitle;
	}
	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}
	
	
}
