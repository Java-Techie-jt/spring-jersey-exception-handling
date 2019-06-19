package com.javatechie.spring.rest.api.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javatechie.spring.rest.api.model.Employee;

public interface EmployeeDao extends JpaRepository<Employee, Integer>{

	Employee findByName(String name);

}
