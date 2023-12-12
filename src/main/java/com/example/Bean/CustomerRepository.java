package com.example.Bean;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface CustomerRepository extends JpaRepository<Customer,Long> {

	Optional<Customer> findById(long id);

	boolean existsById(Long id);

	void deleteById(Long id);


}