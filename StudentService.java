package com.anand.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.anand.entity.Address;
import com.anand.entity.Student;
import com.anand.repository.StudentRepository;

@Service
public class StudentService {

	@Autowired
	private StudentRepository studentRepository;
	
	@Autowired
	private AddressService addressService;
	
	@Transactional
	public Student addStudent(Student student) throws Exception {
		Student studentSavedToDB = this.studentRepository.save(student);
		
		Address address = new Address();
		address.setId(123L);
		address.setAddress("Noida");
		address.setStudent(student);
		
		// calling addAddress() method 
		// of AddressService class
		this.addressService.addAddress(address);
		return studentSavedToDB;
	}
}

