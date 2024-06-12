package com.app.core;
/*
6. Write a console-based Java application for a company to manage employee details.
There are two types of employees � Full Time Employee (FTE), Part Time Employee (PTE)
Application captures following details for each employee whether FTE or PTE:
       Name, Date of joining, Phone Number, Aadhaar number  
For FTE, monthly salary is also captured.
For PTE, hourly payment amount is also captured.

Same collection class is used to store both FTE and PTE

Input should be validated before entering into the system:
Emp Id should be auto generated and unique for each employee.
Date of joining should be of type LocalDate 
Phone number should be all numeric and of length 10
 Hint : Can use a reg ex : ^[0-9]*$ n use String class's matches method
Aadhaar number should be all numeric and of length 12 only, there should not be any space in between.
 Hint : Can use a reg ex : ^\\S+$ n use String class's matches method
Two employees cannot have same aadhaar number

Application Menu:
Add full time employee
Add part time employee
Delete an employee by Emp Id
Search employee details by Aadhaar number
Display all employee details
Display all employee details sorted by date of joining
Exit
*/
/*Full Time Employee (FTE), Part Time Employee (PTE)
Application captures following details for each employee whether FTE or PTE:
       Name, Date of joining, Phone Number, Aadhaar number  
For FTE, monthly salary is also captured.*/

import java.time.LocalDate;

public class Employee {
	private static int id=100;
	private int empid;
	private EmpType emptype;
	private String name;
	private LocalDate dateOfJoining;
	private String number;
	private Long AdharNumber;
	private double salaryForFTE;
	private double hourlyPaymentForPTE;
	public Employee(String name, LocalDate dateOfJoining, String number, Long adharNumber,
			double salaryForFTE, EmpType FULL_TIME_EMPLOYEE) {
		super();
		this.empid = id++; 
		this.emptype = FULL_TIME_EMPLOYEE;
		this.name = name;
		this.dateOfJoining = dateOfJoining;
		this.number = number;
		AdharNumber = adharNumber;
		this.salaryForFTE = salaryForFTE;
		
	}
	
	
	
	
	
	
	public Employee(EmpType PART_TIME_EMPLOYEE,String name, LocalDate dateOfJoining, String number, Long adharNumber,
			double hourlyPaymentForPTE) {
		super();
		this.empid = id++; 
		this.emptype = PART_TIME_EMPLOYEE;
		this.name = name;
		this.dateOfJoining = dateOfJoining;
		this.number = number;
		AdharNumber = adharNumber;
		this.hourlyPaymentForPTE = hourlyPaymentForPTE;
	}






	public EmpType getEmptype() {
		return emptype;
	}
	public void setEmptype(EmpType emptype) {
		this.emptype = emptype;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public LocalDate getDateOfJoining() {
		return dateOfJoining;
	}
	public void setDateOfJoining(LocalDate dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public Long getAdharNumber() {
		return AdharNumber;
	}
	public void setAdharNumber(Long adharNumber) {
		AdharNumber = adharNumber;
	}
	public double getSalaryForFTE() {
		return salaryForFTE;
	}
	public void setSalaryForFTE(double salaryForFTE) {
		this.salaryForFTE = salaryForFTE;
	}
	public double getHourlyPaymentForPTE() {
		return hourlyPaymentForPTE;
	}
	public void setHourlyPaymentForPTE(double hourlyPaymentForPTE) {
		this.hourlyPaymentForPTE = hourlyPaymentForPTE;
	}
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", emptype=" + emptype + ", name=" + name + ", dateOfJoining="
				+ dateOfJoining + ", number=" + number + ", AdharNumber=" + AdharNumber + ", salaryForFTE="
				+ salaryForFTE + ", hourlyPaymentForPTE=" + hourlyPaymentForPTE + "]";
	}






	public int getEmpid() {
		return empid;
	}






	public void setEmpid(int empid) {
		this.empid = empid;
	}
	
	
	
	
	
	
	
	
	
	
	

}
