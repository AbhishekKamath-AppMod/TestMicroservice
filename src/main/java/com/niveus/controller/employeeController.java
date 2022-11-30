package com.niveus.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.niveus.entity.Employee;
import com.niveus.service.EmployeeService;

@Controller
@RestController
public class employeeController {

	@Autowired
	private EmployeeService employeeService;

	@RequestMapping(value = "/ping")
	public static String checkStatus() {
		return "TestMicroservice Application Running.....";

	}

	@RequestMapping(value = "/employees")
	public List<Employee> getAllEmployees() {

		return employeeService.getAllEmployee();

	}

	@RequestMapping(value = "/employee", method = RequestMethod.POST)
	public void addEmployee(@RequestBody Employee employee) {
		employeeService.addEmployee(employee);
	}

	@RequestMapping(value = "/employee", method = RequestMethod.DELETE)
	public void deleteEmployee(@RequestBody String id) {
		employeeService.deleteEmployee(id);
	}

}
