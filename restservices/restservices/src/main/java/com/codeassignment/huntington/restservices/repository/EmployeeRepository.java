package com.codeassignment.huntington.restservices.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.codeassignment.huntington.restservices.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>{
	
	public Employee findByEmpId(int empId);
	
}
