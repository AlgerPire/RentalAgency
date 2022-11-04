package com.example.rentalAgency.repository;

import com.example.rentalAgency.model.Car;
//import com.example.rentalAgency.model.CarDTO;
import com.example.rentalAgency.model.CarDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CarRepository extends JpaRepository<Car,Long> {


    @Query(value = "SELECT c.* FROM Car c WHERE c.car_gearbox='AUTOMATIC'",nativeQuery = true)
    List<Car> findAllAutomaticCars();

    @Query(value = "SELECT c.* from Car c where c.car_name=:carName", nativeQuery=true)
    List<Car> findAllByModel(@Param("carName") String carName);

//    @Query(value = "select c.car_name,c.car_brand, b.branch_name from Car c inner join Branch b on c.branch_id=b.id  ",nativeQuery = true)
    @Query("select new com.example.rentalAgency.model.CarDTO(c.brand,c.model,c.branch.branchName) from Car c inner join Branch b on c.branch.id=b.id")
    List<CarDTO> findCarsDto();

    //query for mapstruct
//    @Query(value = "select c.* from Car c inner join Branch b on c.branch_id=b.id",nativeQuery = true)
//    List<Car> findCarsTest();







}
