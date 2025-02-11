package com.bikestore.Bike.repository;

import com.bikestore.Bike.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CustomerRepo extends JpaRepository<Customer, Integer> {

    Optional<Customer> findByEmail(String email);

    Boolean existsByEmail(String email);
}
