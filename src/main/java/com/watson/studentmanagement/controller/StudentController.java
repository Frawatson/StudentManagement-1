package com.watson.studentmanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.watson.studentmanagement.model.Student;
import com.watson.studentmanagement.service.StudentService;

@Controller
@RequestMapping("/manage")
public class StudentController {
	@Autowired
	private StudentService service;
	
	@GetMapping("/homepage")
	@ResponseBody
	public String register() {
		return "Welcome to Student Mangement created by Francis";
	}
	
	@PostMapping("/addstudent")
	@ResponseBody
	public Student addStudent(@RequestBody Student student) {
		return service.saveStudents(student);
		
	}
	
	@GetMapping("/liststudents")
	@ResponseBody
	public List<Student> listAllStudents(){
		return service.findAllStudents();
	}
	
	@PutMapping("/updatestudent")
	@ResponseBody
	public Student updateStudnet(@RequestBody Student student ) {
		service.updateStudent(student);
		return student;
	}
	
	@DeleteMapping("/deletestudent/{id}")
	@ResponseBody
	public String deleteStudent(@PathVariable("id") long id) {
		
		service.deleteStudent(id);
		
		return "Student with id: " + id + " was deleted sucessfully.";
	}
}
