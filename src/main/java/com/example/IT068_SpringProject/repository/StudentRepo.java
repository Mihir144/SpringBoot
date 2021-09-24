package com.example.IT068_SpringProject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.IT068_SpringProject.entity.Student;


@Repository
public interface StudentRepo extends JpaRepository<Student, Long> {
	
}
