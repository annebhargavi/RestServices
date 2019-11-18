package com.codeassignment.huntington.restservices.model;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

public class Employee {
	@NotNull
	@Min(value = 1)
	private int empId;
	@NotNull
	private String empName;
	@NotNull
	private String designation;

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

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

}
