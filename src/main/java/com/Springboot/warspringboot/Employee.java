package com.Springboot.warspringboot;

import javax.persistence.Entity;
import javax.persistence.Id;



@Entity
public class Employee {
	
	@Id
	private int empId;
	private String empName;
	private double empSalary;
	
	public Employee() {
		
	}
	
	public Employee(int id, String empName, double empSalary) {
		
		this.empId=id;
		this.empName=empName;
		this.empSalary=empSalary;
	}
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public double getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}
	
	
	
	

}
