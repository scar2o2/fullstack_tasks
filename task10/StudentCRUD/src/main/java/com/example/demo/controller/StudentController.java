package com.example.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Student;
import com.example.demo.service.StudentService;

@RestController
@RequestMapping("/students")
public class StudentController {
	private final StudentService service;
	public StudentController(StudentService service) {
		this.service = service;
	}
	@PostMapping
	public Student createStudent(@RequestBody Student student) {
		return service.saveStudent(student);
	}
	@GetMapping
	public List<Student>getAllStudents(){
		return service.getAllStudents();
	}
	@GetMapping("/{id}")
	public Student getStudentById(@PathVariable int id) {
		return service.getStudent(id);
	}
	@PutMapping("/{id}")
	public Student updateStudent(@PathVariable int id,@RequestBody Student student) {
		student.setId(id);
		return service.updateStudent(student);
	}
	@DeleteMapping("/{id}")
	public String deleteStudent(@PathVariable int id) {
		service.deleteStudent(id);
		return "Student Deleted Successfully";
	}
	
	
}
