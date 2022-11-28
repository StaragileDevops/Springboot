package com.Springboot.warspringboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
	
	@Autowired
	DemoService demoService;
	
	
	@GetMapping("/hello")
	public String helloworld() {
		return "Hello World from Spring";
	}
	
	@GetMapping("/hi")
	public String hi() {
		return "hi from Spring";
	}
	
	
	@GetMapping("/createEmployee")
		public Employee createEmployee() {
			return demoService.createEmployee();
			
		}
	
	@PostMapping("/registerEmployee")
	public Employee registerEmployee(@RequestBody Employee employee) {
		return demoService.registerEmployee (employee);
		
	}
	
	@GetMapping("/getEmployee/{empId}")
	public Employee getEmployeeDetails(@PathVariable(value="empId")int empId) {
		return demoService.searchEmployee(empId);
		
	}
	}
	
	


