package com.example.rentalAgency.dto;

import com.example.rentalAgency.model.enumeration.Gearbox;
import com.example.rentalAgency.model.enumeration.Status;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.validator.constraints.Range;

import javax.persistence.*;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
 public class CarDTO {
//
//    private Long id;
//    private String brand;
//    private String model;
//    private Integer year;
//    private String color;
//    private Status status;
//    private Integer mileage;
//    private String imageUrl;
//    private Integer feePerDay;
//    private Integer totalAmountFromCar;
//    private Gearbox gearbox;
//    private Branch branch;

    private String brand;
    private String model;
    private String branchName;
    private Gearbox gearbox;
    private String imageUrl;
    private Integer feePerDay;
    private Integer mileage;
}
