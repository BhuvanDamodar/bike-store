package com.bikestore.Bike.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
//@Table(name = "production.brands") --This is returning as production_brands
public class Brand {

    @Id
    @Column(name = "brand_id")
    private Integer brandId;

    @Column(name = "brand_name")
    private String brandName;
}
