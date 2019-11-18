package com.codeassignment.huntington.restservices.serviceimpl;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.codeassignment.huntington.restservices.model.Employee;
import com.codeassignment.huntington.restservices.repository.EmployeeRepository;
import com.codeassignment.huntington.restservices.service.EmployeeService;
import com.codeassignment.huntington.restservices.util.CommonUtil;
import com.codeassignment.huntington.restservices.util.ErrorConstants;

@Service("employeeService")
public class EmployeeServiceImpl implements EmployeeService {
	Logger logger = Logger.getLogger("com.codeassignment.huntington.restservices.serviceimpl.EmployeeServiceImpl");

	@Autowired
	EmployeeRepository employeeDao;

	@Override
	public String getEmployeeNameByEmpId(int empId) {
		com.codeassignment.huntington.restservices.entity.Employee employeeEn = employeeDao.findByEmpId(empId);

		if (null == employeeEn) {
			logger.log(Level.SEVERE, () -> "Employee record not found for the given EmpId : " + empId);
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, ErrorConstants.ERRMSG_RECORD_NOT_FOUND);
		}
		// CommonUtil.copyProperties(employee, employeeEn);
		return employeeEn.getEmpName();
	}

	@Override
	public Employee updateEmployeeName(Employee employee) {
		com.codeassignment.huntington.restservices.entity.Employee employeeEn = employeeDao.findByEmpId(employee.getEmpId());

		if (null == employeeEn) {
			logger.log(Level.SEVERE, () -> "Employee record not found for the given EmpId : " + employee.getEmpId());
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, ErrorConstants.ERRMSG_RECORD_NOT_FOUND);
		}
		// CommonUtil.copyProperties(employeeEn, employee);
		// Updating Only name
		employeeEn.setEmpName(employee.getEmpName());
		employeeEn = employeeDao.save(employeeEn);
		CommonUtil.copyProperties(employee, employeeEn);
		return employee;
	}
}
