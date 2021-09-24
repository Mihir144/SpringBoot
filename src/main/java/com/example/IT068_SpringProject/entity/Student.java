package com.example.IT068_SpringProject.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
@Entity
public class Student {
	private @Id @GeneratedValue Long id;
	private String studentName;
	private String studentID;
	private String StudentDepartment;
	
	public Student() {
		
	}
	public Long getId() {
		return id;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentID() {
		return studentID;
	}
	public void setStudentID(String studentID) {
		this.studentID = studentID;
	}
	public String getStudentDepartment() {
		return StudentDepartment;
	}
	public void setStudentDepartment(String studentDepartment) {
		StudentDepartment = studentDepartment;
	}
	public Student(String studentName, String studentID, String studentDepartment) {
		super();
		this.studentName = studentName;
		this.studentID = studentID;
		StudentDepartment = studentDepartment;
	}
	
	
}

