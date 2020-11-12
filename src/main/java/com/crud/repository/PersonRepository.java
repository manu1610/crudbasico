package com.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.crud.model.PersonVO;

@Repository
public interface PersonRepository extends JpaRepository<PersonVO, Integer>{
	
	
}
