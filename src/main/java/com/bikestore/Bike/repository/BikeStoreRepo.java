package com.bikestore.Bike.repository;

import com.bikestore.Bike.entity.Brand;
import com.bikestore.Bike.repository.custom.BikeStoreCustomRepo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface BikeStoreRepo extends JpaRepository<Brand, Integer>, BikeStoreCustomRepo {
    @Query(value = "select * from production.brands", nativeQuery = true)
    List<Brand> getAllBrands();

}
