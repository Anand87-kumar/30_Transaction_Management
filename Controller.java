package com.anand.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.anand.entity.Student;
import com.anand.service.StudentService;


@RestController
@RequestMapping("/api/student")
public class Controller {
	
	@Autowired
	private StudentService studentService;
	
	@PostMapping("/add")
	public ResponseEntity<Student> saveStudent(@RequestBody Student student) throws Exception{
		Student studentSavedToDB = this.studentService.addStudent(student);
		return new ResponseEntity<Student>(studentSavedToDB, HttpStatus.CREATED);
	}
}

