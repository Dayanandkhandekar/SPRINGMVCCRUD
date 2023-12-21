
package com.springmvccontroller;


import java.util.List;

import javax.persistence.Id;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.StringArrayPropertyEditor;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class RegistrationDTOController {
	@Autowired
	RegistrationService service;
	
	static {
		System.out.println("Inside Home contoller ");
	}
   
    @RequestMapping("/registration")
   String getRegistrationForm() {
    	
    	
	   return "registration";
   
   }/*
    //Using HTTPServletRequest 
    
    @RequestMapping( path = "/saveform",method=RequestMethod.POST)
  String saveForm(HttpServletRequest req , Model model) {
    	String email=req.getParameter("email"); //jsp page madhe name property la je name deto tech name same get parameter
    	System.out.println("Email=="+email);//madhun dyach
    	
    	String username=req.getParameter("username");
    	System.out.println("Username=="+username);
    	
    	String password=req.getParameter("password");
    	System.out.println("Password=="+password);
    	
    	String password_confirm=req.getParameter("password_confirm");
    	System.out.println("Password_Confirm=="+password_confirm);
    	
    	model.addAttribute("username", username);
    	model.addAttribute("email", email);
    	model.addAttribute("password", password);
    	model.addAttribute("password_confirm", password_confirm);
    	
    	return "display";
   }
    
    //second way Using Request Param 
    @RequestMapping( path = "/registrationform",method=RequestMethod.POST)
    String getDataUsingParam(@RequestParam("username")String username,@RequestParam("email")String email,@RequestParam("password")String password,@RequestParam("password_confirm")String password_confirm , Model model) { //he username ani form madhi name property la je name deu te same pahije
    	System.out.println("Username=="+username);
     	System.out.println("Email=="+email);
     	System.out.println("Password=="+password);
     	System.out.println("Password_Confirm=="+password_confirm);
     	
     	model.addAttribute("username", username);
    	model.addAttribute("email", email);
    	model.addAttribute("password", password);
    	model.addAttribute("password_confirm", password_confirm);
    	
    	return "display";
    }*/

    // Third way @modelAttributes
    @RequestMapping( path = "/registrationForm",method=RequestMethod.POST)
     String getDataUsingModelAttribute(@ModelAttribute RegistrationDTO register, Model model) {
    	
    int userID = register.getUserID();
    	model.addAttribute("userID", userID);
    	
    	String username = register.getUsername();
    	model.addAttribute("username", username);
    	
    	String email = register.getEmail();
    	model.addAttribute("email", email);
    	
    	String password = register.getPassword();
    	model.addAttribute("password", password);
    	
    	String password_confirm = register.getPassword_confirm();
    	model.addAttribute("password_confirm", password_confirm);
    	
    	  System.out.println("Registeration=="+register);
    	  
    	  
    	  
    	  service.addUser(register);
    	 // service.updateRegistrationDTO(0, register);
    	 // service.deleteRegistrationDTO(username);
    	 //service.list();
    	//  service.getRegistrationDTObyuserId(0);
      	return "redirect:list";
     }
    
    
    @RequestMapping("/list")
     String listStudents(Model model) {
    	List<RegistrationDTO> reg=service.list();
        model.addAttribute("reg", reg);
        return "list";
    }
    
    
    @RequestMapping("/delete/{userid}")
    RedirectView deleteUser(@PathVariable ("userid")int ID ,HttpServletRequest request) {
    	
    	System.out.println("inside delete "+ID);
    	service.deleteRegistrationDTO(ID);
    	
    	RedirectView view=new RedirectView();
    	  view.setUrl(request.getContextPath() +"/list");
		return view;
    	
    }
    @RequestMapping(value="/edit/{userId}",method = RequestMethod.GET)
    String edit(@PathVariable("userId") int userId,Model model) {
    	 RegistrationDTO register=service.getRegistrationDTObyuserId(userId);
    	 model.addAttribute("register", register);
    	
		return "edit";
    	 
    }
   
    @ExceptionHandler(Exception.class)
    String getExceptionHandler() {
    	System.out.println("Inside exception Handler");
    	
    	return "exception_handler";
    }

}








