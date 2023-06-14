package com.qsp.Springdemo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.bootdemo.dto.Student;
 
 
import com.example.reposistory.StudentReposistory;
 

@RestController
public class controller {
	
	 
	
	 
	
   @Autowired
  StudentReposistory st;

  
	 

	 
	
	
	
	@PostMapping("/Studentsave")
	public String SaveStudent(@RequestBody Student s)
	{
		st.save(s);
		return "savedata";
		
	}
	
	@GetMapping("/gatestudent")
	public Student gateStudent(@RequestParam int id)
	{
		Optional<Student> o = st.findById(id);
		
		Student student= o.get();
		return student;
	}
	
	@DeleteMapping("/deleteStudent")
	public String DeleteStudent(@RequestParam int id)
	{
		st.deleteById(id);
		return "delete";
		
	}
	
	@PutMapping("/updateStudent")
	public String updateStudent(@RequestBody Student s) {
		st.save(s);
		return "saved";
	}
	
/*	 @GetMapping("/fetchStudent")
	 public List<Student> getStudentByName(@RequestParam String name){
		 
		 List<Student> student = st.findBName(name);
		 return student;
	 }
 
	
}
