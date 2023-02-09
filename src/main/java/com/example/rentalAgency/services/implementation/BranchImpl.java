package com.example.rentalAgency.services.implementation;

import com.example.rentalAgency.model.Branch;
import com.example.rentalAgency.repository.BranchRepository;
import com.example.rentalAgency.services.BranchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class BranchImpl implements BranchService  {

    @Autowired
    private BranchRepository branchRepository;

    @Override
    public Branch addBranch(Branch branch) {
       return branchRepository.save(branch);
    }

    @Override
    public Branch updateBranch(Long id, Branch branch) {
        Branch branch1 = branchRepository.findById(id).get();
        branch1.setBranchName(branch.getBranchName());
        branch1.setAddress(branch.getAddress());
        branch1.setRental(branch.getRental());
         return branchRepository.save(branch1);
    }

    @Override
    public void deleteBranchById(Long id) {
        branchRepository.deleteById(id);
    }

    @Override
    public List<Branch> findAll() {
        return  branchRepository.findAll();
    }
}
