package com.SangamOne.school.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.SangamOne.school.entity.SubjectDetails;
import com.SangamOne.school.repository.SubjectRepository;

@RestController
public class SubjectController {

	@Autowired
	SubjectRepository subjectRepository;
	
	@PostMapping("/addSubjects")
	public String addSubject(@RequestBody SubjectDetails subjectDetails) {
		subjectRepository.save(subjectDetails);
		return "Inserted";
	}

	@GetMapping("/viewSubject")
	public List<SubjectDetails> viewSubject(){
		return subjectRepository.findAll();
	}
}
