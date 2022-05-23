package com.watson.studentmanagement.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.watson.studentmanagement.model.Student;
import com.watson.studentmanagement.repository.StudentRepo;

@Service
public class StudentService {
	
	@Autowired
	private StudentRepo repo;
	
	public Student saveStudents(Student student) {
		return repo.save(student);
	}
	
	public List<Student> findAllStudents(){
		return repo.findAll();
	}
	
	public Student updateStudent(Student student) {
		return repo.save(student);
	}
	
	public void deleteStudent(long id) {
		repo.deleteById(id);
	}
}
