package com.codeassignment.huntington.restservices.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.codeassignment.huntington.restservices.model.Employee;
import com.codeassignment.huntington.restservices.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	@GetMapping(value = "/getEmployee/{empId}")
	public ResponseEntity<String> getEmployeeNameByEmpId(@PathVariable("empId") int empId) {
		String empName = employeeService.getEmployeeNameByEmpId(empId);
		return new ResponseEntity<>(empName, HttpStatus.OK);
	}

	@PostMapping(value = "/updateEmployee", produces = { MediaType.APPLICATION_JSON_VALUE })
	public Employee updateEmployeeName(@Valid @RequestBody Employee employee) {
		return employeeService.updateEmployeeName(employee);
	}
}
