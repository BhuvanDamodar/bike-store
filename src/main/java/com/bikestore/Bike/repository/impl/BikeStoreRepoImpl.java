package com.bikestore.Bike.repository.impl;

import com.bikestore.Bike.repository.custom.BikeStoreCustomRepo;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class BikeStoreRepoImpl implements BikeStoreCustomRepo {

    @Autowired
    private  EntityManager entityManager;


}
