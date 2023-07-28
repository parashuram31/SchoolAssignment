package com.SangamOne.school.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.SangamOne.school.entity.TeachersDetails;
import com.SangamOne.school.repository.TeacherRepository;

@RestController
public class TeacherController {

	@Autowired
	TeacherRepository teacherRepository;
	
	@PostMapping("/addTeachers")
	public String addTeacher(@RequestBody TeachersDetails teacherDetails) {
		teacherRepository.save(teacherDetails);
		return "Success";
	}

	@GetMapping("/viewTeachers")
	public List<TeachersDetails> getAllTeacher(){
		return teacherRepository.findAll();
	}
}
