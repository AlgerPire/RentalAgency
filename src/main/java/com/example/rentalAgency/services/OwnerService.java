package com.example.rentalAgency.services;


import com.example.rentalAgency.model.Owner;

import java.util.List;

public interface OwnerService {

    boolean addOwner(Owner owner);

    List<Owner> findAllOwners();

    Owner updateOwner(Long id, Owner owner);

    void deleteOwner(Long id);

}
