package com.nagarro.em.springazureservice1.controller;

import java.util.List;

import com.nagarro.em.springazureservice1.entity.Employee;
import com.nagarro.em.springazureservice1.serviceImplementation.EmployeeServiceImplementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

	@Autowired
	private EmployeeServiceImplementation employeeService;

	@GetMapping("/")
	public List<Employee> getAllEmployees() {
		return employeeService.getAllEmployeeList();
	}

	@GetMapping("/{id}")
	public Employee getEmployeeById(@PathVariable("id") Integer id) {
		return employeeService.getEmployeeById(id);
	}

	@PostMapping("/")
	public Employee setNewEmployee(@RequestBody Employee employee) {
		return employeeService.setNewEmployee(employee);
	}

	@PutMapping("/dept")
	public Employee setEmployeesDept(@RequestBody Employee employee) {
		return employeeService.setDepartmentForAnEmployee(employee);
	}

	@DeleteMapping("/{id}")
	public Employee deleteEmployeeById(@PathVariable("id") Integer eid) {
		return employeeService.deleteEmployeeById(eid);
	}

}
