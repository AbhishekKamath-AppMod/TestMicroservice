package com.niveus.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.niveus.entity.Employee;

@Service
public class EmployeeService {

	Employee emp1 = new Employee("S101", "Jardon", "App-Mod", "12-01-2022");
	Employee empl2 = new Employee("S102", "Millis", "QA", "13-02-2022");
	Employee empl3 = new Employee("S103", "Janny", "Support", "14-03-2022");
	Employee empl4 = new Employee("S104", "Lawrence", "QA", "15-06-2022");
	Employee empl5 = new Employee("S105", "Norton", "Support", "15-08-2022");

	List<Employee> employees = Arrays.asList(emp1, empl2, empl3, empl4, empl5);

	public List<Employee> getAllEmployee() {
		return employees;

	}

	public void addEmployee(Employee employee) {
		employees.add(employee);
	}

	public void deleteEmployee(String id) {
		employees.removeIf(t -> t.getId().equals(id));
	}
}
