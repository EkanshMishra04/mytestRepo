package com.nagarro.em.springazureservice1.service;

import java.util.List;

import com.nagarro.em.springazureservice1.entity.Employee;
public interface EmployeeService {
	
	
	public Employee setNewEmployee(Employee employee);
	
	public List<Employee> getAllEmployeeList();
	
	public Employee getEmployeeById(Integer id);
	
	public Employee setDepartmentForAnEmployee(Employee employee);
	
	public Employee deleteEmployeeById(Integer id);

}
