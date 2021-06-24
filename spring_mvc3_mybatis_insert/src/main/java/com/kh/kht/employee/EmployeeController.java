package com.kh.kht.employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * Handles requests for the application home page.
 */
@Controller
@RequestMapping(value = "/employee")
public class EmployeeController {
	
	@Autowired EmployeeService employeeService;
	
	@RequestMapping(value = "/insertemployee")
	public String insert(Model model) {
		
		int retResult = employeeService.insert();
		if(retResult == 1) {
			model.addAttribute("insertResult", "입력되었습니다.");
		} else {
			model.addAttribute("insertResult", "입력되지 않았습니다.");
		}
		return "employee/insertsuccess";
	}
}
