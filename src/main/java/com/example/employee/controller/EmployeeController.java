package com.example.employee.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.employee.model.Employee;
import com.example.employee.service.EmployeeService;

@RestController
@RequestMapping("/api")
public class EmployeeController {
	@Autowired
	EmployeeService empService;
	
	@RequestMapping(value="/employees", method=RequestMethod.POST)
	public Employee createEmployee(@RequestBody Employee emp) {
	    //return empService.createEmployee(emp);
		return emp;
	}

	@RequestMapping(value="/employees", method=RequestMethod.GET)
	public List<Employee> readEmployees() {
	    //return empService.getEmployees();
		List<Employee> list = new ArrayList<Employee>();
		
		Employee e1 = new Employee();
		Employee e2 = new Employee();
		
		e1.setId(1L);
		e1.setFirstName("Mayur");
		e1.setLastName("Kharat");
		e1.setEmailId("Mayur@email.com");
		
		e2.setId(2L);
		e2.setFirstName("Amol");
		e2.setLastName("Bagi");
		e2.setEmailId("Amol@email.com");
		
		list.add(e1);
		list.add(e2);
		
		return list;
	}
	
	@RequestMapping(value="/employees/{empId}", method=RequestMethod.PUT)
	public Employee updateEmployee(@PathVariable(value = "empId") Long id, @RequestBody Employee empDetails) {
	    //return empService.updateEmployee(id, empDetails);
	    return empDetails;
	}
	
	@RequestMapping(value="/employees/{empId}", method=RequestMethod.DELETE)
	public void deleteEmployees(@PathVariable(value = "empId") Long id) {
	    //empService.deleteEmployee(id);
		System.out.println("Deleted");
	}
}



