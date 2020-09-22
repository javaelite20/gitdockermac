package com.example.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.*;

@RestController
public class MainController {

	@RequestMapping(value = "/ee", method = RequestMethod.GET)
	public Employee firstPage() {
		System.out.println("Hello World Application Running");
		
		Employee emp = new Employee(); emp.setName("emp1");
		  emp.setDesignation("manager"); emp.setEmpId("1"); emp.setSalary(3000);
		 

		return emp;
	}
}
