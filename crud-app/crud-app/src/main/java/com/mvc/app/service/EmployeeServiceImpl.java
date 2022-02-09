package com.mvc.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.mvc.app.entity.Employee;
import com.mvc.app.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public List<Employee> getListEmployees() {
		return employeeRepository.findAll();
	}

	@Override
	public void saveEmp(Employee emp) {
		employeeRepository.save(emp);
	}

	@Override
	public Employee getEmpById(long id) {
		return employeeRepository.findById(id).orElseThrow(()-> new ResponseStatusException(HttpStatus.NOT_FOUND,"Emp Not with Given Id"+id));
	}

	@Override
	public void deleteEmpById(Long id) {
		employeeRepository.deleteById(id);
		
	}
	
	

}
