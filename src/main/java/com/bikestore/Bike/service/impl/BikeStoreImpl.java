package com.bikestore.Bike.service.impl;

import com.bikestore.Bike.entity.Brand;
import com.bikestore.Bike.repository.BikeStoreRepo;
import com.bikestore.Bike.service.BikeStoreService;
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

    @Override
    public Brand addBrand(Brand brand) {
        return bikeStoreRepo.save(brand);
    }
}
