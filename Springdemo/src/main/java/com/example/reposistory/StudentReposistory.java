package com.example.reposistory;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.bootdemo.dto.Student;
 

public interface StudentReposistory extends JpaRepository<Student, Integer> {

	 //public List<Student> findBName(String name);
	
	
	
}
