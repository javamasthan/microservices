package com.mvc.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.mvc.app.entity.Employee;
import com.mvc.app.service.EmployeeService;

@Controller
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping(value="/employeeList")
	public String  getEmpList(Model model){
		model.addAttribute("empList",employeeService.getListEmployees());
		return "employee";
	}
	
	@GetMapping(value="/emp/add")
	public String  getEmpForm(Model model){
	model.addAttribute("emp",new Employee());
		return "addEmployee";
	}
	

	@PostMapping(value="/addEmp")
	public String  saveEmp(@ModelAttribute("emp") Employee emp,Model model){
		employeeService.saveEmp(emp);
		return "redirect:/employeeList";
	}
	
	@GetMapping(value="/emp/edit/{id}")
	public String  getEmpEditForm(@PathVariable("id") long id,Model model){
		Employee emp=employeeService.getEmpById(id);
		model.addAttribute("emp",emp);
		return "editEmployee";
	}
	
	@PostMapping(value="/editEmp/{id}")
	public String  editEmp(@PathVariable("id") long id,@ModelAttribute("emp") Employee emp,Model model){
		Employee dbEmp=employeeService.getEmpById(id);
		dbEmp.setEmail(emp.getEmail());
		dbEmp.setFirstName(emp.getFirstName());
		dbEmp.setLastName(emp.getLastName());
		dbEmp.setId(emp.getId());
		employeeService.saveEmp(dbEmp);
		return "redirect:/employeeList";
	}
	
	@GetMapping("/emp/delete/{id}")
	public String deleteStudent(@PathVariable Long id) {
		employeeService.deleteEmpById(id);
		return "redirect:/employeeList";
	}
 
}
