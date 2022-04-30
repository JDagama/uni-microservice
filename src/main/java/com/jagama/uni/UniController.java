package com.jagama.uni;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.jagama.uni.exceptions.UserNotFoundException;
import com.jagama.uni.resources.Student;
import com.jagama.uni.services.StudentDaoService;

@RestController
public class UniController {
	
	@Autowired
	StudentDaoService StudentService;
	
	@GetMapping("/students")
	public List<Student> retrieveAllStudents(){
		return StudentService.findAll();
		
	}
	
	@GetMapping("/students/{id}")
	public Student getStudents(@PathVariable int id) {
		Student student = StudentService.findOne(id);
		
		if (student == null) {
			throw new UserNotFoundException("id-" + id);
			
		}
		
		return student;
	}

}
