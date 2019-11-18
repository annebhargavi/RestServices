package com.codeassignment.huntington.restservices.service;

import com.codeassignment.huntington.restservices.model.Employee;

public interface EmployeeService {

	
	/**
	 * This method retrieves the employee name by empId
	 * @param empId
	 * @return String empName
	 */
	public String getEmployeeNameByEmpId(int empId);

	/**
	 * This method updates the empName by empId and returns the updated Employee
	 * @param employee
	 * @return Employee
	 */
	public Employee updateEmployeeName(Employee employee);
}
