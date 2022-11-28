package com.Springboot.FirstSpringboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DemoService {
	
	
	@Autowired
	EmployeeRepository empRepository;

	public Employee createEmployee() {
		Employee e = new Employee(101,"Ruchin",100.00);
		return e;
	}

	public Employee registerEmployee(Employee employee) {
		return empRepository.save(employee);
	}

	


	public Employee searchEmployee(int empId) {
		return empRepository.findById(empId).get();
	}
	
	

}
