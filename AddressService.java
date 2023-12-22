package com.anand.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.anand.entity.Address;
import com.anand.repository.AddressRepository;


@Service
public class AddressService {
	
	@Autowired
	private AddressRepository addressRepository;
	
	public Address addAddress(Address address) {
		Address addressSavedToDB = this.addressRepository.save(address);
		return addressSavedToDB;
	}

}

