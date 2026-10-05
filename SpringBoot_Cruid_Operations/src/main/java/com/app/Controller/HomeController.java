package com.app.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.Model.Student;
import com.app.Service.studentser;

@RestController
public class HomeController {
	
	@Autowired
	studentser srv;
	
	@PostMapping("/student")
	public Student addStudent(@RequestBody Student stu) {
		return srv.addStudent(stu);
		
		
		
		
		
	}
	@GetMapping("/student")
	public List<Student> getAll(){
		
		return srv.getAll();
		
		
		
		
	}
	
	@PutMapping("/student")
	public Student update(@RequestBody Student stu) {
		
		return srv.updateStudent(stu);
		
		
		
	}
	
	@DeleteMapping("/student/{id}")
	public String deleteStudent(@PathVariable int id) {
	    srv.deleteStudent(id);
	    return "Student deleted successfully";
	}
	
	
	
	
	
	

}
