package com.lenovo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.lenovo.beans.Employee;
import com.lenovo.dao.EmployeeDao;

@Controller

public class EmployeeController {
    
	
	//Inject the DAO from XML file
	@Autowired
	EmployeeDao dao;
	
	@RequestMapping("/empform")
	public String showform(Model model) {
		model.addAttribute("command",new Employee());
		return "empform";
	}
	
	/* 
	 * To save the user input into the database. Insert Query - saveEmployee() call will be done
	 *   */
	
	@RequestMapping(value="/saveEmployee", method=RequestMethod.POST)
	public String saveEmployee(@ModelAttribute("emp")Employee emp) {
		dao.saveEmployee(emp);
		return "redirect:/viewEmployee";
	}
	
	@RequestMapping(value="/viewEmployee")
	public String viewEmployee(Model model) {
		List<Employee>list=dao.getAllEmployees();
		model.addAttribute("list",list);
		return "viewEmployee";
	}
	@RequestMapping(value="/editEmployee/{id}")
	public String edit(@PathVariable int id,Model model) {
		Employee emp=dao.getEmployeeById(id);
		model.addAttribute("command", emp);
		return "empeditform";
	}
	@RequestMapping(value="/editsaveEmployee",method=RequestMethod.POST)
	public String editsaveEmployee(@ModelAttribute("emp")Employee emp) {
		dao.updateEmployee(emp);
		return"redirect:/viewEmployee";
	}
	@RequestMapping(value="/deleteEmployee/{id}",method=RequestMethod.POST)
	public String delete(@PathVariable int id) {
		dao.deleteEmployee(id);
		return"redirect:/viewEmployee";
	}
}
