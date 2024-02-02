package com.example.namingconvention.controller;   // package name should be in lowercase

import com.example.namingconvention.model.Employee;
import com.example.namingconvention.repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
@RestController
@RequestMapping("/api/users")        //URLs are named with nouns and avoid the snake_case, camelCase.
                                    // Separate words with hyphens and Use lowercase letters.

//interface should start with the uppercase letter.
//class name should be started with uppercase

public class EmployeeController {
    @Autowired
    private EmployeeRepo employeeRepository;
    @GetMapping
    public List<Employee> getAllEmployees(){
        return employeeRepository.findAll();
    }
    @PostMapping
    public Employee createEmployee (@RequestBody Employee employee){
        return employeeRepository.save(employee);
    }
    @GetMapping("/{id}")
    public ResponseEntity<Optional<Employee>> getEmployeeById(@PathVariable long id){
        Optional<Employee> employee = employeeRepository.findById(id);
        return ResponseEntity.ok(employee);

    }
    }

