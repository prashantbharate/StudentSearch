package com.example.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.Repo.StudentRepo;
import com.example.model.Student;

public class StudentReoiml implements FindStudent {

	@Autowired
	private StudentRepo sr;
	
	@Override
	public List<Student> findStudentUsingSem(Integer semester) {
		// TODO Auto-generated method stub
		
		List<Student> st= sr.findBySemester(semester);
		return st;
				
		
		
	}

}
