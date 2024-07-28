package com.bikestore.Bike.Controller;

import com.bikestore.Bike.Entity.Brand;
import com.bikestore.Bike.Service.BikeStoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class BikeStoreControllerV1 {

    @Autowired
    private BikeStoreService bikeStoreService;

    @GetMapping("/brands")
    public List<Brand> getAllBrands(){
        return bikeStoreService.getAllBrands();
    }

}
