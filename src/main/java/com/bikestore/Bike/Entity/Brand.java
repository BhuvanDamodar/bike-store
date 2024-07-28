package com.bikestore.Bike.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "production.brands")
public class Brand {

    @Id
    private Integer brand_id;

    private String brand_name;
}
