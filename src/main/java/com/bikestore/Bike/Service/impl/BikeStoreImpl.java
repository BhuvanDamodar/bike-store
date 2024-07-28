package com.bikestore.Bike.Service.impl;

import com.bikestore.Bike.Entity.Brand;
import com.bikestore.Bike.Repository.BikeStoreRepo;
import com.bikestore.Bike.Service.BikeStoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BikeStoreImpl implements BikeStoreService {

    @Autowired
    private BikeStoreRepo bikeStoreRepo;

    @Override
    public List<Brand> getAllBrands() {
        return bikeStoreRepo.getAllBrands();
    }
}
