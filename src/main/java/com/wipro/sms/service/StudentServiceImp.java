package com.wipro.sms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.sms.dto.StudentDTO;
import com.wipro.sms.entities.Student;
import com.wipro.sms.repository.StudentRepository;

@Service
public class StudentServiceImp implements IStudentService {

	@Autowired
	private StudentRepository repo;
	
	@Override
	public Student addStudent(StudentDTO dto) {
		
		Student student = new Student();
		
			student.setUname(dto.getUname());
			student.setEmail(dto.getEmail());
			student.setPassword(dto.getPassword());
			student.setGender(dto.getGender());
			student.setDob(dto.getDob());
			student.setCourse(dto.getCourse());
			student.setPhone(dto.getPhone());
		
		return repo.save(student);
	}

	@Override
	public List<Student> getAllStudent() {
		
		return repo.findAll();
	}

}
