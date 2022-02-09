package com.mvc.app.service;

import java.util.List;

import com.mvc.app.entity.Employee;

public interface EmployeeService {
	List<Employee>  getListEmployees();
	void saveEmp(Employee emp);
	Employee getEmpById(long id);
	void deleteEmpById(Long id);
}
