package com.codeassignment.huntington.restservices.init;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.codeassignment.huntington.restservices.entity.Employee;
import com.codeassignment.huntington.restservices.repository.EmployeeRepository;

@Component
public class DBInitilizer  implements ApplicationRunner{
	
	@Autowired
	private EmployeeRepository employeeDao;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		long count = employeeDao.count();
		 if (count == 0) {
	            Employee emp1 = new Employee();
	            emp1.setEmpName("TEST1");
	            emp1.setDesignation("TestDes1");
	            
	            Employee emp2 = new Employee();
	            emp2.setEmpName("TEST2");
	            emp2.setDesignation("TestDes2");
	            
	            employeeDao.save(emp1);
	            employeeDao.save(emp2);
		 }
		
	}

}
