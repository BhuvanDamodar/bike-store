package com.bikestore.Bike.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "brands", schema = "production")
public class Brand {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "brand_id")
    private Integer brandId;

    @Column(name = "brand_name")
    private String brandName;
}
