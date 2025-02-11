package com.bikestore.Bike.controller;

import com.bikestore.Bike.entity.Brand;
import com.bikestore.Bike.service.BikeStoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class BikeStoreControllerV1 {

    @Autowired
    private BikeStoreService bikeStoreService;

    @GetMapping("/brands")
    public String getAllBrands(){
        return "This endpoint is secured";
    }

    @PostMapping("/brands")
    public Brand addBrand(@RequestBody Brand brand){
        return bikeStoreService.addBrand(brand);
    }

}
