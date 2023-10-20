package com.studentinformation;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
//@RequestMapping("/StudentInfo")
public class StundentController {
	
	@RequestMapping("/Info")
	String StudentInfo(Model model) {
        List<Student> students = getStudentData(); 
        model.addAttribute("students", students);
        model.addAllAttributes(getStudentData());       
        return "StudentList"; 

}

	private List<Student> getStudentData() {
		
	    // Create 10 employee objects and add them to the list
		
		Student s1=new Student(1,"Arohi Magdum",22);
		Student s2=new Student(2,"Anushka Magdum",20);
		Student s3=new Student(3,"Atharv Magdum",17);
		Student s4=new Student(4,"Animesh Chougule",20);
		Student s5=new Student(5,"Abhinav Shedbale",31);
		Student s6=new Student(6,"Abhishek Patil",30);
		Student s7=new Student(7,"Amithi Kumbhojkar",10);
		Student s8=new Student(8,"Bharat Magdum",31);
		Student s9=new Student(9,"Smrudhhi Kothale",22);
		Student s10=new Student(10,"Dipali Patil",22);
	    ArrayList<Student> list = new ArrayList<>();
          list.add(s1);
          list.add(s2);
          list.add(s3);
          list.add(s4);
          list.add(s5);
          list.add(s6);
          list.add(s7);
          list.add(s8);
          list.add(s9);
          list.add(s10);
	    return list;
	}
}