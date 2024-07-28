package com.bikestore.Bike.Repository.impl;

import com.bikestore.Bike.Entity.Brand;
import com.bikestore.Bike.Repository.custom.BikeStoreCustomRepo;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BikeStoreRepoImpl implements BikeStoreCustomRepo {

    @Autowired
    private  EntityManager entityManager;



}
