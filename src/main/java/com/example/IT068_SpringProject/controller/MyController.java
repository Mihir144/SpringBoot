package com.example.IT068_SpringProject.controller;
import com.example.IT068_SpringProject.dto.StudentDTO;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.IT068_SpringProject.entity.Student;
import com.example.IT068_SpringProject.repository.StudentRepo;

@CrossOrigin(origins="http://localhost:3000/")
@RestController
public class MyController {
	
	@Autowired
	StudentRepo s;
	
	@GetMapping("/student")
	public List<Student> getAll() {
		return s.findAll();
	}
	
	@GetMapping("/student/{id}")
    public Optional<Student> getCourseDetails(@PathVariable Long id){
        return s.findById(id);
    }
	
	@PostMapping("/student")
	public ResponseEntity<StudentDTO> addProduct(@RequestBody Student p) {
		s.save(p);
		StudentDTO sd = new StudentDTO();
		BeanUtils.copyProperties(p, sd);
		return ResponseEntity.ok(sd);
	}
	
}
