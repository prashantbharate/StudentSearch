package com.example.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.Repo.StudentRepo;
import com.example.model.Student;

@RestController
public class StudentController {
	
	
	@Autowired
	private StudentRepo sr;
	
	@GetMapping("Student/{sem}")
	public ResponseEntity<List<Student>> findbySem(@PathVariable ("sem") Integer sem)
	{
		List<Student> ls= sr.findBySemester(sem);
		return new ResponseEntity<List<Student>>(ls,HttpStatus.ACCEPTED);
		
	}
	
	

}
