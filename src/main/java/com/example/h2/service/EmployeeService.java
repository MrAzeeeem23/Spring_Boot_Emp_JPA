package com.example.h2.service;

import com.example.h2.model.Employee;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public List<Employee> getEmployees() {
        return employeeRepository.findAll();
    }

    public Employee getEmployeeById(Long empId){
        return employeeRepository.findById(empId).orElse(null);
    }

    public Employee saveEmployee(Employee employee){
        return employeeRepository.save(employee);
    }

    public void deleteEmployee(Long empId){
        employeeRepository.deleteById(empId);
    }

    @Transactional
    public void updateEmployee(Long empId,Employee employee){

        Optional<Employee> optionalEmployee = employeeRepository.findById(empId);

        if(optionalEmployee.isPresent()){
            Employee exist = optionalEmployee.get();
            exist.setName(employee.getName());
            exist.setAge(employee.getAge());
            exist.setPhone(employee.getPhone());
            exist.setEmail(employee.getEmail());
            exist.setAddress(employee.getAddress());

            employeeRepository.save(exist);
        }
    }
}
