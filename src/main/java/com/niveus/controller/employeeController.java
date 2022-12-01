package com.niveus.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import org.springframework.web.bind.annotation.RestController;

import com.niveus.entity.Employee;
import com.niveus.model.ResponseStatus;
import com.niveus.service.EmployeeService;

@Controller
@RestController
@ResponseBody

public class employeeController {

	@Autowired
	private EmployeeService employeeService;

	List<ResponseStatus> responseBody = new ArrayList<>();
	ResponseStatus responseStatus = new ResponseStatus();

	@RequestMapping(value = "/ping")
	public static String checkStatus() {
		return "TestMicroservice Application Running.....";

	}

	@RequestMapping(value = "/employees")
	public List<Employee> getAllEmployees() {

		return employeeService.getAllEmployee();

	}

	@RequestMapping(value = "/employee", method = RequestMethod.POST)
	public List<ResponseStatus> addEmployee(@RequestBody Employee employee) {
		try {
			employeeService.addEmployee(employee);
			responseStatus.setResponseCode("200");
			responseStatus.setResponseStatus("RECORD INSERTED");
		} catch (Exception e) {
			String errorMessage = e.getMessage();
			responseStatus.setResponseCode("400");
			responseStatus.setResponseStatus(errorMessage);
		}

		responseBody.add(responseStatus);
		return responseBody;

	}

	@RequestMapping(value = "/employer", method = RequestMethod.POST)
	public List<ResponseStatus> deleteEmployee(@RequestBody String id) {

		try {
			boolean valueAvailable = employeeService.deleteEmployee(id);
			System.out.println(valueAvailable);
			if(valueAvailable == true)
			{
			responseStatus.setResponseCode("200");
			responseStatus.setResponseStatus("DELETED");
			}
			else
				responseStatus.setResponseCode("200");
				responseStatus.setResponseStatus("RECORD NOT FOUND");
				
		} catch (Exception e) {
			String errorMessage = e.getMessage();
			responseStatus.setResponseCode("400");
			responseStatus.setResponseStatus(errorMessage);
		}
		responseBody.add(responseStatus);
		return responseBody;
	}

}
