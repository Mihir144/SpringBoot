package com.example.IT068_SpringProject;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.IT068_SpringProject.entity.Student;
import com.example.IT068_SpringProject.repository.StudentRepo;

@SpringBootTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class ApplicationTests {
	@Autowired
	StudentRepo stu;

	@Test
	@Order(1)
	public void AddData()
	{
		Student s = new Student();
		s.setStudentID("19IT068");
		s.setStudentDepartment("CE");
		s.setStudentName("Manan");
		stu.save(s);
		assertNotNull(stu.findById(1L).get());
	}

	@Test
	@Order(2)
	public void checkDatabaseSize()
	{
		List<Student> list = stu.findAll();
		assertEquals(list.size(), 1);
	}
	
//	@Test
//	public void whenNotNullName_thenNoConstraintViolations() {
//	    UserNotNull user = new UserNotNull("John");
//	    Set<ConstraintViolation<UserNotNull>> violations = validator.validate(user);
//	 
//	    assertThat(violations.size()).isEqualTo(0);
//	}

	@Test
	@Order(3)
	public void chageData()
	{
		Student Student = stu.findById(1L).get();
		Student.setStudentName("Raj");
		stu.save(Student);
		assertEquals("Raj", stu.findById(1L).get().getStudentName());
	}

	@Test
	@Order(4)
	public void getDataById()
	{
		assertTrue(stu.findById(1L).isPresent());
	}

	@Test
	@Order(5)
	public void deleteData()
	{
		stu.deleteById(1L);
		assertFalse(stu.existsById(1L));
	}

}
