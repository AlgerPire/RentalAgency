package com.example.rentalAgency.services.implementation;

import com.example.rentalAgency.model.Employee;
import com.example.rentalAgency.repository.EmployeeRepository;
import com.example.rentalAgency.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class EmployeeImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    PasswordEncoder passwordEncoder;

    public EmployeeImpl() {
        this.passwordEncoder = new BCryptPasswordEncoder();
    }

    @Override
    public List<Employee> findAll() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee findById(Long id) {
        return employeeRepository.findById(id).get();
    }

    @Override
    public Employee addEmployee(Employee employee) {
        if(employeeRepository.findEmployeeByUsername(employee.getUsername()) != null){
            System.out.println("Username ekziston");
            return employee;
        }
        else {
            String encodedPassword = this.passwordEncoder.encode(employee.getPassword());
            employee.setPassword(encodedPassword);
            return employeeRepository.save(employee);
        }

    }

    @Override
    public Employee updateEmployee(Long id, Employee employee) {
        Employee employee1 = employeeRepository.findById(id).get();
        employee1.setBranch(employee.getBranch());
        employee1.setFirstName(employee.getFirstName());
        employee1.setPassword(employee.getPassword());
        if(employeeRepository.findEmployeeByUsername(employee.getUsername())==null){
            employee1.setUsername(employee.getUsername());
        }
        else {
            System.out.println("Username ekziston");
        }
        employee1.setLastName(employee.getLastName());
        employeeRepository.save(employee1);
        return employee1;
    }

    @Override
    public void deleteEmployeeById(Long id) {
        employeeRepository.deleteById(id);
    }
}
