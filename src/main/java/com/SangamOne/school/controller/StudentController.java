package com.SangamOne.school.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.SangamOne.school.entity.StudentDetails;
import com.SangamOne.school.repository.StudentRepository;

@RestController
public class StudentController {

	
	@Autowired
	StudentRepository studentRepository;


	@PostMapping("/addStudents")
	public String addStudent1(@RequestBody StudentDetails studentDetails ) {
		studentRepository.save(studentDetails);
		return "Inserted";
	}

	@GetMapping("/viewStudents")
	public List<StudentDetails> getAllStudents() {
		return studentRepository.findAll();		
	}
}
