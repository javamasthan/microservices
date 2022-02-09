package com.mvc.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.mvc.app.repository.EmployeeRepository;

@SpringBootApplication
public class EmployeeManagementApplication implements CommandLineRunner {
	
	@Autowired
	private EmployeeRepository employeeRepository;

	public static void main(String[] args) {
		SpringApplication.run(EmployeeManagementApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		/*Employee emp=new Employee();
		emp.setFirstName("Anand");
		emp.setLastName("Kumar");
		emp.setEmail("anand@gmail.com");
		employeeRepository.save(emp);
		Employee emp1=new Employee();
		emp1.setFirstName("Siva");
		emp1.setLastName("Kumar");
		emp1.setEmail("siva@gmail.com");
		employeeRepository.save(emp1);
		Employee emp2=new Employee();
		emp2.setFirstName("Raj");
		emp2.setLastName("Kumar");
		emp2.setEmail("raj@gmail.com");
		employeeRepository.save(emp2);*/
		
		
		
	}

}
