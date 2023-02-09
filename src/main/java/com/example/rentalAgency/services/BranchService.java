package com.example.rentalAgency.services;

import com.example.rentalAgency.model.Branch;
import org.springframework.beans.factory.BeanFactory;

import java.util.List;

public interface BranchService {

    Branch addBranch(Branch branch);

    Branch updateBranch(Long id, Branch branch);

    void deleteBranchById(Long id);

    List<Branch> findAll();

}
