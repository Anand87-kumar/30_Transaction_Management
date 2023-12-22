package com.anand.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.anand.entity.Address;

public interface AddressRepository extends JpaRepository<Address, Long> {

}

