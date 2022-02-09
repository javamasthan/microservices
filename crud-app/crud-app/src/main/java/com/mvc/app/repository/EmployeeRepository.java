package com.mvc.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mvc.app.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
	

}
