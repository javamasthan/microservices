package com.mvc.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class DepartmentController {
	
	@GetMapping(value="/deparmentList")
	public String  getEmpList(Model model){
	//	model.addAttribute("empList",employeeService.getListEmployees());
		return "department";
	}

}
