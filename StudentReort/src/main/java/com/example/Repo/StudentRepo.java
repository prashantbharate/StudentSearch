package com.example.Repo;

import org.springframework.stereotype.Repository;

import com.example.model.Student;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

@Repository
public interface StudentRepo extends JpaRepository<Student, Integer> {

	@Query("select  from Student p where p.semester?=1")
	public List<Student> findBySemester(int semester);

}


