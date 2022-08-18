package com.wipro.sms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.sms.dto.StudentDTO;
import com.wipro.sms.entities.Student;
import com.wipro.sms.service.IStudentService;

@RestController
@CrossOrigin
@RequestMapping("/api/v1/students")
public class StudentController {

	@Autowired
	private IStudentService service;
	
	@PostMapping("/add")
	private Student addStudent(@RequestBody StudentDTO dto)
	{
		return service.addStudent(dto);
	}
	
	@GetMapping("/getAll")
	private List<Student> getAllStudents()
	{
		return service.getAllStudent();
	}

}
