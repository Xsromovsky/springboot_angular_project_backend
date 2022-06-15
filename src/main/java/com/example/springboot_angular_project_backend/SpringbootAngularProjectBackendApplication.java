package com.example.springboot_angular_project_backend;

import com.example.springboot_angular_project_backend.model.Employee;
import com.example.springboot_angular_project_backend.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//create some employees



@SpringBootApplication
public class SpringbootAngularProjectBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootAngularProjectBackendApplication.class, args);
    }


}
