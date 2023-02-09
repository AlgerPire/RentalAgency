package com.example.rentalAgency.controller;

import com.example.rentalAgency.model.Owner;
import com.example.rentalAgency.services.implementation.OwnerImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/owner")
@CrossOrigin(origins = "http://localhost:4200")
public class OwnerController {

    @Autowired
    private OwnerImpl ownerImpl;

    @PostMapping("/addOwner")
    public HttpStatus addNewOwner(@RequestBody Owner owner){
        if(ownerImpl.addOwner(owner)){
            return HttpStatus.CREATED;
        }
        else {
            return HttpStatus.CONFLICT;
        }
    }

    @GetMapping("/listAll")
    public Iterable<Owner> listOwner(){
        return ownerImpl.findAllOwners();
    }

    @DeleteMapping("/deleteOwner/{id}")
    public ResponseEntity<String> deleteById(@PathVariable Long id){
        ownerImpl.deleteOwner(id);
        return new ResponseEntity<>("Deleted Successfully",HttpStatus.OK);
    }


}
