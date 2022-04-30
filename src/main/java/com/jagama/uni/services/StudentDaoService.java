package com.jagama.uni.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.jagama.uni.resources.Student;

@Component
public class StudentDaoService {
	
	private static List<Student> Students = new ArrayList<>();
	private int studentCount = 3;


	static {
		Students.add(new Student("Jose Agama", 0, 16));
		Students.add(new Student("Francisco Pizarro", 1, 19));
		Students.add(new Student("Luis Quispe", 2, 20));
	}
	
	
	public List<Student> findAll(){
		return Students;
		
	};
	
	public Student findOne(int Id) {
		
		for (Student student:Students) {
			if(student.getId() == Id) {
				return student;
				
			}
			
		}
		return null;
		
	}
	
	public Student save(Student student) {
		if(student.getId()==null) {
			student.setId(++studentCount);
		}
		Students.add(student);
		return student;
	}
	
	

}
