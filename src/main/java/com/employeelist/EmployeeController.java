
package com.employeelist;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class EmployeeController {
	
	@RequestMapping("/list")
	ModelAndView employeeInfo() {
	    List<Employee> employees = getEmployeeData();  
	    ModelAndView modelAndView = new ModelAndView();
	    modelAndView.addObject("employees", employees);  
	    modelAndView.setViewName("EmployeeList");
	    return modelAndView;
	}
private List<Employee> getEmployeeData() {
    // Create 10 employee objects and add them to the list
	
	Employee e1=new Employee(1,"Arohi Magdum",5000);
	Employee e2=new Employee(2,"Anushka Magdum",4000);
	Employee e3=new Employee(3,"Atharv Magdum",3000);
	Employee e4=new Employee(4,"Animesh Chougule",7000);
	Employee e5=new Employee(5,"Abhinav Shedbale",3000);
	Employee e6=new Employee(6,"Abhishek Patil",3000);
	Employee e7=new Employee(7,"Amithi Kumbhojkar",1000);
	Employee e8=new Employee(8,"Bharat Magdum",2000);
	Employee e9=new Employee(9,"Smrudhhi Kothale",2200);
	Employee e10=new Employee(10,"Dipali Patil",3300);
    ArrayList<Employee> list = new ArrayList<>();
      list.add(e1);
      list.add(e2);
      list.add(e3);
      list.add(e4);
      list.add(e5);
      list.add(e6);
      list.add(e7);
      list.add(e8);
      list.add(e9);
      list.add(e10);
      System.out.println("Employee List==="+list);
    return list;

}
@RequestMapping("/welcome")
String Welcome(Model model) {
	model.addAttribute("ID", 1);
	model.addAttribute("name", "abc");
 
	ArrayList<String>list=new ArrayList<String>();
	list.add("abc");
	list.add("pqr");
	
	model.addAttribute("list",list);
	
	return "welcome";

}

}
