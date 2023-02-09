package com.example.rentalAgency.repository;

import com.example.rentalAgency.model.Owner;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OwnerRepository extends JpaRepository<Owner,Long> {
    @Query(value = "Select o.email from Owner o where o.email=:email",nativeQuery = true)
    String findAllByEmailTest(@Param("email") String email);

}
