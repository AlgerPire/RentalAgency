package com.example.rentalAgency.controller;

import com.example.rentalAgency.model.Customer;
import com.example.rentalAgency.services.implementation.CustomerImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    private CustomerImpl customerImpl;

    @PostMapping("/addNew")
    public ResponseEntity<Customer> addCustomer(@RequestBody Customer customer){
        return new ResponseEntity<>(customerImpl.addCustomer(customer), HttpStatus.OK);
    }

}
